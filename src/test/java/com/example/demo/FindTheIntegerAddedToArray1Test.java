package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIntegerAddedToArray1Test {
private final FindTheIntegerAddedToArray1 findTheIntegerAddedToArray1 = new FindTheIntegerAddedToArray1();
    @Test
    void addedInteger() {
        assertEquals(3,findTheIntegerAddedToArray1.addedInteger(new int[]{2,6,4}, new int[]{9,7,5}));
        assertEquals(-5,findTheIntegerAddedToArray1.addedInteger(new int[]{10}, new int[]{5}));
        assertEquals(0,findTheIntegerAddedToArray1.addedInteger(new int[]{1,1,1,1}, new int[]{1,1,1,1}));
    }
}