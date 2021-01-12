package com.example.springlearn.two;

import org.springframework.stereotype.Component;

//@Component
public class CleanAir implements IAir{
    @Override
    public String toString(){
        return "CleanAir";
    }
}