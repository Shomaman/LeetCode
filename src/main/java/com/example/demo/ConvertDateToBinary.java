package com.example.demo;

public class ConvertDateToBinary {
    public String convertDateToBinary(String date) {
        StringBuilder res = new StringBuilder() ;
        res.append(Integer.toBinaryString(Integer.parseInt(date.substring(0 , 4)))) ;
        res.append('-') ;
        res.append(Integer.toBinaryString(Integer.parseInt(date.substring(5 , 7)))) ;
        res.append('-');
        res.append(Integer.toBinaryString(Integer.parseInt(date.substring(8 , 10)))) ;
        return res.toString() ;
    }
}
