package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main(); // Создание объекта Main c помощью которого будут
    // вызваны тестируемые методы

    @Test
    void myFirstTest() {
        int result = main.sum(1,2); // метод вызывавет фунцию sum и передает в нее заданные значения
        assertEquals(3, result); // проверка результата выполнения метоа
    }
    @Test
    void mySecondTest() {
        int result = main.minus(3,1);
        assertEquals(2,result);
    }
    @Test
    void myThirdTest(){
        int result = main.sum(1,0);
        assertEquals(1,result);
    }
    @Test
    void myFourthTest(){
        int result = main.minus(1,0);
        assertEquals(1,result);
    }
    @Test
    void myFifthTest(){
        int result = main.sum(1,-1);
        assertEquals(0,result);
    }
    @Test
    void mySixthTest(){
        int result = main.minus(-1,-1);
        assertEquals(0, result);
    }
}