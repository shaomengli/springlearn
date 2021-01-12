package com.example.springlearn.four;

import com.example.springlearn.two.CleanAir;
import com.example.springlearn.two.DirtyAir;
import com.example.springlearn.two.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {
    @Bean
    public CleanAir cleanAir(){
        return new CleanAir();
    }

    @Bean
    public DirtyAir dirtyAir(){
        return new DirtyAir();
    }

    @Bean
    public Person person(){
        return new Person(cleanAir());
    }
}
