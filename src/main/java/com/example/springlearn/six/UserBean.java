package com.example.springlearn.six;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class UserBean implements BeanNameAware, BeanFactoryAware,
        InitializingBean, DisposableBean, ApplicationContextAware {
    //@Value("123")
    private String name;

    public String getName() {
        return name;
    }
    @Value("123")
    public void setName(String name) {
        this.name = name;
        System.out.println("----------"+name);
    }

    public UserBean(String name) {
        this.name = name;
        System.out.println("--------------------------带参构造器");
    }

    public UserBean() {
        System.out.println("--------------------------不带参构造器");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("--------------------------BeanFactoryAware被调用");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("--------------------------BeanNameAware被调用");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("--------------------------DisposableBean被调用");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("--------------------------InitializingBean被调用");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("--------------------------setApplicationContext被调用");
    }

    @PostConstruct
    public void myInit(){
        System.out.println("--------------------------myInit被调用");
    }

    @PreDestroy
    public void myDestory(){
        System.out.println("--------------------------myDestory被调用");
    }
}
