package com.example.demo;

public class ReverseInteger {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            int digit = x % 10;
            result = result * 10 + digit;
            x /= 10;
            if (result > Integer.MAX_VALUE) {
                return 0;
            }
            if (result < Integer.MIN_VALUE) {
                return 0;
            }

        }
        return (int) result;
    }
}
