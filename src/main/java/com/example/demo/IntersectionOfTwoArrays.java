package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
           if(contains(nums1[i], nums2)){
               set.add(nums1[i]);
           }
        }
        int[] result = new int[set.size()];
        int counter=0;
        for(Integer i:set){
            result[counter++]=i;
        }
    return result;
    }
    private boolean contains(int num,int[] nums2) {
        for(int j=0;j<nums2.length;j++){
            if(num==nums2[j]){
                return true;
            }
        }
    return false;
    }
}
