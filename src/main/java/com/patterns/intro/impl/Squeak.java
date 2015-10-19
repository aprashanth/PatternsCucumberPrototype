package com.patterns.intro.impl;

import com.patterns.intro.QuackBehavior;

/**
 * Created by PXV8340 on 10/15/2015.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak...");
    }
}
