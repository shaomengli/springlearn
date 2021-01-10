package com.example.springlearn.two;

import java.util.concurrent.ExecutionException;

public class ProxyServiceA implements IService{

    private IService service;

    public ProxyServiceA(IService service){
        super();
        this.service=service;
    }

    @Override
    public void service(String name) throws ExecutionException {
        System.out.println("log start");
        service.service(name);
        System.out.println("log end");
    }
}
