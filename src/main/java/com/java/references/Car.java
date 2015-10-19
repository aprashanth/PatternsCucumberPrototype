package com.java.references;

import java.util.function.Supplier;

/**
 * Created by PXV8340 on 10/13/2015.
 */
public class Car {

    public static void printCarName(final Car car) {
        System.out.println("Car Name " + car.toString());
    }

    public static Car create(Supplier<Car> supplier) {
        return supplier.get();
    }

    public void followCar(final Car police) {
        System.out.println("Following car " + police);
    }

    public void collide() {
        System.out.println("Colided with a car");
    }

}
