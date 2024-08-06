package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationDifferenceBetweenTwoStringsTest {
    @Test
    public void testPermutationDifferenceBetweenTwoStrings() {
        assertEquals(2,PermutationDifferenceBetweenTwoStrings.findPermutationDifference("abc","bac"));
        assertEquals(12,PermutationDifferenceBetweenTwoStrings.findPermutationDifference("abcde", "edbac"));
    }
}