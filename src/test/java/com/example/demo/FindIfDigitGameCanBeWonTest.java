package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIfDigitGameCanBeWonTest {
    public final FindIfDigitGameCanBeWon findIfDigitGameCanBeWon = new FindIfDigitGameCanBeWon();
    @Test
    void canAliceWin() {
        assertFalse(findIfDigitGameCanBeWon.canAliceWin(new int[]{1,2,3,4,10}));
        assertTrue(findIfDigitGameCanBeWon.canAliceWin(new int[]{1,2,3,4,5,14}));
        assertTrue(findIfDigitGameCanBeWon.canAliceWin(new int[]{5,5,5,25}));
    }
}