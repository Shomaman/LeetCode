package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringsWithoutAdjacentZeros {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        int count = (int) Math.pow(2, n);
        boolean flag = false;
        count--;
        while (count >= 0) {
            String string = Integer.toString(count, 2) ;
            count--;
            while (string.length() < n) {
                string= "0" + string;
            }
            for (int i = 1; i < string.length(); i++) {
                if (string.charAt(i) == '0' && string.charAt(i - 1) == '0') {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result.add(string);
            }
            flag = false;
        }
        return result;
    }
}
