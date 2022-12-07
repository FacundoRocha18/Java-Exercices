package com.openbootcamp;

public class StringConcat {

    public static void main(String[] args) {
        String[] names = { "Facundo", "Daniela", "Nacho", "Richard" };

        System.out.println(concat(names));
    }

    public static String concat(String[] arr) {
        String namesConcat = "";
        for (int i = 0; i < arr.length; i++) {
            namesConcat += " " + arr[i];
        }
        return namesConcat.trim();
    }
}
