package com.patterns.factory;

import java.util.function.Supplier;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public interface Pizza {


    default void prepare(){
        System.out.println("Preparing Pizza...");
    }

    default void bake(){
        System.out.println("Baking Pizza...");
    }

    default void cut() {
        System.out.println("Cutting Pizza...");
    }

    default void box() {
        System.out.println("Boxing Pizza...");
    }

    public String getDescription();

}
