package com.learning.testing;

import com.learning.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int addResult = calculator.add(10, 5);
        int subtractResult = calculator.subtract(10, 3);

        if (addResult == 15) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
        if (subtractResult == 7) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}