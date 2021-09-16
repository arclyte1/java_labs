package com.company.Lab_1_3.task_1;

public class Ball {
    private double radius;
    private String color;

    public Ball(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nRadius: " + radius;
    }
}
