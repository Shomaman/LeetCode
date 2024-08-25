package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> mapping = new HashMap<>();
        char index = 97;
        for (Character c : key.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            if (!mapping.containsKey(c)) {
                mapping.put(c, index++);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (Character d : message.toCharArray()) {
            if (d ==' ') {
                builder.append(" ");
                continue;
            }
            builder.append(mapping.get(d));
        }
        return builder.toString();
    }
}
