package com.junit.testsuite;

/**
 * A simple Calculator class for demonstrating test suites
 */
public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot calculate modulo by zero");
        }
        return a % b;
    }
    
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}
