package com.example.karpushin_v_practice;

/*
    https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
 */
public class FindEvenIndex {

    public static int findEvenIndex(int[] arr) {
        int rightSum = 0;
        int leftSum = 0;

        for (int j : arr) {
            rightSum += j;
        }

        for (int i = 0; i < arr.length; i++) {
            if (leftSum == rightSum - arr[i]) {
                return i;
            }

            rightSum -= arr[i];
            leftSum += arr[i];
        }

        return -1;
    }
}
