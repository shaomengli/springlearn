package com.example.springlearn.two;

import org.springframework.stereotype.Component;

@Component
public class DirtyAir implements IAir{
    public String toString(){
        return "DirtyAir";
    }
}