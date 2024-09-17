package com.example.demo;

public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)(i+ 'a');
        }
        for (char c:chars) {
            if(!sentence.contains(c+"")){
                return false;
            }
        }
   return true;
    }
}
