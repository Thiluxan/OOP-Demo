package com.example;

public class Car {

    private String color;
    protected String model;
    public String name;
    int registrationNumber;

    public void run() {
        System.out.println("Car is Running");
    }

    public int getSpeed() {
        return 100;
    }

    public void printSpeed(int speed) {
        System.out.println("Car speed is " + speed);
    }
}
