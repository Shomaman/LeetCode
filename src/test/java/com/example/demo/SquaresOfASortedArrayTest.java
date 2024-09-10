package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {
    private final SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
    @Test
    void sortedSquares() {
        assertArrayEquals(new int[]{0,1,9,16,100},squaresOfASortedArray.sortedSquares(new int[]{-4,-1,0,3,10}));
        assertArrayEquals(new int[]{4,9,9,49,121},squaresOfASortedArray.sortedSquares(new int[]{-7,-3,2,3,11}));
    }
}