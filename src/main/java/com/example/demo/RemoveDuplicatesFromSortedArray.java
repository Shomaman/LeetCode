package com.example.demo;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (current != nums[i]) {
                nums[++index] = nums[i];
                current = nums[i];
            }
        }
        return ++index;
    }
}
