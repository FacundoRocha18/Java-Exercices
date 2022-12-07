package com.codewars;

import java.util.*;

public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println(countDuplicates("Hello world"));
    }

    public static int countDuplicates(String str) {

        str = str.replace(" ", "").toLowerCase();

        String[] characters = sort(str.split(""));

        Map<Integer, String> duplicates = new HashMap<>();

        int duplicatesCount = 0;

        for (int i = 0; i < characters.length; i++) {
            if(i > 0) {
                if(characters[i].equals(characters[i - 1]) && i != i -1) {
                    if(!duplicates.containsValue(characters[i])) {
                        duplicates.put(i, characters[i]);
                        duplicatesCount++;
                    }
                }
            }
        }
        return duplicatesCount;
    }

    public static String[] sort(String[] arr){
        int unsorted = arr.length - 1;
        String temp = "";
        boolean sorted = false;

        while(!sorted){
            sorted = true;
            for (int i = 0; i < unsorted; i++) {
                if(arr[i].compareTo(arr[i + 1]) > 0) {
                    sorted = false;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            unsorted--;
        }

        return arr;
    }




}
