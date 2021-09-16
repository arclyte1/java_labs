package com.company.Lab_1_1;

public class ClientTest {

    public void test() {
        Client client = new Client("Bob", "some service", 123.123);
        System.out.println("Client test:\n" + client.think() + '\n' + client.getName() + '\n' + client.getService() + '\n' + client.getPrice());
    }

}
