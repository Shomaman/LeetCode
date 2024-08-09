package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumOperationsToExceedThresholdValueITest {

    @Test
    void minOperations() {
        assertEquals(2, new MinimumOperationsToExceedThresholdValueI().minOperations(new int[]{1,2,3,4,5}, 3));
        assertEquals(3, new MinimumOperationsToExceedThresholdValueI().minOperations(new int[]{2,11,10,1,3}, 10));
        assertEquals(0, new MinimumOperationsToExceedThresholdValueI().minOperations(new int[]{1,1,2,4,9}, 1));
        assertEquals(4, new MinimumOperationsToExceedThresholdValueI().minOperations(new int[]{1,1,2,4,9}, 9));
    }
}