package com.example.demo;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int current = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (current != nums[i]) {
                count = 0;
                nums[++index] = nums[i];
                current = nums[i];
            } else if (current == nums[i] && count < 1) {
                nums[++index] = nums[i];
                current = nums[i];
                count++;
            }
        }
        return ++index;
    }
}
