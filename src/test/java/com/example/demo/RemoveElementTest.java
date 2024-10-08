package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
private final RemoveElement removeElement = new RemoveElement();
    @Test
    void removeElement() {
        assertEquals(5, removeElement.removeElement(new int[]{1,2,6,3,4,5,6}, 6));
    }
}