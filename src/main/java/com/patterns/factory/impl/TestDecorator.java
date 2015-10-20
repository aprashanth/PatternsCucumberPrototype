package com.patterns.factory.impl;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public class TestDecorator {

    public static void main(String args[]){
        PizzaStore pizzaStore = PizzaStore.create(PizzaStore::new);
        pizzaStore.orderPizza("Cheeze");
        System.out.println("\n");
        pizzaStore.orderPizza("Pepperoni");
        System.out.println("\n");
        pizzaStore.orderPizza("Veggie");
        System.out.println("\n");
        pizzaStore.orderPizza("Clam");
        System.out.println("\n");

    }

}
