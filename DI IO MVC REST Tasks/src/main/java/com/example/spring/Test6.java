package com.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

//        person.callYourPet();

//        Pet cat1 = context.getBean("catBean",Pet.class);
//        cat1.say();
//        Pet cat2 = context.getBean("catBean",Pet.class);
//        cat2.say();


        context.close();

    }
}
