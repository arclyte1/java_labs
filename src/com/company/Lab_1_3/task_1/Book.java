package com.company.Lab_1_3.task_1;

public class Book {
    private int pages;
    private String title;

    public Book(int pages, String title) {
        this.pages = pages;
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " + title + "\nPages: " + pages;
    }
}
