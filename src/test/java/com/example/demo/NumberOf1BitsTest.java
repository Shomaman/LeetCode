package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOf1BitsTest {
private final NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
    @Test
    void hammingWeight() {
        assertEquals(0, numberOf1Bits.hammingWeight(0));
        assertEquals(1, numberOf1Bits.hammingWeight(1));
        assertEquals(3, numberOf1Bits.hammingWeight(11));
        assertEquals(30, numberOf1Bits.hammingWeight(2147483645));
    }
}