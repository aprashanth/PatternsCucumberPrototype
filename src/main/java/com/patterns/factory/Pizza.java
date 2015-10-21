package com.patterns.factory;

import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public interface Pizza {

    default void prepare(){
        System.out.println("Preparing ...");
        System.out.println("Tossing Dough...");
        System.out.println("Adding Sauce...");
        System.out.println("Adding Toppings...");
        System.out.println("Preparing Pizza...");
    }

    default void bake(){
        System.out.println("Bake for 25 mins at 350\"...");
    }

    default void cut() {
        System.out.println("Cut Pizza into diagonal slices...");
    }

    default void box() {
        System.out.println("Boxing Pizza...");
    }


    public String getDescription();


}
