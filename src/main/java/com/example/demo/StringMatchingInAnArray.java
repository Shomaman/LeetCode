package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (check(words[i], words, i)) {
                result.add(words[i]);
            }
        }
        return result;
    }

    private boolean check(String word, String[] words, int zu) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(word) && zu != i) {
                return true;
            }
        }
        return false;
    }
}
