package com.java.dinterfaces;

/**
 * Created by PXV8340 on 10/13/2015.
 */
public interface SimpleDefault {

    default String printName(){
        return "Dangerous: Don't try it at home";
    }
}
