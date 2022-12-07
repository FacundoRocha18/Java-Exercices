package com.openbootcamp.interfaces;

import com.openbootcamp.classes.Car;

import java.util.List;

public interface CarRepository {
    boolean save(Car car);
    List<Car> findAll();
    Car findBy(Car car);
    boolean delete(Car car);
}
