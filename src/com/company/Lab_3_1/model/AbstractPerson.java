package com.company.Lab_3_1.model;

public abstract class AbstractPerson implements HumanInterface {
    private String name;

    public AbstractPerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract String think();
}
