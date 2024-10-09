package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {
    private final Sqrt sqrt = new Sqrt();
    @Test
    void mySqrt() {
        assertEquals(46340, sqrt.mySqrt(2147395600));
        assertEquals(2, sqrt.mySqrt(4));
        assertEquals(3, sqrt.mySqrt(9));
        assertEquals(4, sqrt.mySqrt(16));
        assertEquals(5, sqrt.mySqrt(25));
        assertEquals(6, sqrt.mySqrt(36));
        assertEquals(9, sqrt.mySqrt(87));

    }
}