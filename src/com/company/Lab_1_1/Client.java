package com.company.Lab_1_1;

import com.company.Lab_1_1.AbstractPerson;

public class Client extends AbstractPerson {

    private String service;
    private double price;

    public Client(MyString name, String service, double price) {
        super(name);
        this.service = service;
        this.price = price;
    }

    @Override
    public String think() {
        return "Я клиент";
    }

    public String getService() {
        return service;
    }

    public double getPrice() {
        return price;
    }
}
