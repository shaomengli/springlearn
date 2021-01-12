package com.example.springlearn.controller;

import com.example.springlearn.four.AppConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {
    @Autowired
    private AppConf appConf;
    @RequestMapping("bean1")
    @ResponseBody
    public String testBean(){
        return appConf.person().air.toString();
    }
}
