package com.example.spring;

public class Dog implements Pet{

    public Dog(){
        System.out.println("Dog bean Created");
    }
    @Override
    public void say() {
        System.out.println("Gaf GAf bla");
    }
}
