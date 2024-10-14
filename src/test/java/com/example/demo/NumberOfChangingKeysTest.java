package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfChangingKeysTest {
    private final NumberOfChangingKeys numberOfChangingKeys = new NumberOfChangingKeys();

    @Test
    void countKeyChanges() {
        assertEquals(0, numberOfChangingKeys.countKeyChanges("AaAaAaaA"));
        assertEquals(2, numberOfChangingKeys.countKeyChanges("aAbBcC"));
        assertEquals(2, numberOfChangingKeys.countKeyChanges("abc"));
        assertEquals(3, numberOfChangingKeys.countKeyChanges("pale"));
        assertEquals(2, numberOfChangingKeys.countKeyChanges("ple"));
    }
}