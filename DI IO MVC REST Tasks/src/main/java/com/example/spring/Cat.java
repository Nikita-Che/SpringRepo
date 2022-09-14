package com.example.spring;

public class Cat implements Pet{

    public Cat(){
        System.out.println("Cat bean Created");
    }
    @Override
    public void say() {
        System.out.println("miy miy!!!");
    }
}
