package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumOfValuesAtIndicesWithKSetBitsTest {

    private final SumOfValuesAtIndicesWithKSetBits sumOfValuesAtIndicesWithKSetBits = new SumOfValuesAtIndicesWithKSetBits();

    @Test
    public void test() {
        assertEquals(13, sumOfValuesAtIndicesWithKSetBits.sumIndicesWithKSetBits(List.of(5,10,1,5,2), 1));
        assertEquals(1, sumOfValuesAtIndicesWithKSetBits.sumIndicesWithKSetBits(List.of(4,3,2,1), 2));
    }
}