package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayIITest {
    private final RemoveDuplicatesFromSortedArrayII removeDuplicates = new RemoveDuplicatesFromSortedArrayII();

    @Test
    void removeDuplicates() {
        assertEquals(3, removeDuplicates.removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(9, removeDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        assertEquals(5, removeDuplicates.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }
}