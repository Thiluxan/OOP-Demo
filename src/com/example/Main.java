package com.example;

public class Main {

    public static void main(String[] args) {
        Car carOne = new Car();
        carOne.run();
        int carOneSpeed = carOne.getSpeed();
        System.out.println("Car One Speed: " + carOneSpeed);
        carOne.printSpeed(250);
        System.out.println("---------------------------------------------");

        Car carTwo = new Car();
        carTwo.run();
        int carTwoSpeed = carTwo.getSpeed();
        System.out.println("Car Two Speed: " + carTwoSpeed);
        carTwo.printSpeed(300);

        Square squareOne = new Square();
        squareOne.calculateArea(20);
        int squareOnePerimeter = squareOne.calculatePerimeter(20);
        System.out.println("Perimeter of square one = " + squareOnePerimeter);
        squareOne.printLength(20);
        System.out.println("-------------------------------------------");

        Square squareTwo = new Square();
        squareTwo.calculateArea(10);
        int squareTwoPerimeter = squareTwo.calculatePerimeter(10);
        System.out.println("Perimeter of square two = " + squareTwoPerimeter);

        Rectangle rectangleA = new Rectangle(20, 10);
        rectangleA.calculatePerimeter();
        rectangleA.calculateArea();
        rectangleA.print();
        System.out.println("********************************");

        Rectangle rectangleB = new Rectangle(40, 10);
        rectangleB.calculateArea();
        rectangleB.calculatePerimeter();
        rectangleB.print();
        System.out.println("*********************************");

        Rectangle rectangleC = new Rectangle();
        rectangleC.print();
        rectangleC.calculateArea();

        Number number = new Number();
        number.addNumbers(10,20);
        number.addNumbers(10,20,30);

        Number number1 = new Number(10,20);
        number1.addNumbers1();

        Number number2 = new Number(10,20,30);
        number2.addNumbers1();
    }
}
