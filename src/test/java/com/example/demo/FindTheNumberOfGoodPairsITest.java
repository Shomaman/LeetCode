package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheNumberOfGoodPairsITest {

    @Test
    void numberOfPairs() {
        FindTheNumberOfGoodPairsI findTheNumberOfGoodPairsI = new FindTheNumberOfGoodPairsI();
        assertEquals(5, findTheNumberOfGoodPairsI.numberOfPairs(new int[]{1,3,4},new int[]{1,3,4},1));
        assertEquals(2, findTheNumberOfGoodPairsI.numberOfPairs(new int[]{1,2,4,12},new int[]{2,4},2));
    }
}