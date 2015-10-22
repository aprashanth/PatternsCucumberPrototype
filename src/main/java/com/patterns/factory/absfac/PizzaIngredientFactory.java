package com.patterns.factory.absfac;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public interface PizzaIngredientFactory {

    public Ingredient createDough();
    public Ingredient createSauce();
    public Ingredient createCheese();
    public Ingredient createVeggies();
    public Ingredient createPepperoni();
    public Ingredient createClam();

}
