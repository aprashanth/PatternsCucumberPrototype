package com.java.dinterfaces;

/**
 * Created by PXV8340 on 10/13/2015.
 */
public class TestDefaults {

    public static void main (String args[]) {

        SimpleDefault sdi =  SimpleStaticInterface.create(SimpleDefaultImpl::new);
        System.out.println(sdi.printName());
        SimpleDefault sdio = SimpleStaticInterface.create(SimpleDefaultImplOverride::new);
        System.out.println(sdio.printName());
    }
}
