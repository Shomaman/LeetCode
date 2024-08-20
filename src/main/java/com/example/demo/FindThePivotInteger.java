package com.example.demo;

public class FindThePivotInteger {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        int sum2 = 0;
        sum = sum / 2;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (sum2 < sum) {
                sum2 += i;
            } else {
                index = i - 1;
                break;
            }
        }
        sum = 0;
        for (int i = index; i <= n; i++) {
            sum += i;
        }
        return sum == sum2 ? index : -1;
    }
}
