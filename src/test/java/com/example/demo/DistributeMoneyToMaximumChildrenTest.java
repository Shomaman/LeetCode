package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistributeMoneyToMaximumChildrenTest {
    private final DistributeMoneyToMaximumChildren distributeMoneyToMaximumChildren = new DistributeMoneyToMaximumChildren();

    @Test
    void distMoney() {
        assertEquals(1, distributeMoneyToMaximumChildren.distMoney(13, 3));
        assertEquals(0, distributeMoneyToMaximumChildren.distMoney(9, 6));
        assertEquals(1, distributeMoneyToMaximumChildren.distMoney(20, 3));
        assertEquals(0, distributeMoneyToMaximumChildren.distMoney(5, 2));
        assertEquals(0, distributeMoneyToMaximumChildren.distMoney(12, 2));
        assertEquals(2, distributeMoneyToMaximumChildren.distMoney(20, 4));
        assertEquals(0, distributeMoneyToMaximumChildren.distMoney(7, 2));
        assertEquals(0, distributeMoneyToMaximumChildren.distMoney(12, 2));
        assertEquals(1, distributeMoneyToMaximumChildren.distMoney(10, 2));
        assertEquals(1, distributeMoneyToMaximumChildren.distMoney(20, 2));
        assertEquals(2, distributeMoneyToMaximumChildren.distMoney(16, 2));
        assertEquals(1, distributeMoneyToMaximumChildren.distMoney(15, 8));
    }
}