package com.example.spring;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{
    private String name;

    public Dog(){
        System.out.println("Dog bean Created");
    }

    @Override
    public void say() {
        System.out.println("Gaf GAf bla");
    }



//    public void init() {
//        System.out.println("Class DOG: init method");
//    }
//
//    public void destroy() {
//        System.out.println("Class DOG: destroy method");
//    }


    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
