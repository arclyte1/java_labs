package com.company.Lab_2_2;

public class Main {

    public static void main(String[] args) {
	    MyString myString1 = new MyString("string1".toCharArray());
	    MyString myString2 = new MyString("string2".toCharArray());
	    System.out.println(myString1.concat(myString2).toString());
	    System.out.println(myString1.equals(myString2));
	    System.out.println(myString1.trim());
	    MyString emptyString = new MyString();
	    System.out.println("" + myString1.isEmpty() + "\n" + emptyString.isEmpty());
	    System.out.println(myString1.substring(1, 3).toString());
	    System.out.println(myString1.substring(2).toString());
    }
}
