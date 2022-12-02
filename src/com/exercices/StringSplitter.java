package com.exercices;

import java.util.List;

public class StringSplitter {

    /**
     * Complete the solution so that it splits the string into pairs of two characters.
     * If the string contains an odd number of characters then it should
     * replace the missing second character of the final pair with an underscore ('_').
     * @author Facundo Rocha
     */

    public static void main(String[] args) {

        /*String s = "Hello World!!!!";

        String[] wordPairs = splitStringIntoWords(s);

        String[] charactersPairs;

        for (String word : wordPairs) {

            charactersPairs = splitWordIntoCharacters(word);
            // Dev
            for(int i = 0; i < charactersPairs.length; i++) {
                System.out.println(charactersPairs[i]);
            }
        }*/

        System.out.println(solution("awo pdjoawpjkdpo2k92ie0odpajwopdjaw9d"));
    }

    public static String[] solution(String s) {

        String[] wordPairs = splitStringIntoWords(s);

        String[] charactersPairs = new String[5];

        for (String word : wordPairs) {

            charactersPairs = splitWordIntoCharacters(word);
            // Dev
            for(int i = 0; i < charactersPairs.length; i++) {
                System.out.println(charactersPairs[i]);
            }
        }

        return charactersPairs;
    }

    private static String[] splitWordIntoCharacters(String word) {

        word = handleOddWords(word);

        String REGEX = "(?<=\\G..)";

        String[] splitInPairs = word.split(REGEX, 0);

        return splitInPairs;

    }

    private static String[] splitStringIntoWords(String s){
        return s.split(" ", 0);
    }

    private static String handleOddWords(String word){
        if (word.length() % 2 == 0 ) {
            return word;
        } else {
            return word.concat("_");
        }

    }

    /*
    private static String[] handleSymbols(String s) {
        String REGEX = "[^\\w\\s]|_";

        String[] symbols = s.split(REGEX, 0);

        return symbols;
    }
    */
}
