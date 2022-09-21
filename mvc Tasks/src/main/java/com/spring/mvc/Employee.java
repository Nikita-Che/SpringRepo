package com.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String,String> departments;
    private String[] languages;

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    private Map<String,String> carBrands;
    private String carBrand;

    public Employee() {
        departments = new HashMap<>();
        departments.put("information tehnology","it");
        departments.put("sales  tehnology","salesss");
        departments.put("humanresorces","HR");
        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("AUDI", "AUDI");
        carBrands.put("MERSEDES-BENZ", "MB");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
