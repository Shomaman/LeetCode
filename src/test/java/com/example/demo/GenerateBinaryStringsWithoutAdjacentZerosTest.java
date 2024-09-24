package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateBinaryStringsWithoutAdjacentZerosTest {
    private final GenerateBinaryStringsWithoutAdjacentZeros generateBinaryStringsWithoutAdjacentZeros = new GenerateBinaryStringsWithoutAdjacentZeros();
    @Test
    void validStrings() {
        assertEquals(List.of("111", "110", "101", "011", "010"),generateBinaryStringsWithoutAdjacentZeros.validStrings(3));
        assertEquals(List.of("1","0"),generateBinaryStringsWithoutAdjacentZeros.validStrings(1));
    }
}