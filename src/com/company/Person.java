package com.company;

public class Person {
    private int age;
    private double height;
    private String name;
    static int MAX_AGE = 200;
    static double MAX_HEIGHT = 3.2;

    public boolean validAge() {
        return this.age <= MAX_AGE;
    }

    public boolean validHeight() {
        return this.height <= MAX_HEIGHT;
    }

    public void info() {
        System.out.printf("Имя: %s\nРост: %f\nВозраст: %d", this.name, this.height, this.age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
