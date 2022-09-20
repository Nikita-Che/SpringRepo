package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.tld");
        Dog mydog = context.getBean("dogBean", Dog.class);
        mydog.say();
//        Dog mydog1 = context.getBean("dogBean", Dog.class);
//
//        System.out.println("переменные ссылаются на один и тот же объект? " + (mydog == mydog1));
//        System.out.println(mydog);
//        System.out.println(mydog1);

        context.close();

    }
}
