package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfSeniorCitizensTest {
    private final NumberOfSeniorCitizens numberOfSeniorCitizens = new NumberOfSeniorCitizens();
    @Test
    void countSeniors() {
        assertEquals(2, numberOfSeniorCitizens.countSeniors(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
        assertEquals(0, numberOfSeniorCitizens.countSeniors(new String[]{"1313579440F2036","2921522980M6044"}));
        assertEquals(1, numberOfSeniorCitizens.countSeniors(new String[]{"1313579440F2036","2921522980M6144"}));
    }
}