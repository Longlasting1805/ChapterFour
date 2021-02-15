package com.company;

public class Arithmetic {
    private double firstNumber;
    private double secondNumber;

    public Arithmetic(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }


    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double divideTwoNumbers() {
        double divide= firstNumber / secondNumber;
        return divide;
    }

    public double multiplyTwoNumbers() {
        double multiply = firstNumber * `   secondNumber;
        return multiply;
    }

    public double addTwoNumbers() {
        double add = firstNumber + secondNumber;
        return add;
    }

    public double subtractTwoNumbers() {
        double subtract = firstNumber - secondNumber;
        return subtract;
    }
}
