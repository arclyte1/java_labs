package com.company.Lab_6_2;

public class MyArrayList<E> {
    private int arraySize;
    private int elementCount;
    private Object[] array;

    public MyArrayList(int arraySize) {
        this.elementCount = 0;
        this.arraySize = arraySize;
        array = new Object[arraySize];
    }

    public MyArrayList() {
        this(10);
    }

    public void add(E item) {
        elementCount++;
        if (elementCount > arraySize)
            expandArray();
        array[elementCount - 1] = item;
    }

    public void add(E item, int index) {
        elementCount++;
        if (elementCount > arraySize)
            expandArray();
        System.arraycopy(array, index, array, index + 1, elementCount - index - 1);
        array[index] = item;
    }

    private void expandArray() {
        Object[] newArray = new Object[arraySize * 2];
        System.arraycopy(array, 0, newArray, 0, arraySize);
        arraySize *= 2;
        array = newArray;
    }

    public void clear() {
        this.elementCount = 0;
        this.arraySize = 10;
        array = new Object[arraySize];
    }

    public boolean isEmpty() {
        return elementCount == 0;
    }

    public int size() {
        return elementCount;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "";
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < elementCount - 1; i++)
            s.append(array[i].toString()).append(", ");
        s.append(array[elementCount - 1]);
        return s.toString();
    }
}
