package com.company.Lab_1_1;

import java.util.Scanner;

public class PersonExTest {

    public void test() {
        PersonEx person = new PersonEx();

        System.out.println("PersonEx test:");
        try {
            System.out.println("\nsetName(\"\")");
            person.setName("");
        }
        catch (IllegalArgumentException | IllegalNameException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("\nsetName(\"Bob\")");
            person.setName("Bob");
        }
        catch (IllegalArgumentException | IllegalNameException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("\nsetAge(500)");
            person.setAge(500);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("\nsetAge(5)");
            person.setAge(5);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("\nsetHeight(50.678)");
            person.setHeight(50.678);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("\nsetHeight(2)");
            person.setHeight(2);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("\nsetGender(PersonEx.Gender.FEMALE)");
            person.setGender(PersonEx.Gender.FEMALE);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("Имя: %s\nРост: %f\nВозраст: %d\nГендер: %s", person.getName(), person.getHeight(), person.getAge(), person.gender.toString());
        person.info();
    }

}
