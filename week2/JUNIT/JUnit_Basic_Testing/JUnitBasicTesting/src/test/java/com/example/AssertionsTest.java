package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Check if two values are equal
        assertEquals(15, 10 + 5);

        // Check if a condition is true
        assertTrue(20 > 10);

        // Check if a condition is false
        assertFalse(5 == 10);

        // Check if value is null
        String value = null;
        assertNull(value);

        // Check if value is not null
        String name = "Gorre Jaya Sai";
        assertNotNull(name);
    }
}
