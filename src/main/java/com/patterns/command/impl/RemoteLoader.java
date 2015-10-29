package com.patterns.command.impl;

import com.patterns.command.vendor.*;

/**
 * Created by vadulasp on 10/23/15.
 */
public class RemoteLoader {


    public static void main (String args[]) {

        RemoteControl remoteControl = new RemoteControl();

        Light kitchenLIght = new Light("Kitchen");
        LightOffCommand kitchenlightOffCommand = new LightOffCommand(kitchenLIght);
        LightOnCommand kitchenlightOnCommand = new LightOnCommand(kitchenLIght);

        Light outdoorLight = new Light("Outdoor");
        LightOffCommand outdoorlightOffCommand = new LightOffCommand(outdoorLight);
        LightOnCommand outdoorlightOnCommand = new LightOnCommand(outdoorLight);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        SecurityAlarm securityAlarm = new SecurityAlarm();
        SecurityAlarmArmCommand securityAlarmArmCommand = new SecurityAlarmArmCommand(securityAlarm);
        SecurityAlarmDisArmCommand securityAlarmDisArmCommand = new SecurityAlarmDisArmCommand(securityAlarm);

        Sprinkler sprinkler = new Sprinkler();
        SprinklerOnCommand sprinklerOnCommand = new SprinklerOnCommand(sprinkler);
        SprinklerOffCommand sprinklerOffCommand = new SprinklerOffCommand(sprinkler);

//        Stereo stereo = new Stereo();
//        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
//        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        ApplicanceControl applicanceControl = new ApplicanceControl();
        ApplianceOnCommand applianceOnCommand = new ApplianceOnCommand(applicanceControl);
        ApplianceOffCommand applianceOffCommand = new ApplianceOffCommand(applicanceControl);

        remoteControl.setCommand(1, kitchenlightOnCommand, kitchenlightOffCommand);
        remoteControl.setCommand(2, outdoorlightOnCommand, outdoorlightOffCommand);


        System.out.println(remoteControl.toString());

        remoteControl.onButtonPressed(1);
        remoteControl.onButtonPressed(2);
        remoteControl.offButtonPressed(1);
        remoteControl.offButtonPressed(2);
        remoteControl.undoButtonWasPushed();
    }


}
