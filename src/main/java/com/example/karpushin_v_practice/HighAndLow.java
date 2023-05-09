package com.example.karpushin_v_practice;

/*
    7 kyu
    https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
 */
public class HighAndLow {

    public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        int max, min;
        max = Integer.parseInt(array[0]);
        min = Integer.parseInt(array[0]);

        for (String str : array) {
            if (Integer.parseInt(str) > max) {
                max = Integer.parseInt(str);
            }
            if (Integer.parseInt(str) < min) {
                min = Integer.parseInt(str);
            }
        }

        return String.format("%d %d", max, min);
    }
}
