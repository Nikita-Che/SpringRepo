package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {

        Pet pet = new Dog();
        pet.say();
        Pet pet1 = new Cat();
        pet1.say();

    }
}
