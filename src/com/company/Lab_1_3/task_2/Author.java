package com.company.Lab_1_3.task_2;

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) throws IllegalArgumentException {
        if (gender != 'M' && gender != 'F' && gender != 'U')
            throw new IllegalArgumentException("Invalid gender");
        if (name.isEmpty())
            throw new IllegalArgumentException("Invalid name");
        if (email.isEmpty())
            throw new IllegalArgumentException("Invalid email");
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if (email.isEmpty())
            throw new IllegalArgumentException("Invalid email");
        this.email = email;
    }

    @Override
    public String toString() {
        return "Автор:\n" +
                "Имя: " + name + '\n' +
                "Эл. почта: " + email + '\n' +
                "Пол: " + gender;
    }

}
