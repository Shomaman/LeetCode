package com.example.demo;

public class AddDigits {
    public int addDigits(int num) {
        int result = 0;
        if (num < 10) return num;
        while (num > 0) {
            result = result + (num % 10);
            num = num / 10;
        }
        return addDigits(result);
    }
}
