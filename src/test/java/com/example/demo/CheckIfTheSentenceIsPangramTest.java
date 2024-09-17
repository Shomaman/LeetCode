package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfTheSentenceIsPangramTest {
    private final CheckIfTheSentenceIsPangram checkIfTheSentenceIsPangram = new CheckIfTheSentenceIsPangram();
    @Test
    void checkIfPangram() {
        assertTrue(checkIfTheSentenceIsPangram.checkIfPangram("The quick brown fox jumps over the lazy dog"));
        assertFalse(checkIfTheSentenceIsPangram.checkIfPangram("The quick brown fox jumps over the lazy"));
    }
}