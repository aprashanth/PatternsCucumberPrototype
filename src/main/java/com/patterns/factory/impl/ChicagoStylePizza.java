package com.patterns.factory.impl;

import com.patterns.factory.Pizza;

/**
 * Created by vadulasp on 10/21/15.
 */
public interface ChicagoStylePizza extends Pizza {

    default void cut() {
        System.out.println("Cut the pizza into square slices..");
    }

}
