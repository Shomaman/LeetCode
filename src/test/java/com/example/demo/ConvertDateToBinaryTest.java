package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertDateToBinaryTest {
private final ConvertDateToBinary convertDateToBinary = new ConvertDateToBinary();
    @Test
    void convertDateToBinary() {
        assertEquals("11101101100-1-1", convertDateToBinary.convertDateToBinary("1900-01-01"));
        assertEquals("100000100000-10-11101", convertDateToBinary.convertDateToBinary("2080-02-29"));
    }
}