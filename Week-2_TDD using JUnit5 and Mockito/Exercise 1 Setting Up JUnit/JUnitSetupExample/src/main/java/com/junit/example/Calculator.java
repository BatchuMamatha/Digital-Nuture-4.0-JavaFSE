package com.junit.example;

/**
 * A simple Calculator class to demonstrate JUnit testing
 */
public class Calculator {
    
    /**
     * Adds two integers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtracts two integers
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplies two integers
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Divides two integers
     * @param a dividend
     * @param b divisor
     * @return quotient of a divided by b
     * @throws IllegalArgumentException if divisor is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    /**
     * Checks if a number is even
     * @param number the number to check
     * @return true if even, false if odd
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
