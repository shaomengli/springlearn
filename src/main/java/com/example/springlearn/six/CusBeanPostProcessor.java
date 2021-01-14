package com.example.springlearn.six;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CusBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException {
        if(bean.getClass().equals(UserBean.class)){
            System.out.println("postProcessBeforeInitialization被调用");
        }
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException {
        if(bean.getClass().equals(UserBean.class)){
            System.out.println("postProcessAfterInitialization被调用");
        }
        return bean;
    }
}
