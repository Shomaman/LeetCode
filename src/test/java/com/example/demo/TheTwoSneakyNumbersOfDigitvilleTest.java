package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheTwoSneakyNumbersOfDigitvilleTest {
    private final TheTwoSneakyNumbersOfDigitville theTwoSneakyNumbersOfDigitville = new TheTwoSneakyNumbersOfDigitville();
    @Test
    void getSneakyNumbers() {
        assertArrayEquals(new int[]{1,0}, theTwoSneakyNumbersOfDigitville.getSneakyNumbers(new int[]{0,1,1,0}));
        assertArrayEquals(new int[]{3,2}, theTwoSneakyNumbersOfDigitville.getSneakyNumbers(new int[]{0,3,2,1,3,2}));
    }
}