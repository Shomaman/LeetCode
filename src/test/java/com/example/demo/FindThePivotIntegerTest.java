package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindThePivotIntegerTest {
    FindThePivotInteger findThePivotInteger = new FindThePivotInteger();
    @Test
    void pivotInteger() {
        assertEquals(-1, findThePivotInteger.pivotInteger(3));
        assertEquals(6, findThePivotInteger.pivotInteger(8));
        assertEquals(1, findThePivotInteger.pivotInteger(1));
        assertEquals(-1, findThePivotInteger.pivotInteger(4));
    }
}