package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestIndexWithEqualValueTest {
    private final SmallestIndexWithEqualValue smallestIndexWithEqualValue = new SmallestIndexWithEqualValue();

    @Test
    void smallestEqual() {
        assertEquals(0, smallestIndexWithEqualValue.smallestEqual(new int[]{0, 1, 2}));
        assertEquals(2, smallestIndexWithEqualValue.smallestEqual(new int[]{4, 3, 2, 1}));
        assertEquals(-1, smallestIndexWithEqualValue.smallestEqual(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}