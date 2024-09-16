package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstPalindromicStringInTheArrayTest {
private final FindFirstPalindromicStringInTheArray findFirstPalindromicStringInTheArray = new FindFirstPalindromicStringInTheArray();
    @Test
    void firstPalindrome() {
        assertEquals("ada",findFirstPalindromicStringInTheArray.firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
        assertEquals("racecar",findFirstPalindromicStringInTheArray.firstPalindrome(new String[]{"notapalindrome","racecar"}));
        assertEquals("",findFirstPalindromicStringInTheArray.firstPalindrome(new String[]{"def","ghi"}));
    }
}