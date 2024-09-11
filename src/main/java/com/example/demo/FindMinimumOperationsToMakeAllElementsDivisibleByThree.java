package com.example.demo;

public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num < 3) {
                count++;
            } else if (num % 3 != 0) {
                count++;
            }
        }
        return count;
    }
}
