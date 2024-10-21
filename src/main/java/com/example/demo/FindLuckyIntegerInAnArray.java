package com.example.demo;

public class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        int[] arr2 = new int[501];
        for (int i:arr) {
            arr2[i]++;
        }
        for (int i = arr2.length-1; i >0; i--) {
            if (arr2[i] == i) {
                return i;
            }
        }
        return -1;
    }
}
