package com.example.demo;

public class Sqrt {
    public int mySqrt(int x) {
        int currNum = 1;
        if(x>=2147395600){
            return 46340;
        }
        while (currNum * currNum <= x) {
            currNum++;
        }
        return --currNum;
    }
}
