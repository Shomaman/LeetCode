package com.example.demo.solved;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindIndicesOfStableMountainsTest {
    private final FindIndicesOfStableMountains findIndicesOfStableMountains = new FindIndicesOfStableMountains();
    @Test
    void stableMountains() {
        assertEquals(List.of(3,4),findIndicesOfStableMountains.stableMountains(new int[]{1,2,3,4,5},2));
        assertEquals(Collections.EMPTY_LIST,findIndicesOfStableMountains.stableMountains(new int[]{10,1,10,1,10},10));
        assertEquals(List.of(1,3),findIndicesOfStableMountains.stableMountains(new int[]{10,1,10,1,10},3));
    }
}