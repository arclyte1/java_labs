package com.company.Lab_7;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public Object clone() {
        return new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        xSpeed = 0;
        ySpeed = 1;
    }

    @Override
    public void moveDown() {
        xSpeed = 0;
        ySpeed = -1;
    }

    @Override
    public void moveLeft() {
        xSpeed = -1;
        ySpeed = 0;
    }

    @Override
    public void moveRight() {
        xSpeed = 1;
        ySpeed = 0;
    }
}
