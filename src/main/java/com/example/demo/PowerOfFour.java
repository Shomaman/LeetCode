package com.example.demo;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
        for(int i = 0 ; i<n;i++){
            double zu = Math.pow(4,i);
            if(zu==n)return true;
            else if(zu>n)return false;
        }
        return false;
    }
}
