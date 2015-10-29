package com.patterns.command.impl;

import com.patterns.command.vendor.GarageDoor;
import com.patterns.command.vendor.Light;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class RemoteControlTest {

    public static void main(String args[]){

        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light  = new Light("Kitchen");
        LightOnCommand lightCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightCommand);
        remoteControl.buttonPressed();


        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonPressed();

    }
}
