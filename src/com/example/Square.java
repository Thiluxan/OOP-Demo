package com.example;

public class Square {

    int length;

    public void calculateArea(int lenght) {
        int area = lenght * lenght;
        System.out.println("Area of square = " + area);
    }

    public int calculatePerimeter(int length) {
        int perimeter = length * 4;
        return perimeter;
    }

    public void printLength(int length) {
        System.out.println("Length = " + length);
    }
}
