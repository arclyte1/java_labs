package com.company;

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
