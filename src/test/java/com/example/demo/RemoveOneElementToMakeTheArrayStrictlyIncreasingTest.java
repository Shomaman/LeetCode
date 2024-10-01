package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveOneElementToMakeTheArrayStrictlyIncreasingTest {
private final RemoveOneElementToMakeTheArrayStrictlyIncreasing test = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();
    @Test
    void canBeIncreasing() {
        assertTrue(test.canBeIncreasing(new int[]{10,2,3,5,7}));
        assertFalse(test.canBeIncreasing(new int[]{2,3,1,2}));
        assertFalse(test.canBeIncreasing(new int[]{1,1,1}));
        assertTrue(test.canBeIncreasing(new int[]{1,2,3}));
        assertTrue(test.canBeIncreasing(new int[]{1,2,10,5,7}));
        assertTrue(test.canBeIncreasing(new int[]{1,2,3,4,5}));
        assertTrue(test.canBeIncreasing(new int[]{105,924,32,968}));
    }
}