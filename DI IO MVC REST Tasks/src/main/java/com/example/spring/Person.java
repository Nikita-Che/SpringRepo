package com.example.spring;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("surnme setted");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("age settet");
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("Class person : SetPEt");
        this.pet = pet;
    }

//    public Person(Pet pet) {
//        System.out.println("person bean created");
//        this.pet = pet;
//    }

        public Person() {
        System.out.println("person bean created");
    }
    public void callYourPet(){
        System.out.println("Privet pidor shersytanoi");
        pet.say();
    }
}
