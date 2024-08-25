package com.example.demo;

import java.util.Arrays;

public class MinimumAverageOfSmallestAndLargestElements {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double[] res = new double[nums.length / 2];
        for (int i = 0; i < nums.length / 2; i++) {
            res[i] = (double) (nums[i] + nums[nums.length - i - 1]) / 2;
        }
        double min = Double.MAX_VALUE;
        for (double i : res) {
            min = Math.min(min, i);
        }
        return min;
    }
}
