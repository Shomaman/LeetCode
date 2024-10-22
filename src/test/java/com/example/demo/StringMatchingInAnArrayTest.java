package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class StringMatchingInAnArrayTest {
    private final StringMatchingInAnArray stringMatchingInAnArray = new StringMatchingInAnArray();

    @Test
    void stringMatching() {
        assertIterableEquals(List.of("as", "hero"), stringMatchingInAnArray.stringMatching(new String[]{"mass", "as", "hero", "superhero"}));
        assertIterableEquals(List.of("et", "code"), stringMatchingInAnArray.stringMatching(new String[]{"leetcode", "et", "code"}));
        assertIterableEquals(Collections.emptyList(), stringMatchingInAnArray.stringMatching(new String[]{"blue", "green", "bu"}));
    }
}