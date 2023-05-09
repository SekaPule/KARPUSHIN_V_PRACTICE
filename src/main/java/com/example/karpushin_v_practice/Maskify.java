package com.example.karpushin_v_practice;

/*
    https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java
 */
class Maskify {

    public static String maskify(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length() - 4; i++) {
            sb.setCharAt(i, '#');
        }
        return sb.toString();
    }
}