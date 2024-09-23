package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumOddBinaryNumberTest {
private final MaximumOddBinaryNumber maximumOddBinaryNumber = new MaximumOddBinaryNumber();
    @Test
    void maximumOddBinaryNumber() {
        assertEquals("001",maximumOddBinaryNumber.maximumOddBinaryNumber("010"));
        assertEquals("1001",maximumOddBinaryNumber.maximumOddBinaryNumber("0101"));
    }
}