package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();

    @Test
    void myFirstTest() {
        int result = main.sum(1,2);
        assertEquals(3, result);
    }

}