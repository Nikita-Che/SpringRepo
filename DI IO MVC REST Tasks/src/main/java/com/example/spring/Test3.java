package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Person person = new Person(new Dog());
//        person.callYourPet();

        System.out.println("__________________________________");

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.tld");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person1 = new Person(pet);
//        person1.callYourPet();
//        context.close();

        System.out.println("__________________________________");

        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.tld");
        Person person2 = context1.getBean("myPerson",Person.class);
        person2.callYourPet();

        System.out.println(person2.getSurname());
        System.out.println(person2.getAge());
        context1.close();

    }
}
