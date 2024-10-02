package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ANumberAfterADoubleReversalTest {
    private final ANumberAfterADoubleReversal numberAfterADoubleReversal = new ANumberAfterADoubleReversal();
    @Test
    void isSameAfterReversals() {
        assertTrue(numberAfterADoubleReversal.isSameAfterReversals(1));
        assertTrue(numberAfterADoubleReversal.isSameAfterReversals(526));
        assertTrue(numberAfterADoubleReversal.isSameAfterReversals(0));
        assertFalse(numberAfterADoubleReversal.isSameAfterReversals(1800));
    }
}