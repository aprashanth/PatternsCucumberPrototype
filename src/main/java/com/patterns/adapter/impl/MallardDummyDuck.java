package com.patterns.adapter.impl;

import com.patterns.adapter.DuckDummy;

/**
 * Created by PXV8340 on 10/26/2015.
 */
public class MallardDummyDuck implements DuckDummy {
    @Override
    public void quack() {
        System.out.println("I am a Mallard Duck quacking.... Quack Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am a Mallard Duck flying.... Hehaaaaaaaaaa");
    }
}
