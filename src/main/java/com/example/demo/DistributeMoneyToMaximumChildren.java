package com.example.demo;

public class DistributeMoneyToMaximumChildren {
    public int distMoney(int money, int children) {
        int count = 0;
        if(children*8==money)return children;
        if(children>money)return -1;
        while (money - children > 6) {
            if(children == 1 & money>7)break;
            count++;
            money -= 8;
            children--;
        }
        if (children == 1 & money == 4 ) {
            count--;
        }

        return count;
    }
}
