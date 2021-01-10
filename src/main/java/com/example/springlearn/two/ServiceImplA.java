package com.example.springlearn.two;

import java.util.concurrent.ExecutionException;

public class ServiceImplA implements IService{

    @Override
    public void service(String name) throws ExecutionException {
        System.out.println("ServiceImplA name"+name);
    }
}
