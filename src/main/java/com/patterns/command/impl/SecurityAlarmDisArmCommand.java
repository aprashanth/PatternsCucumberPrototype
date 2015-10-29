package com.patterns.command.impl;

import com.patterns.command.Command;
import com.patterns.command.vendor.SecurityAlarm;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class SecurityAlarmDisArmCommand implements Command {

    SecurityAlarm securityAlarm;

    public SecurityAlarmDisArmCommand(SecurityAlarm securityAlarm){
        this.securityAlarm = securityAlarm;
    }

    @Override
    public void execute() {
        securityAlarm.disarm();
    }

    @Override
    public void undo() {
        securityAlarm.arm();
    }
}
