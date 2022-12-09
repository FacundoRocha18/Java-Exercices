package com.openbootcamp.fundamentosProgramacion;

public class Tema4 {
    public static void main(String[] args) {
        esPositivo(1);
        esPositivo(0);
        esPositivo(-1);
        bucleWhile();
        bucleDoWhile();
        bucleFor();
        estructuraSwitch("Verano");
    }

    public static void esPositivo(int numero) {
        if(numero == 0) {
            System.out.println("El numero es 0");
        } else if (numero > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }

    public static void bucleWhile() {
        int index = 0;

        while (index < 3) {
            index++;
            System.out.println(index);
        }
    }

    public static void bucleDoWhile() {
        int index = 0;

        do {
            System.out.println(index);
            index++;
        } while(index == 0);
    }

    public static void bucleFor() {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    public static void estructuraSwitch(String estacion) {
        switch (estacion) {
            case "Verano":
                System.out.println(estacion);
                break;
            case "Otoño":
                System.out.println(estacion);
            break;
            case "Invierno":
                System.out.println(estacion);
                break;
            case "Primavera":
                System.out.println(estacion);
                break;
            default:
                System.out.println("El valor no es una estacion");
        }

    }
}
