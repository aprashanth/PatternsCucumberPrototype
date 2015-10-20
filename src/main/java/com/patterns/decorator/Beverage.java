package com.patterns.decorator;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public abstract class Beverage {

   public enum Size {TALL, GRANDE, VENTI};

    public Size size = Size.TALL;

    public String description = "Unknown Beverage";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

}
