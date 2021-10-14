package com.company.Lab_1_1;

import com.company.Lab_1_1.AbstractPerson;

public final class Employee extends AbstractPerson {

    private int age;
    private Position position;
    private String department;
    private String phone;
    private PersonEx.Gender gender;

    public enum Position {
        SELLER,
        OTHER
    }

    public Employee(String name, int age, Position position, String department, String phone, PersonEx.Gender gender) {
        super(name);
        this.age = age;
        this.position = position;
        this.department = department;
        this.phone = phone;
        this.gender = gender;
    }

    @Override
    public String think() {
        return "Я работник";
    }

    public int getAge() {
        return age;
    }

    public Position getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getPhone() {
        return phone;
    }

    public PersonEx.Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + position.toString() +
                '}';
    }
}
