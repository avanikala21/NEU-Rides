package edu.neu.info5100.model.Objects;

import java.util.ArrayList;

public class CarsDirectory {
    ArrayList<Car> cars = new ArrayList<Car>();

    public CarsDirectory(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public boolean add(Car car) {
        return cars.add(car);
    }
}
