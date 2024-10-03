package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumElementAfterReplacementWithDigitSumTest {
    private final MinimumElementAfterReplacementWithDigitSum minimumElementAfterReplacementWithDigitSum =
            new MinimumElementAfterReplacementWithDigitSum();
    @Test
    void minElement() {
        assertEquals(1, minimumElementAfterReplacementWithDigitSum.minElement(new int[]{1, 2, 3, 4, 5}));
        assertEquals(1, minimumElementAfterReplacementWithDigitSum.minElement(new int[]{10,12,13,14}));
        assertEquals(10, minimumElementAfterReplacementWithDigitSum.minElement(new int[]{999,19,199}));
    }
}