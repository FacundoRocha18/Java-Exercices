package com.exercices;

public class Types {

    public static void main(String[] args) {
        // Primitives cant be null
        // integers
        byte byteNumber = 1; // 1 byte
        System.out.println(byteNumber);
        short shortNumber = 2; // 2 byte
        System.out.println(shortNumber);
        int intNumber = 3; // 4 byte
        System.out.println(intNumber);
        long longNumber = 4; // 8 byte
        System.out.println(longNumber);

        // floating point
        float floatDecimal = 4.3f; // less capacity
        System.out.println(floatDecimal);
        double doubleDecimal = 4.3d; // more capacity
        System.out.println(doubleDecimal);

        // characters
        char character = 'f'; // allows only one character per variable
        System.out.println(character);

        // booleans
        boolean truthy = true; // boolean true value
        System.out.println(truthy);
        boolean falsy = false; // boolean false value
        System.out.println(falsy);

        // strings
        String name = "Facundo Rocha"; // characters chain
        System.out.println(name);

        // Wrapper types can be null
        Integer number = null;
        System.out.println(number);
        Long number2 = 2L;
        System.out.println(number2);
    }
}
