package com.exercices;

public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println(countDuplicates("Helo world"));
    }

    public static int countDuplicates(String str) {

        str.replace(" ", "");

        char[] charArray = str.toLowerCase().toCharArray();

        int duplicatesCount = duplicatesLinearSearch(charArray);

        return duplicatesCount;
    }

    public static int duplicatesLinearSearch(char[] chars) {
        int duplicatesCount = 0;
        char initialChar = chars[0];

        for (int i = 0; i < chars.length; i++) {
            if(i >= 1) {
                if(chars[i] == chars[i - 1]) {
                    duplicatesCount++;
                }
            } else if(initialChar == chars[i + 1]) {
                duplicatesCount++;
            }

        }

        return duplicatesCount;
    }
}
