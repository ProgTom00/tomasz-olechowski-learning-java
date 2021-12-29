package com.exceptions.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        String result = null;
        try {
            result = secondChallenge.probablyIWillThrowException(1, 1.7);
        } catch (Exception e) {
            System.out.println("Value of x has to be 1 and value of 'y' must be different from 1.5");
        } finally {
            System.out.println("Result = " + result);
        }

    }
}
