package com.patterns.factory.impl;

import com.patterns.factory.PizzaFactory;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public class TestFactory {

    public static void main(String args[]){
        PizzaStore pizzaStore = PizzaStore.create(PizzaStore::new);
        pizzaStore.setPizzaFactory(new SimplePizzaFactory());
        pizzaStore.orderPizza("Cheeze");
        System.out.println("\n");
        pizzaStore.orderPizza("Pepperoni");
        System.out.println("\n");
        pizzaStore.orderPizza("Veggie");
        System.out.println("\n");
        pizzaStore.orderPizza("Clam");
        System.out.println("\n");

        PizzaStore chicagoStore = PizzaStore.create(PizzaStore::new);
        chicagoStore.setPizzaFactory(new ChicagoPizzaFactory());
        chicagoStore.orderPizza("Chicago");

        AbstractPizzaStore chicagoPizzaStore = ChicagoPizzaStore.create(ChicagoPizzaStore::new);
        chicagoPizzaStore.orderPizza("Cheese");

    }

}
