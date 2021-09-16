package com.company.Lab_1_1;

public abstract class AbstractPerson implements HumanInterface {
    protected String name;

    public AbstractPerson(String name) {
        this.name = name;
    }

    @Override
    public abstract String think();

    @Override
    public String getName() {
        return name;
    }
}
