package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired

    private Pet pet;
    private String surname;
    private int age;

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        System.out.println("surnme setted");
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println("age settet");
        this.age = age;
    }

//    public void setPet(Pet pet) {
//        System.out.println("Class person : SetPEt");
//        this.pet = pet;
//    }

    @Autowired
    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Class person : SetPEt");
        this.pet = pet;
    }

//    @Autowired
//    public void anyMethodName(Pet pet) {
//        System.out.println("Class person : SetPEt from anyMethodName");
//        this.pet = pet;
//    }

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("person Bean created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean created");
    }

    public void callYourPet() {
        System.out.println("Privet pidor shersytanoi");
        pet.say();
    }
}
