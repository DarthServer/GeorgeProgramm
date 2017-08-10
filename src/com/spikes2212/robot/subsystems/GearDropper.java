package com.spikes2212.robot.subsystems;

import com.spikes2212.robot.commands.basic.MoveGearDropper;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearDropper extends Subsystem {

    private SpeedController motor;
    private DigitalInput openSwitch;
    private DigitalInput closeSwitch;


    public GearDropper(SpeedController motor, DigitalInput openSwitch, DigitalInput closeSwitch) {
        this.closeSwitch = closeSwitch;
        this.openSwitch = openSwitch;
        this.motor = motor;
    }

    public boolean canMove(double speed) {
        return !((speed > 0 && openSwitch.get()) || (speed < 0 && closeSwitch.get()));
    }

    public void move(double speed) {
        if (canMove(speed)) motor.set(speed);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new MoveGearDropper(-1));
    }
}
