package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumOperationsToMakeAllElementsDivisibleByThreeTest {
private final FindMinimumOperationsToMakeAllElementsDivisibleByThree
        findMinimumOperationsToMakeAllElementsDivisibleByThree =
        new FindMinimumOperationsToMakeAllElementsDivisibleByThree();
    @Test
    void minimumOperations() {
        assertEquals(7, findMinimumOperationsToMakeAllElementsDivisibleByThree.minimumOperations(new int[]{1,2,3,4,5,6,7,8,9,10}));
        assertEquals(3, findMinimumOperationsToMakeAllElementsDivisibleByThree.minimumOperations(new int[]{1,2,3,4}));
        assertEquals(0, findMinimumOperationsToMakeAllElementsDivisibleByThree.minimumOperations(new int[]{3,6,9}));
    }
}