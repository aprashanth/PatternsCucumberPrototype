package com.patterns.intro.impl;

import java.util.function.Supplier;

/**
 * Created by PXV8340 on 10/15/2015.
 */
public class ModelDuck extends Duck {

    public static ModelDuck create(Supplier<ModelDuck> supplier ) {
        return supplier.get();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck..hehehehe");
    }
}
