package com.openbootcamp;

public class SmartDevice {
    public String brand;
    public String model;
    public String year;
    public Double price;

    public SmartDevice() {
    }

    public SmartDevice(String brand, String model, String year, Double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
}
