package com.exercices;

public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println(countDuplicates("Hello world"));
    }

    public static int countDuplicates(String str) {

        str.replace(" ", "");

        char[] charArray = str.toCharArray();

        int duplicatesCount = linearSearch(charArray);

        return duplicatesCount;
    }

    public static char getPreviousChar(char[] chars) {
        char initialChar = chars[0];
        char previousChar = initialChar;
        for (int i = 0; i < chars.length; i++) {

            if(i != 0) {
                return previousChar = chars[i - 1];
            }

        }
        return previousChar;
    }

    public static int linearSearch(char[] chars) {
        int count = 0;
        char initialChar = chars[0];

        for (int i = 0; i < chars.length; i++) {
            if(i >= 1) {
                if(chars[i] == chars[i - 1]) {
                    count++;
                }
            } else if(initialChar == chars[i + 1]) {
                count++;
            } else {
                continue;
            }

        }

        return count;
    }
}
