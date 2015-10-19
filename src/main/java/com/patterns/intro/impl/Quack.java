package com.patterns.intro.impl;

import com.patterns.intro.QuackBehavior;

/**
 * Created by PXV8340 on 10/15/2015.
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
