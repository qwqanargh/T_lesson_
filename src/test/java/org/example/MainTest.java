package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();

    void myFirstTest() {
        int result = main.sum(1,2);
        assertEquals(3, result);
    }

}