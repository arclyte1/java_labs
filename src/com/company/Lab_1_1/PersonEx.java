package com.company.Lab_1_1;

import com.company.Lab_1_1.IllegalNameException;

public class PersonEx {
    private int age = 0;
    private double height = 0;
    private String name = "";
    static int MAX_AGE = 200;
    static double MAX_HEIGHT = 3.2;
    Gender gender;
    public enum Gender {
        MALE(1, "Мужчина"),
        FEMALE(2, "Женщина"),
        OTHER(1024, "Другой");
        private final int intValue;
        private final String value;

        private Gender(int intValue, String value) {
            this.intValue = intValue;
            this.value = value;
        }

        public int getValue() {
            return intValue;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public PersonEx() {
        this.gender = Gender.OTHER;
    }

    public void info() {
        System.out.printf("Имя: %s\nРост: %f\nВозраст: %d\nГендер: %s\n", this.getName(), this.getHeight(), this.getAge(), this.gender.toString());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age > MAX_AGE || age < 0)
            throw new IllegalArgumentException("Invalid age");
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws IllegalArgumentException{
        if (height > MAX_HEIGHT || height <= 0)
            throw new IllegalArgumentException("Invalid height");
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameException {
        if (name.isEmpty())
            throw new IllegalNameException("Invalid name, string is empty");
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
