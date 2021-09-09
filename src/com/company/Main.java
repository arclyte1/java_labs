package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testPersonEx();
    }

    public static void testPerson() {
        Person person = new Person();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя");
        if (!person.setName(in.next())) {
            System.out.println("Неверное имя");
        }
        System.out.println("Введите возраст");
        if (!person.setAge(in.nextInt())) {
            System.out.println("Неверный возраст");
        }
        System.out.println("Введите рост");
        if (!person.setHeight(in.nextDouble())) {
            System.out.println("неверный рост");
        }

        if (person.isValid()) {
            person.info();
        }
    }

    public static void testPersonEx() {
        PersonEx person = new PersonEx();
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Введите имя");
            person.setName(in.next());
            System.out.println("Введите возраст");
            person.setAge(in.nextInt());
            System.out.println("Введите рост");
            person.setHeight(in.nextDouble());

        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalNameException e) {
            e.printStackTrace();
        }
        finally {
            person.info();
        }
    }
}
