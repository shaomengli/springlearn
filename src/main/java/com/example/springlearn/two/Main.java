package com.example.springlearn.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main {

    @Autowired
    private
    Person person;

    @RequestMapping("testIOC")
    @ResponseBody
    public String testIOC(){
        return person.air.toString();
    }
}
