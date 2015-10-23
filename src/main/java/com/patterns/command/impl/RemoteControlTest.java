package com.patterns.command.impl;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class RemoteControlTest {

    public static void main(String args[]){

        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light  = new Light();
        LightOnCommand lightCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightCommand);
        remoteControl.buttonPressed();


        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonPressed();

    }
}
