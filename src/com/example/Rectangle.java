package com.example;

public class Rectangle {

    int length;
    int width;

    public Rectangle(){}

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        int area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }

    public void calculatePerimeter() {
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public void print() {
        System.out.println("This is a rectangle");
    }
}
