package com.patterns.adapter.impl;

import com.patterns.adapter.DuckDummy;
import com.patterns.intro.impl.Duck;
import com.patterns.intro.impl.MallardDuck;
import sun.reflect.generics.scope.DummyScope;

/**
 * Created by PXV8340 on 10/26/2015.
 */
public class TestAdapter {

    public static void main(String args[]) {
        MallardDummyDuck mallardDummyDuck  = new MallardDummyDuck();

        WildTurkey turkey  = new WildTurkey();
        DuckDummy turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says...");
        testDuck(mallardDummyDuck);

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);

    }

    private static void testDuck(DuckDummy duck) {
        duck.quack();
        duck.fly();
    }
}
