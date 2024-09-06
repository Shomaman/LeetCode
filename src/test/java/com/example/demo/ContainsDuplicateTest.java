package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    @Test
    void containsDuplicate() {
        assertTrue(containsDuplicate.containsDuplicate(new int[]{1,2,3,1}));
        assertFalse(containsDuplicate.containsDuplicate(new int[]{1,2,3}));

    }
}