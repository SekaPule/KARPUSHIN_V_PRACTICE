package com.example.karpushin_v_practice;

/*
    8 kyu
    https://www.codewars.com/kata/56a4addbfd4a55694100001f/train/java
 */
public class ValidateHello {

    public static boolean validateHello(String greetings) {
        String[] greetingPatterns = {
                "hello",
                "ciao",
                "salut",
                "hallo",
                "ahoj ",
                "hola ",
                "czesc",
        };

        for (String pattern : greetingPatterns) {
            if (greetings.toLowerCase().contains(pattern)) {
                return true;
            }
        }

        return false;
    }
}
