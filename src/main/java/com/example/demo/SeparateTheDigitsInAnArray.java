package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeparateTheDigitsInAnArray {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> temp = new ArrayList<>();
            while (nums[i] > 0) {
                temp.add(nums[i] % 10);
                nums[i] = nums[i] / 10;
            }
            Collections.reverse(temp);
            list.addAll(temp);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
