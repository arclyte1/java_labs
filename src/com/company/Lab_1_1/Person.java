package com.company.Lab_1_1;

public class Person {
    private int age = 0;
    private double height = 0;
    private String name = "";
    static int MAX_AGE = 200;
    static double MAX_HEIGHT = 3.2;

    private boolean isValidAge() {
        return this.age <= MAX_AGE && this.age != 0;
    }

    private boolean isValidHeight() {
        return this.height <= MAX_HEIGHT && this.height != 0;
    }

    public boolean isValid() {
        return isValidAge() && isValidHeight() && !this.getName().isEmpty();
    }

    public void info() {
        System.out.printf("Имя: %s\nРост: %f\nВозраст: %d", this.getName(), this.getHeight(), this.getAge());
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        if (isValidAge()) {
            return true;
        } else {
            this.age = oldAge;
            return false;
        }
    }

    public double getHeight() {
        return height;
    }

    public boolean setHeight(double height) {
        double oldHeight = this.height;
        this.height = height;
        if (isValidHeight()) {
            return true;
        } else {
            this.height = oldHeight;
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name.isEmpty())
            return false;
        this.name = name;
        return true;
    }

}
