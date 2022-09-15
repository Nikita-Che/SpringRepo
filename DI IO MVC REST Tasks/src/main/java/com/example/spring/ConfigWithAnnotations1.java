package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.tld");

//        Cat myCat = context.getBean("cat",Cat.class);
//        myCat.say();
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());


        context.close();

    }
}
