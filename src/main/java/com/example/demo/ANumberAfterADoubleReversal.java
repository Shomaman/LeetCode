package com.example.demo;

public class ANumberAfterADoubleReversal {
    public boolean isSameAfterReversals(int num) {
        int reverse = 0;
        int reverse2 = num;

        while (num!= 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        while (reverse!= 0) {
            num = num * 10 + reverse % 10;
            reverse = reverse / 10;
        }
    return reverse2 == num;
    }
}
