package com.company;

public class Client extends AbstractPerson {

    private String service;
    private float price;

    public Client(String name, String service, float price) {
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

    public float getPrice() {
        return price;
    }
}
