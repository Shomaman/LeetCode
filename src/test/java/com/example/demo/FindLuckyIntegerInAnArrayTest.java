package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindLuckyIntegerInAnArrayTest {
    private final FindLuckyIntegerInAnArray findLuckyIntegerInAnArray = new FindLuckyIntegerInAnArray();

    @Test
    void findLucky() {
        assertEquals(2, findLuckyIntegerInAnArray.findLucky(new int[]{2, 2, 3, 4}));
        assertEquals(3, findLuckyIntegerInAnArray.findLucky(new int[]{1, 2, 2, 3, 3, 3}));
        assertEquals(-1, findLuckyIntegerInAnArray.findLucky(new int[]{2, 2, 2, 3, 3}));
    }
}