package com.openbootcamp.temas789;

import java.io.*;
import java.util.*;

public class Temas789 {
    public static void main(String[] args) {


    }

    public static String reverseString(String text) {

        char character;
        String reversedText = "";

        for (int i = 0; i < text.length(); i++) {

            character = text.charAt(i);
            reversedText = character + reversedText;
        }

        System.out.println(reversedText);
        return reversedText;
    }

    public static String[] loopArray(String[] arr) {

        for (String str : arr) {
            System.out.println(str);
        }
        return arr;
    }

    public static Integer[][] loopBiArray(Integer[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Columna: " + i + " Fila: " + j + " Dato: " + arr[i][j]);
            }
        }
        return arr;
    }

    public static Vector<Integer> deleteElements(Vector<Integer> vec) {

        vec.remove(1);
        vec.remove(1);
        System.out.println(vec);
        return vec;
    }

    /**
     * El problema es que para llegar al numero deseado, se consumirian muchos recursos del equipo por el peso que
     * tiene hacer el calculo para aumentar el limite, ademas, no llegariamos a los 1000 justos, de hecho nos pasariamos
     */

    public static void lists() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hola");
        stringArrayList.add("mundo");
        stringArrayList.add("en");
        stringArrayList.add("español");

        LinkedList<String> stringLinkedList = new LinkedList<>(stringArrayList);

        stringArrayList.forEach((string) -> {
            System.out.println("ArrayList: " + string);
        });


        stringLinkedList.forEach((string) -> {
            System.out.println("LinkedList: " + string);
        });
    }

    public static ArrayList<Integer> removePairNumbers(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if((list.get(i) % 2) == 0) {
                list.remove(i);
            }
        }
        list.forEach((item) -> {
            System.out.println(item);
        });
        return list;
    }

    public static Integer divideByZero(Integer A) throws ArithmeticException {
        int result = 0;
        try {
            result = A / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        return result;
    }

    public static boolean copyFile(String fileIn, String fileOut) throws IOException {
        boolean result = false;
        try {
            InputStream file = new FileInputStream(fileIn);
            int data = file.read();
            String text = "";

            while (data != -1) {
                text += (char)data;
                data = file.read();
            }

            PrintStream info = new PrintStream(fileOut);
            info.println(text);

            result = true;
        } catch (IOException exception) {
            System.out.println("IO failure");
        }

        return result;
    }

    public static boolean copyFileWArray(String fileIn, String fileOut) throws IOException {
        boolean result = false;

        try {
            HashMap<String, String> data = new HashMap<>();

            String text = getFileData(fileIn);

            String[] arr = text.split(" ");

            for (int i = 0; i < arr.length; i++) {
                data.put("id: " + i + " data: ", arr[i]);
            }


            result = setFileData(fileOut, data);
        } catch (IOException e) {
            System.out.println("IO failure");
        }
        return result;
    }

    public static String getFileData(String fileIn) throws IOException {

        String text = "";

        try {
            InputStream file = new FileInputStream(fileIn);

            int data = file.read();

            while (data != -1) {
                text += (char)data;
                data = file.read();
            }

        } catch (IOException e) {
            System.out.println("Failure reading file data");
        }

        return text;
    }

    public static boolean setFileData(String fileOut, HashMap<String, String> data) throws IOException {
        boolean result = false;

        try {
            PrintStream printer = new PrintStream(fileOut);

            printer.println(data);

            result = true;

            if(result) {
                System.out.println("Data saved successfully");
            }
        } catch (IOException e) {
            System.out.println("Failure writing data into file");
        }

        return result;
    }
}
