package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {
    private final AddDigits addDigits = new AddDigits();

    @Test
    void addDigits() {
        assertEquals(2, addDigits.addDigits(38));
    }
}