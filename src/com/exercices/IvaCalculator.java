package com.exercices;

public class IvaCalculator {

    public static void main(String[] args) {
        double priceWithIva = addIva(199.99);

        System.out.println(priceWithIva);
    }

    /**
     * This method receives a price and returns price + IVA
     * @author Facundo Rocha
     * @param price Double
     * @return price * 1.22 (Uruguay IVA)
     */
    public static double addIva(double price) {
        return price * 1.22;
    }
}
