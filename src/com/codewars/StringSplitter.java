package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplitter {

    /**
     * Complete the solution so that it splits the string into pairs of two characters.
     * If the string contains an odd number of characters then it should
     * replace the missing second character of the final pair with an underscore ('_').
     * @author Facundo Rocha
     */

    public static void main(String[] args) {

        List<String[]> charactersPairs = solution("I love pizza");

        for (String[] pair : charactersPairs) {
            for (String characters : pair) {
                System.out.println(characters);
            }
        }

        charactersPairs.forEach((pair) -> {
            System.out.println(Arrays.toString(pair));
        });
    }

    public static List<String[]> solution(String s) {

        String[] words = splitStringIntoWords(s);

        List<String[]> pairs = new ArrayList<>();

        for (String word : words) {
            pairs.add(splitWordIntoCharacters(word));
        }

        return pairs;

    }

    public static String[] splitWordIntoCharacters(String word) {

        word = handleOddWords(word);

        String REGEX = "(?<=\\G..)";

        return word.split(REGEX, 0);

    }

    public static String[] splitStringIntoWords(String s){
        return s.split(" ", 0);
    }

    public static String handleOddWords(String word){
        if (word.length() % 2 == 0 ) {
            return word;
        } else {
            return word.concat("_");
        }
    }
}
