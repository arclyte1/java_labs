package com.company.Lab_6_2;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> a = new MyArrayList<>();
        System.out.println(a.toString() + '\n' + a.isEmpty());
        a.add(1);
        a.add(2);
        a.add(5);
        System.out.println(a.toString() + '\n' + a.isEmpty() + '\n' + a.size());
        a.add(123, 1);
        System.out.println(a.toString());
        a.clear();
        System.out.println(a.toString() + '\n' + a.isEmpty() + '\n' + a.size());
    }

}
