package com.openbootcamp.classes;

public class Car {
    protected String brand;
    protected String model;
    protected String year;
    protected String engine;
    protected Double price;

    public Car(String brand, String model, String year, String engine, Double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", engine='" + engine + '\'' +
                ", price=" + price +
                '}';
    }
}
