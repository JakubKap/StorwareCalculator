package com.storware.logic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {
    Calculator calculator;

    @Before
    public void initCalculator(){
        calculator = new Calculator();
    }


    @Test
    public void testSum() {
        int firstValue = 1;
        int secondalue = 2;
        int result = 3;

        assertEquals(calculator.sum(firstValue, secondalue),result);
    }

    @Test
    public void testSubtract() {
        int firstValue = 10;
        int secondalue = 2;
        int result = 8;

        assertEquals(calculator.subtract(firstValue, secondalue),result);
    }

    @Test
    public void testMultiply() {
        int firstValue = 10;
        int secondalue = 2;
        int result = 20;

        assertEquals(calculator.multiply(firstValue, secondalue),result);
    }

    @Test
    public void testDivide() {
        int firstValue = 10;
        int secondalue = 2;
        int result = 5;

        assertEquals(calculator.divide(firstValue, secondalue),result);
    }

    @Test
    public void testPow() {
        int firstValue = 10;
        int secondalue = 2;
        int result = 100;

        assertEquals(calculator.pow(firstValue, secondalue),result);
    }

    @Test
    public void testMod() {
        int firstValue = 10;
        int secondalue = 3;
        int result = 1;

        assertEquals(calculator.mod(firstValue, secondalue),result);
    }
}
