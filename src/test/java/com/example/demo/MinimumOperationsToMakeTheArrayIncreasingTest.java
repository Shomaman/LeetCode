package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumOperationsToMakeTheArrayIncreasingTest {
    private final MinimumOperationsToMakeTheArrayIncreasing minimumOperationsToMakeTheArrayIncreasing = new MinimumOperationsToMakeTheArrayIncreasing();

    @Test
    void minOperations() {
        assertEquals(3, minimumOperationsToMakeTheArrayIncreasing.minOperations(new int[]{1, 1, 1}));
        assertEquals(14, minimumOperationsToMakeTheArrayIncreasing.minOperations(new int[]{1, 5, 2, 4, 1}));
    }
}