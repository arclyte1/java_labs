package com.company.Lab_2_2;

import java.util.Arrays;

public final class MyString implements Comparable<MyString> {

    private final char[] string;
    public final int length;

    public MyString() {
        this.string = new char[0];
        length = 0;
    }

    public MyString(char[] string) {
        this.string = string;
        length = string.length;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (char c : string)
            str.append(c);
        return str.toString();
    }

    public MyString concat(MyString myString) {
        char[] str = myString.toCharArray();
        char[] res = Arrays.copyOf(string, length + str.length);
        System.arraycopy(str, 0, res, length, str.length);
        return new MyString(res);
    }

    public char charAt(int index){
        return string[index];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyString myString = (MyString) o;
        return Arrays.equals(string, myString.string);
    }

    public MyString trim() {
        return new MyString(Arrays.copyOf(string, string.length - 1));
    }

    public boolean isEmpty() {
        return string.length == 0;
    }

    public char[] toCharArray() {
        return string;
    }

    @Override
    public int compareTo(MyString o) {
        for (int i = 0; i < Math.min(o.length, length); i++)
            if (charAt(i) > o.charAt(i))
                return 1;
            else if (charAt(i) < o.charAt(i))
                return -1;
        if (length > o.length)
            return 1;
        else if (length < o.length)
            return -1;
        return 0;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(string);
    }

    public MyString substring(int start, int end) {
        char[] str = new char[end - start];
        System.arraycopy(string, start, str, 0, str.length);
        return new MyString(str);
    }

    public MyString substring(int start){
        return substring(start, length);
    }
}

