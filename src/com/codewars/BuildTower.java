package com.codewars;

public class BuildTower {
    public static void main(String[] args) {
        String[] tower = generateTower(5);
        for (String floor : tower) {
            System.out.println(floor);
        }
    }

    public static String[] generateTower(int floors) {
        String[] tower = new String[floors];
        char represent = '*';
        char[] floor = new char[5];
        for (int i = 0; i < floors; i++) {
            tower[i] = "*****";
        }
        return tower;
    }
}
