package com.java.lambdas;

import java.util.*;

/**
 * Created by PXV8340 on 10/12/2015.
 */
public class TestLambdas {


    public static void main (String args[]) {

        Arrays.asList("a", "b").forEach(e -> System.out.println(e));

        Arrays.asList("Good", "Bad", "Ugly").forEach(
                (String e) -> {
                    System.out.println(e.compareTo(e));
                    System.out.println(e);
        });

        //Sort
//
        List personList = new ArrayList<Person>();

        personList.add(new Person("Tom", "M"));
        personList.add(new Person("Matt", "M"));
        personList.add(new Person("Xavier", "M"));
        personList.add(new Person("Aldo", "M"));
        personList.add(new Person("Kris", "M"));

//        personList.sort((e1, e2) -> {
//            return (Person) e1.getName().compareTo(e2.getName());
//        });
//
//        personList.forEach(e -> System.out.println(e));

//        personList.stream().map(Person::getName).sorted().forEach(name -> System.out.println(name));


    }
}
