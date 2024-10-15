package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparateTheDigitsInAnArrayTest {
private final SeparateTheDigitsInAnArray separateTheDigitsInAnArray = new SeparateTheDigitsInAnArray();
    @Test
    void separateDigits() {
        assertArrayEquals(new int[]{7,1,3,0,0,9},separateTheDigitsInAnArray.separateDigits(new int[]{7,1,300,9}));
        assertArrayEquals(new int[]{1,3,2,5,8,3,7,7},separateTheDigitsInAnArray.separateDigits(new int[]{13,25,83,77}));
        assertArrayEquals(new int[]{7,1,3,9},separateTheDigitsInAnArray.separateDigits(new int[]{7,1,3,9}));
    }
}