package com.patterns.factory.absfac.impl;

import com.patterns.factory.absfac.Ingredient;
import com.patterns.factory.absfac.PizzaIngredientFactory;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Ingredient createDough() {
        return null;
    }

    @Override
    public Ingredient createSauce() {
        return null;
    }

    @Override
    public Ingredient createCheese() {
        return null;
    }

    @Override
    public Ingredient createVeggies() {
        return null;
    }

    @Override
    public Ingredient createPepperoni() {
        return null;
    }

    @Override
    public Ingredient createClam() {
        return null;
    }
}
