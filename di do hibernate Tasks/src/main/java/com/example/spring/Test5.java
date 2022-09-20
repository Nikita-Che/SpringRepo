package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.tld");

        Dog mydog = context.getBean("myPet", Dog.class);
        mydog.say();

        Dog your = context.getBean("myPet", Dog.class);
        your.say();

        context.close();



    }
}
