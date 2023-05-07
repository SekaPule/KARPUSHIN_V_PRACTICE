package com.example.karpushin_v_practice;

/*
    6 kyu
    https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
 */
public class Persistence {

    public static int persistence(long n) {
        int digitsMultAcc = 1;
        long nTemp = n;

        if (n / 10 == 0) {
            return 0;
        }

        for (nTemp = n; nTemp != 0; nTemp /= 10) {
            digitsMultAcc *= nTemp % 10;
        }

        return persistence(digitsMultAcc) + 1;
    }
}
