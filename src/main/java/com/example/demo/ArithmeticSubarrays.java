package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int[] sub = new int[r[i] - l[i] + 1];
            for (int k=0, j = l[i];k<sub.length&& j <= r[i];k++, j++) {
                sub[k] = nums[j];
            }
            Arrays.sort(sub);
            if (sub.length> 1) {
                int diff = sub[1] - sub[0];
                boolean isRightArSub = true;
                for (int k = 2; k < sub.length; k++) {
                    if (diff != sub[k] - sub[k - 1]) {
                        isRightArSub=false;
                        break;
                    }
                }
                res.add(isRightArSub);
            }
        }
        return res;
    }
}
