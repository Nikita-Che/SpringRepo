package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.tld");

        Pet myPet = context.getBean("myPet",Pet.class);
        myPet.say();
        myPet.say();

    }


}
