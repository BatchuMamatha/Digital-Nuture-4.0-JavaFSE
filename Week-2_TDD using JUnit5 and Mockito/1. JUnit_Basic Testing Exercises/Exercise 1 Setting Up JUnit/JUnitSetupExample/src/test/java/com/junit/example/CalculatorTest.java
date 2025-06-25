package com.junit.example;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * JUnit 4 test class for Calculator
 * This demonstrates basic JUnit 4 testing setup and usage
 */
public class CalculatorTest {
    
    private Calculator calculator;
    
    /**
     * Set up method - runs before each test
     */
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up test...");
    }
    
    /**
     * Tear down method - runs after each test
     */
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Test completed.\n");
    }
    
    /**
     * Test the add method
     */
    @Test
    public void testAdd() {
        System.out.println("Testing add method");
        int result = calculator.add(5, 3);
        assertEquals("5 + 3 should equal 8", 8, result);
        
        // Test with negative numbers
        result = calculator.add(-2, 7);
        assertEquals("-2 + 7 should equal 5", 5, result);
    }
    
    /**
     * Test the subtract method
     */
    @Test
    public void testSubtract() {
        System.out.println("Testing subtract method");
        int result = calculator.subtract(10, 4);
        assertEquals("10 - 4 should equal 6", 6, result);
        
        // Test with negative result
        result = calculator.subtract(3, 8);
        assertEquals("3 - 8 should equal -5", -5, result);
    }
    
    /**
     * Test the multiply method
     */
    @Test
    public void testMultiply() {
        System.out.println("Testing multiply method");
        int result = calculator.multiply(6, 7);
        assertEquals("6 * 7 should equal 42", 42, result);
        
        // Test with zero
        result = calculator.multiply(5, 0);
        assertEquals("5 * 0 should equal 0", 0, result);
    }
    
    /**
     * Test the divide method
     */
    @Test
    public void testDivide() {
        System.out.println("Testing divide method");
        double result = calculator.divide(15, 3);
        assertEquals("15 / 3 should equal 5.0", 5.0, result, 0.001);
        
        // Test with decimal result
        result = calculator.divide(7, 2);
        assertEquals("7 / 2 should equal 3.5", 3.5, result, 0.001);
    }
    
    /**
     * Test divide by zero - should throw exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        System.out.println("Testing divide by zero");
        calculator.divide(10, 0);
    }
    
    /**
     * Test the isEven method
     */
    @Test
    public void testIsEven() {
        System.out.println("Testing isEven method");
        assertTrue("4 should be even", calculator.isEven(4));
        assertFalse("5 should not be even", calculator.isEven(5));
        assertTrue("0 should be even", calculator.isEven(0));
        assertFalse("-3 should not be even", calculator.isEven(-3));
        assertTrue("-8 should be even", calculator.isEven(-8));
    }
}
