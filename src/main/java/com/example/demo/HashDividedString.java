package com.example.demo;

public class HashDividedString {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        char[] chars = new char[124];
        for (int i = 0; i < 26; i++) {
            chars[i + 97] = (char) (i + 'a');

        }
        int i = 0;
        int zu = k;
        while (i < s.length()) {
            int str = 0;
            for (; i < zu; i++) {
                str += chars[s.charAt(i)] - 97;
            }
            sb.append(chars[str % 26 + 97]);
            zu += k;
            System.out.println(i);
        }
        return sb.toString();
    }
}
