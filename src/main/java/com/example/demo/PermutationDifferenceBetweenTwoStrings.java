package com.example.demo;

public class PermutationDifferenceBetweenTwoStrings {
    public static int findPermutationDifference(String s, String t) {
        int sumOfDifferent = 0;
        for (int i = 0; i < s.length(); i++) {
            sumOfDifferent += Math.abs(i - t.indexOf(s.charAt(i)));
        }
        return sumOfDifferent;
    }
}
