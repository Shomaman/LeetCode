package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashDividedStringTest {
private final HashDividedString hash = new HashDividedString();
    @Test
    void stringHash() {
        assertEquals("ant", hash.stringHash("ant", 1));
        assertEquals("bf", hash.stringHash("abcd", 2));
        assertEquals("i", hash.stringHash("mxz", 3));
    }
}