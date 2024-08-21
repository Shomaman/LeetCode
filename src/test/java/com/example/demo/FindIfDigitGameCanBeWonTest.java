package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIfDigitGameCanBeWonTest {
    public final FindIfDigitGameCanBeWon findIfDigitGameCanBeWon = new FindIfDigitGameCanBeWon();
    @Test
    void canAliceWin() {
        assertEquals(false, findIfDigitGameCanBeWon.canAliceWin(new int[]{1,2,3,4,10}));
        assertEquals(true, findIfDigitGameCanBeWon.canAliceWin(new int[]{1,2,3,4,5,14}));
        assertEquals(true, findIfDigitGameCanBeWon.canAliceWin(new int[]{5,5,5,25}));
    }
}