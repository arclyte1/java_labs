package com.company.Lab_1_1;

import com.company.Lab_1_1.AbstractPerson;

public final class Employee extends AbstractPerson {

    private int age;
    private Position position;
    public enum Position {
        SELLER,
        OTHER
    }

    public Employee(String name, int age, Position position) {
        super(name);
        this.age = age;
        this.position = position;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + position.toString() +
                '}';
    }
}
