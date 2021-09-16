package com.company.Lab_1_1;

import java.util.Scanner;

public class PersonTest {

    public void test() {
        Person person = new Person();

        System.out.println("Person test:\nsetName(\"\"): " + person.setName(""));
        System.out.println("\nsetName(\"Bob\"): " + person.setName("Bob"));
        System.out.println("\nsetHeight(10.5): " + person.setHeight(10.5));
        System.out.println("\nsetHeight(1): " + person.setHeight(1));
        System.out.println("\nsetAge(500): " + person.setAge(500));
        System.out.println("\nisValid(): " + person.isValid());
        System.out.println("\nsetAge(5): " + person.setAge(5));
        System.out.println("\nisValid(): " + person.isValid());
        System.out.printf("Имя: %s\nРост: %f\nВозраст: %d\n", person.getName(), person.getHeight(), person.getAge());
        person.info();
    }

}
