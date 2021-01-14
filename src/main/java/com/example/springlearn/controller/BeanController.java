package com.example.springlearn.controller;

import com.example.springlearn.four.AppConf;
import com.example.springlearn.six.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {
    @Autowired
    private AppConf appConf;

    @Autowired
    private UserBean userBean;

    @RequestMapping("bean1")
    @ResponseBody
    public String testBean(){
        return appConf.person().air.toString();
    }

    @RequestMapping("bean2")
    @ResponseBody
    public String testBean2(){

        return userBean.getName();
    }
}
