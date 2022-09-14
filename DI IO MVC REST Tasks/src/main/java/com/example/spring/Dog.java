package com.example.spring;

public class Dog implements Pet{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(){
        System.out.println("Dog bean Created");
    }
    @Override
    public void say() {
        System.out.println("Gaf GAf bla");
    }
}
