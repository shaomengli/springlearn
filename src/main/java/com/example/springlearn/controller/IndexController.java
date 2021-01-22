package com.example.springlearn.controller;

import com.example.springlearn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Serializable;

@Controller
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, Serializable> redisCacheTemplate;

    @RequestMapping(value="/redistest.do",method= RequestMethod.GET)
    public String getallusers(Model model){
        User user=new User(1,"小明",27);
        String strkey="stringuser";
        stringRedisTemplate.opsForValue().set(strkey,user.toString());
        final String valueStr=stringRedisTemplate.opsForValue().get(strkey);
        model.addAttribute(strkey,valueStr);
        String objkey="objuser";
        redisCacheTemplate.opsForValue().set(objkey,user);
        user=(User)redisCacheTemplate.opsForValue().get(objkey);
        model.addAttribute(objkey,user);
        return "index";
    }
}
