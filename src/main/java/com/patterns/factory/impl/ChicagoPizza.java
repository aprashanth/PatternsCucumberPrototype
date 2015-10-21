package com.patterns.factory.impl;

import com.patterns.factory.Pizza;

import java.util.function.Supplier;

/**
 * Created by vadulasp on 10/20/15.
 */
public class ChicagoPizza implements Pizza{


    private String description = "Chicago Style Pizza";

    public static Pizza create(Supplier<Pizza> supplier){
        return supplier.get();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
