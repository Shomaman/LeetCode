package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class TheTwoSneakyNumbersOfDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                result[count] = num;
                count++;
            }
            if (count == 2) {
                return result;
            }
        }
        return result;
    }
}
