package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    private final LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    @Test
    void lengthOfLongestSubstring() {
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("a"));
        assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("au"));
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf"));
    }
}