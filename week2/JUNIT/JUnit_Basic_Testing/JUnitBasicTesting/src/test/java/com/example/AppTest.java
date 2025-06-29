package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Gorre Jaya Sai
 */
public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(10, 20);
        assertEquals(30, result); // 10 + 20 = 30
    }
}
