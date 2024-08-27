package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            Set<Character> set = new HashSet<>();
            while (j < s.length()) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                j++;
            }
            max = Math.max(max, j - i);
        }
        return max;
    }
}
