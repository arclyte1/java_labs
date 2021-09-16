package com.company.Lab_1_3.task_2;

public class TestAuthor {

    public void test() {
        System.out.println("Author test:");
        try {
            Author author = new Author("", "aaa@mail.com", 'M');
            System.out.println(author.toString());
            System.out.println("Автор:\n" +
                    "Имя: " + author.getName() + '\n' +
                    "Эл. почта: " + author.getEmail() + '\n' +
                    "Пол: " + author.getGender());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            Author author = new Author("Bob", "aaa@mail.com", 'O');
            System.out.println(author.toString());
            System.out.println("Автор:\n" +
                    "Имя: " + author.getName() + '\n' +
                    "Эл. почта: " + author.getEmail() + '\n' +
                    "Пол: " + author.getGender());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            Author author = new Author("Bob", "aaa@mail.com", 'M');
            author.setEmail("");
            System.out.println(author.toString());
            System.out.println("Автор:\n" +
                    "Имя: " + author.getName() + '\n' +
                    "Эл. почта: " + author.getEmail() + '\n' +
                    "Пол: " + author.getGender());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            Author author = new Author("Bob", "aaa@mail.com", 'M');
            System.out.println(author.toString());
            System.out.println("Автор:\n" +
                    "Имя: " + author.getName() + '\n' +
                    "Эл. почта: " + author.getEmail() + '\n' +
                    "Пол: " + author.getGender());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
