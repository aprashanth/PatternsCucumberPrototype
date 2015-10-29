package com.patterns.command.impl;

import com.patterns.command.Command;
import com.patterns.command.vendor.Light;
import com.patterns.command.vendor.SecurityAlarm;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class SecurityAlarmArmCommand implements Command {

    SecurityAlarm securityAlarm;

    public SecurityAlarmArmCommand(SecurityAlarm securityAlarm){
        this.securityAlarm = securityAlarm;
    }

    @Override
    public void execute() {
        securityAlarm.arm();
    }

    @Override
    public void undo() {
        securityAlarm.disarm();
    }
}
