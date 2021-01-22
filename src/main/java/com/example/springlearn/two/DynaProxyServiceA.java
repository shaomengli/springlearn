package com.example.springlearn.two;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxyServiceA implements InvocationHandler {
    private Object target;

    public Object bind(Object target){
        this.target=target;
        Object obj= Proxy.newProxyInstance(this.target.getClass().getClassLoader()
                ,this.target.getClass().getInterfaces(),this);
        return obj;
    }
    @Override
    public Object invoke(Object proxy,Method method,Object[] args)throws Throwable{
        Object result=null;
        System.out.println("method:"+method);
        System.out.println("args"+args);
        System.out.println("target:"+this.target);
        System.out.println("log start");
        result=method.invoke(this.target,args);
        System.out.println("log end");
        return result;
    }
//    public static void main(String[] args)throws Exception{
//        IService service= (IService) new DynaProxyServiceA().bind(new ServiceImplA());
//        service.service("CYW");
//    }
}
