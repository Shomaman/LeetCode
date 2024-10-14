package com.example.demo;

public class NumberOfChangingKeys {
    public int countKeyChanges(String s) {
        int count = 0;
        String check = s.substring(0, 1);
        s = s.toLowerCase();
        for (int i = 1; i < s.length(); i++) {
            if (!check.equals(s.substring(i, i + 1))) {
                count++;
                check = s.substring(i, i + 1);
            }
        }
        return count;
    }
}
