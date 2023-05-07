package com.example.karpushin_v_practice;

/*
    https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/train/java
 */
public class BackspacesInString {

    public String cleanString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                result.append(s.charAt(i));
            } else if (result.length() > 0) {
                result = new StringBuilder(result.substring(0, result.length() - 1));
            }
        }
        return result.toString();
    }
}
