package com.java.paramnames;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by PXV8340 on 10/14/2015.
 */
public class ParameterNames {

    public static void main (String args[]) throws NoSuchMethodException {
        Method method = ParameterNames.class.getMethod("main", String[].class);
        for(final Parameter parameter: method.getParameters()) {
            System.out.println(parameter.getName());
        }
    }
}
