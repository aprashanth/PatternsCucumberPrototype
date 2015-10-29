package com.patterns.command.vendor;

/**
 * Created by PXV8340 on 10/23/2015.
 */
public class Stereo {
    public void on(){
        System.out.println("Stereo is ON...");
    }

    public void off(){
        System.out.println("Stereo is OFF...");
    }

    public void setCD(){
        System.out.println("Stereo set to CD...");
    }

    public void setDVD(){
        System.out.println("Stereo set to DVD...");
    }

    public void setRadio(){
        System.out.println("Stereo set to Radio...");
    }

    public void setVolume(int volume){
        System.out.println("Stereo volume set to " + volume);
    }
}
