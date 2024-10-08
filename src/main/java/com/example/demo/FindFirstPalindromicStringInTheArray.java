package com.example.demo;

public class FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) return word;
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        for(int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) return false;
            }
        return true;
    }
}
