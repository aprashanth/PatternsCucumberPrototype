package com.java.dinterfaces;

import java.util.function.Supplier;

/**
 * Created by PXV8340 on 10/13/2015.
 */
public class SimpleStaticInterface {

    static SimpleDefault create(Supplier<SimpleDefault> supplier) {
        return supplier.get();
    }
}
