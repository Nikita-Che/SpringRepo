package com.example.spring;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{

    public Cat(){
        System.out.println("Cat bean Created");
    }
    @Override
    public void say() {
        System.out.println("miy miy!!!");
    }
}
