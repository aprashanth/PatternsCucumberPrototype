package com.patterns.factory.impl;

import com.patterns.factory.Pizza;

import java.util.function.Supplier;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public class PepperoniPizza implements Pizza{

    String description = "Pepperoni Pizza";

    public static Pizza create(Supplier<Pizza> supplier){
        return supplier.get();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
