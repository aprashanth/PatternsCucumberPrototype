package com.java.references;

import java.util.Arrays;
import java.util.List;

/**
 * Created by PXV8340 on 10/13/2015.
 */
public class TestCar {

    public static void main (String args[]) {
        //First: Constructor reference with Class::new
        Car car = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car);

        //second: Static method reference
        cars.forEach(Car::printCarName);
        //third: Class method reference
        cars.forEach(Car::collide);
        //fourth: Instance method reference
        Car policeCar = Car.create(Car::new);
        cars.forEach(policeCar::followCar);
    }
}
