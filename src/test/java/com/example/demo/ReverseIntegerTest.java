package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ReverseIntegerTest {
    private final ReverseInteger reverseInteger = new ReverseInteger();
    @Test
    void reverse() {
        assertEquals(321, reverseInteger.reverse(123));
        assertEquals(-321, reverseInteger.reverse(-123));
        assertEquals(0, reverseInteger.reverse(0));
        assertEquals(0, reverseInteger.reverse(Integer.MIN_VALUE));
        assertEquals(0, reverseInteger.reverse(Integer.MAX_VALUE));
    }
}