package com.patterns.adapter.impl;

import com.patterns.adapter.Turkey;

/**
 * Created by PXV8340 on 10/26/2015.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying short distace");

    }
}
