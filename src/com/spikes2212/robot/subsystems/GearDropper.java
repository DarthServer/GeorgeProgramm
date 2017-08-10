package com.spikes2212.robot.subsystems;

import com.spikes2212.robot.commands.basic.MoveGearDropper;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearDropper extends Subsystem {

    private SpeedController motor;
    private DigitalInput openSwitch;
    private DigitalInput closeSwitch;
    
    public static final double OPEN_DROPPER_SPEED = 0.1;
    public static final double CLOSE_DROPPER_SPEED = -0.1;


    public GearDropper(SpeedController motor, DigitalInput openSwitch, DigitalInput closeSwitch) {
        this.motor = motor;
        this.closeSwitch = closeSwitch;
        this.openSwitch = openSwitch;
    }

    public boolean canMove(double speed) {
        return !((speed < 0 && openSwitch.get()) || (speed > 0 && closeSwitch.get()));
    }

    public void move(double speed) {
        if (canMove(speed)) motor.set(speed);
    }

    @Override
    protected void initDefaultCommand() {
         setDefaultCommand(new MoveGearDropper(CLOSE_DROPPER_SPEED));
    }
}
