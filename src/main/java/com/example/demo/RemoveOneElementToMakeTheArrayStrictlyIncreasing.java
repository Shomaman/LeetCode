package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {
    public boolean canBeIncreasing(int[] nums) {
        Integer [] integerArray = IntStream.of(nums).boxed().toArray(Integer []::new);
        for (int i = 0; i < integerArray.length; i++) {
            if(check(integerArray, i)){
                return true;
            }
        }
        return false;}

    private boolean check(Integer[] integerArray, int i) {
        List<Integer> integerList = new ArrayList<>(List.of(integerArray));
        integerList.remove(i);
        for (int j = 0; j < integerList.size()-1; j++) {
            if(integerList.get(j) >= integerList.get(j+1)) {
                return false;
            }
        }
        return true;
    }
}



