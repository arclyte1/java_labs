package com.company;

public final class Employee extends AbstractPerson {

    private final String department;
    private final Position position;
    public enum Position {
        SELLER,
        OTHER
    }

    public Employee(String name, String department, Position position) {
        super(name);
        this.department = department;
        this.position = position;
    }

    @Override
    public String think() {
        return "Я работник";
    }

    public String getDepartment() {
        return department;
    }

    public Position getPosition() {
        return position;
    }
}
