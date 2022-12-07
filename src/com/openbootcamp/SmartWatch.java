package com.openbootcamp;

public class SmartWatch extends SmartDevice {

    public SmartWatch(String brand, String model, String year, Double price) {
        super(brand, model, year, price);
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                '}';
    }
}
