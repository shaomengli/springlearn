package com.example.springlearn.controller;

import com.example.springlearn.seven.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("helloworld")
public class HelloWorldController {
    @RequestMapping(value="/hello4",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> hello(Model model){
        Map<String,Object> map=new HashMap<>();
        map.put("users", User.getUsers());
        return map;
    }
}
