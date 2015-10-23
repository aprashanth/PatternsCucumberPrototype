package com.patterns.command.impl;

import com.patterns.command.Command;

/**
 * Created by PXV8340 on 10/23/2015.
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    final int numberOfOnOffButtonPairs = 7;

    public RemoteControl(){
        NoCommand noCommand = new NoCommand();
        onCommands = new Command[numberOfOnOffButtonPairs];
        offCommands = new Command[numberOfOnOffButtonPairs];
        for (int i = 0; i < numberOfOnOffButtonPairs; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slotNumber, Command onCommand, Command offCommand){
        onCommands[slotNumber] = onCommand;
        offCommands[slotNumber] = offCommand;
    }

    public void onButtonPressed(int slotNumber) {
        onCommands[slotNumber].execute();
    }

    public void offButtonPressed(int slotNumber) {
        offCommands[slotNumber].execute();
    }

    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("###############  Remote Control ###############");
        for (int i = 0; i < numberOfOnOffButtonPairs; i++) {
            buffer.append("Slot Number: " + i +
                            "\n\t\t onCommand = " + onCommands[i].getClass().getName() +
                            "\n offCommand = " + offCommands[i].getClass().getName());
            buffer.append("\n==============================================================================================");
        }
        return buffer.toString();
    }

}
