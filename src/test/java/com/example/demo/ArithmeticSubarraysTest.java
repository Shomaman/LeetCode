package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticSubarraysTest {

    @Test
    void checkArithmeticSubarrays() {
        ArithmeticSubarrays arithmeticSubarrays = new ArithmeticSubarrays();
        int[] nums = {4, 6, 5, 9, 3, 7};
        int[] l = {0, 0, 2};
        int[] r = {2, 3, 5};
        List<Boolean> result= arithmeticSubarrays.checkArithmeticSubarrays(nums, l, r);
        List<Boolean> expected = List.of(true, false, true);
        assertIterableEquals(expected, result);
    }
    @Test
    void checkArithmeticSubarrays2() {
        ArithmeticSubarrays arithmeticSubarrays = new ArithmeticSubarrays();
        int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
        int[] l = {0,1,6,4,8,7};
        int[] r = {4,4,9,7,9,10};
        List<Boolean> result= arithmeticSubarrays.checkArithmeticSubarrays(nums, l, r);
        List<Boolean> expected = List.of(false,true,false,false,true,true);
        assertIterableEquals(expected, result);
    }
}