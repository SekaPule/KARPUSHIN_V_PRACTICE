package com.example.karpushin_v_practice;

/*
    7 kyu
    https://www.codewars.com/kata/551f37452ff852b7bd000139/train/java
 */
public class BinaryAddition {

    public static String binaryAddition(int a, int b) {
        int sum = a + b;
        int bit;
        StringBuilder result = new StringBuilder();
        while (sum != 0) {
            bit = sum % 2;
            result.insert(0, bit);
            sum = sum / 2;
        }
        return result.toString();
    }
}
