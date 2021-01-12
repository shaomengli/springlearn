package com.example.springlearn.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Person {
    public IAir air;

    //@Autowired
    public Person(IAir air){
        this.air=air;
    }

    public Person() {

    }
}
