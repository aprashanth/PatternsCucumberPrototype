package com.java.optionals;

import java.util.Optional;

/**
 * Created by PXV8340 on 10/14/2015.
 */
public class OptionalExample {

    public static void main(String args[]) {
        Optional<String> fullname = Optional.ofNullable("Tom");
        System.out.println("Fullname is present? " + fullname.isPresent());
        System.out.println(fullname.orElseGet(() -> "[none]"));
        System.out.println(fullname.map(s -> "Hey " + s + "!!").orElse("Hey Stranger!!!!!"));



    }
}
