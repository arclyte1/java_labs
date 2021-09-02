package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Person person = new Person();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя");
        person.setName(in.next());

        System.out.println("Введите возраст");
        person.setAge(in.nextInt());
        if (!person.validAge())
            throw new IOException("Некорректный возраст");

        System.out.println("Введите рост");
        person.setHeight(in.nextDouble());
        while(!person.validHeight()){
            System.out.println("Введите корректный рост");
            person.setHeight(in.nextDouble());
        }

        person.info();
    }
}
