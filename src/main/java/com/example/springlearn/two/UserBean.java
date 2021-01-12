package com.example.springlearn.two;

import javafx.application.Application;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("InitializingBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DisposableBean");
    }

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        BeanFactory factory=context;
        UserBean user=(UserBean)factory.getBean("user");
        user.destroy();
    }
}
