package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {
    private final CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
    @Test
    void canPlaceFlowers() {
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{0,0,0}, 1));
        assertFalse(canPlaceFlowers.canPlaceFlowers(new int[]{0,1,0}, 1));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{0,0,0}, 2));
        assertFalse(canPlaceFlowers.canPlaceFlowers(new int[]{0}, 2));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,0}, 2));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,1,0,0}, 2));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{0,0,1,0,0,0,0,0,1,0,0}, 4));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0}, 1));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{0,0,1,0,0,0,0,1,0,0}, 3));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{0,0,1,0,0,0,0,1}, 2));
        assertFalse(canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,0,1}, 1));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{0,1,0,0,0,0,1}, 1));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{0,0,1,0,0,0,0,0,0,1,0,0}, 4));
    }
}