package com.company.Lab_1_1;

public abstract class AbstractPerson implements HumanInterface {
    protected MyString name;

    public AbstractPerson(MyString name) {
        this.name = name;
    }

    @Override
    public abstract String think();

    @Override
    public MyString getName() {
        return name;
    }
}
