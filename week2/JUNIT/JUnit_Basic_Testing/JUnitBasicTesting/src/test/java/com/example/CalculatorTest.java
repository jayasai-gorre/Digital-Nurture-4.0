package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // This method runs before each test case
    @Before
    public void setUp() {
        System.out.println("Initializing Calculator instance...");
        calculator = new Calculator(); // Setting up object
    }

    // This method runs after each test case
    @After
    public void tearDown() {
        System.out.println("Cleaning up Calculator instance...");
        calculator = null;
    }

    @Test
    public void testAddition() {
        // Action
        int result = calculator.add(7, 8);

        // Verification
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Action
        int result = calculator.subtract(12, 4);

        // Verification
        assertEquals(8, result);
    }
}
