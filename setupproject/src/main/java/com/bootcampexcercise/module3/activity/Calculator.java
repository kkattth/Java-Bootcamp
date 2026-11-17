package com.bootcampexcercise.module3.activity;

public class Calculator {

    private String calculatorType;
    public static final String CALC_TYPE_BASIC = "Basic";

    // default constructor
    public Calculator() {
        calculatorType = CALC_TYPE_BASIC;
    }

    // TODO: Create a Parameterized constructor accepting calculatorType
    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }
    // TODO: Create a Getter for CalculatorType
    public String getCalculatorType() {
        return calculatorType;
    }

    // TODO: Create a Setter for CalculatorType
    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Add
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Subtract (Handles absolute or conditional difference)
    public int subtract(int x, int y) {
        int diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        return diff;
    }

    // TODO: Complete the multiply method to multiply all numbers in an int array
    public int multiply(int[] numbers) {
        int temp = 1;
        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;
    }

    // TODO: Complete the divide method (handle division by zero safely)
    public int divide(int x, int y) {
        int divValue = 0;
        if (y != 0) {
            divValue = x / y;
        } else {
            System.out.println("Cant be devided by a 0");
        }
        return divValue;
    }
}

