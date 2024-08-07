package com.example.demo;

import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i=0; i<nums.size(); i++) {
            int count = 0;
            int index = i;
            while (index != 0) {
                if (index % 2 == 1) {
                    count++;
                }
                index=index>>1;
            }
            if (count == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}
