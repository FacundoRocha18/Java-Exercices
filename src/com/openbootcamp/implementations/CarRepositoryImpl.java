package com.openbootcamp.implementations;

import com.openbootcamp.classes.Car;
import com.openbootcamp.interfaces.CarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl implements CarRepository {

    List<Car> carList = new ArrayList<>();
    public boolean save(Car car) {
        return carList.add(car);
    }

    public List<Car> findAll() {
       return carList;
    }

    public Car findBy(Car car) {
        int carIndex = carList.indexOf(car);
        return carList.get(carIndex);
    }

    public boolean delete(Car car){
        return carList.remove(car);
    }

}
