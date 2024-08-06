package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthDistinctStringInAnArrayTest {

    @Test
    public void testArrayWithKthLessThanCountDistinctStrings() {
        assertEquals("", KthDistinctStringInAnArray.findKthDistinct(new String[] {"a", "a", "b", "c", "c"}, 2));
    }

    @Test
    public void testArrayWithKthEqualsCountDistinctStrings() {
        assertEquals("c", KthDistinctStringInAnArray.findKthDistinct(new String[] {"a", "a","a", "b", "c"}, 2));
    }

    @Test
    public void testArrayWithKthMoreThanCountDistinctStrings() {
        assertEquals("c", KthDistinctStringInAnArray.findKthDistinct(new String[] {"a", "a", "b", "c","f","g"}, 2));
    }
}