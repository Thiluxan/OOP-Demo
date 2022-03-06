package com.example;

public class Number {

    int num1;
    int num2;
    int num3;

    public Number(){}

    public Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void addNumbers(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public void addNumbers(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }

    public void addNumbers1() {
        int result = this.num1 + this.num2 + this.num3;
        System.out.println(result);
    }
}
