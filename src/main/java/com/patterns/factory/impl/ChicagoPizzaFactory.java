package com.patterns.factory.impl;

import com.patterns.factory.Pizza;
import com.patterns.factory.method.PizzaFactory;

/**
 * Created by vadulasp on 10/20/15.
 */
public class ChicagoPizzaFactory implements PizzaFactory{

    @Override
    public Pizza createPizza(String pizzaType){

        Pizza pizza = null;
        if (pizzaType.equals("Chicago")) {
            pizza = ChicagoPizza.create(ChicagoPizza::new);
        }else if (pizzaType.equals("Clam")) {
            pizza = ClamPizza.create(ClamPizza::new);
        }if (pizzaType.equals("Veggie")) {
            pizza = VeggiePizza.create(VeggiePizza::new);
        }if (pizzaType.equals("Pepperoni")) {
            pizza = PepperoniPizza.create(PepperoniPizza::new);
        }

        return pizza;

    }
}
