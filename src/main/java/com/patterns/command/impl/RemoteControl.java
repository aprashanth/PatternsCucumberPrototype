package com.patterns.command.impl;

import com.patterns.command.Command;

/**
 * Created by PXV8340 on 10/23/2015.
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    final int numberOfOnOffButtonPairs = 7;
    Command undoCommad;

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
        undoCommad = onCommands[slotNumber];
    }

    public void offButtonPressed(int slotNumber) {
        offCommands[slotNumber].execute();
        undoCommad = offCommands[slotNumber];
    }

    public void undoButtonWasPushed(){
        this.undoCommad.undo();
    }

    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("###############  Remote Control ###############");
        for (int i = 0; i < numberOfOnOffButtonPairs; i++) {
            buffer.append("\nSlot Number: " + i +
                            "\n\t\t onCommand = " + onCommands[i].getClass().getName() +
                            "\n\t\t offCommand = " + offCommands[i].getClass().getName());
            buffer.append("\n==============================================================================================\n");
        }
        return buffer.toString();
    }

}
