package com.example.demo;

public class FindIfDigitGameCanBeWon {
    public boolean canAliceWin(int[] nums) {
        int Alice=0;
        int Bob=0;
        for(int num:nums){
            if(num>9){
                Alice+=num;
            }
            else{
                Bob+=num;
            }
        }
        return Alice!=Bob;
    }
}
