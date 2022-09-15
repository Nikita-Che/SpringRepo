package com.example.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
//@Scope("prototype")
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Dog bean Created");
    }

    @Override
    public void say() {
        System.out.println("Gaf GAf bla");
    }


    @PostConstruct
    public void init() {
        System.out.println("Class DOG: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class DOG: destroy method");
    }


    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
