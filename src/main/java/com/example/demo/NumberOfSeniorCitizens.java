package com.example.demo;

public class NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            if (detail.charAt(11) > 54) {
                count++;
            } else if (detail.charAt(11) == 54 && detail.charAt(12) != 48) {
                count++;
            }
        }
        return count;
    }
}
