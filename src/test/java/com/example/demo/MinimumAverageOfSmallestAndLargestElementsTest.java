package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAverageOfSmallestAndLargestElementsTest {
    private final MinimumAverageOfSmallestAndLargestElements minimumAverageOfSmallestAndLargestElements = new MinimumAverageOfSmallestAndLargestElements();
    @Test
    void minimumAverage() {
        assertEquals(5.5, minimumAverageOfSmallestAndLargestElements.minimumAverage(new int[]{7,8,3,4,15,13,4,1}));
        assertEquals(5.5, minimumAverageOfSmallestAndLargestElements.minimumAverage(new int[]{1,9,8,3,10,5}));
        assertEquals(5.0, minimumAverageOfSmallestAndLargestElements.minimumAverage(new int[]{1,2,3,7,8,9}));
    }
}