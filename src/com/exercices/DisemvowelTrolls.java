package com.exercices;

public class DisemvowelTrolls {

    public static void main(String[] args) {

        System.out.println(disemvowel("Hello world"));
    }

    public static String disemvowel(String str) {
        String REGEX = "[AEIOUaeiou]";

        return str.replaceAll(REGEX, "");
    }

}
