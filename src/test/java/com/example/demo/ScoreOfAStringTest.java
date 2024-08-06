package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreOfAStringTest {
    @Test
    public void testHello() {
        assertEquals(13, ScoreOfAString.scoreOfString("hello"));
    }

    @Test
    public void testZaz() {
        assertEquals(50, ScoreOfAString.scoreOfString("zaz"));
    }
}