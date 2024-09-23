package com.example.demo;

public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        for (Character c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (count > 1) {
                sb.append("1");
                count--;
            } else {
                sb.append("0");
            }
        }
        return sb.append("1").toString();
    }
}
