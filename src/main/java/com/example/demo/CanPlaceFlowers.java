package com.example.demo;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        if(flowerbed.length==1&&n<2){
            return flowerbed[0]==1;
        }
        else if (flowerbed.length==1&n>1){
            return false;
        }
        if(flowerbed[0]==0&flowerbed[1]==0&&n<2){
                return true;
        }
        else if (flowerbed.length==2&n>1){
            return false;
        }
        boolean[] flowerCheck = new boolean[flowerbed.length];
        if(flowerbed[0]==0){
            flowerCheck[0] = true;
        }
        if(flowerbed[flowerbed.length-1]==0){
            flowerCheck[flowerbed.length-1] = true;
        }
        if(flowerCheck[0]&&flowerbed[1]==0){
            n--;
            flowerCheck[0] = false;
        }
        boolean flag = false;
        for(int i = 1; i < flowerbed.length-1; i++){
            if (flowerbed[i]==0){
                flowerCheck[i] = true;
            }
            if(flowerCheck[flowerbed.length-1]&&flowerCheck[flowerbed.length-2]&&!flowerCheck[i-1]){
                n--;
                flowerCheck[flowerbed.length-1] = false;
            }
            if(flowerCheck[i-1]&&flowerCheck[i]&&flowerbed[i+1]==0){
                n--;
                flowerCheck[i] = false;
            }
            if(n<1){
                flag = true;
                break;
            }

        }
        return flag;
    }
}
