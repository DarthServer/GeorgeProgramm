package com.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Feeder extends Subsystem {

    private SpeedController motor;

    public static final double FEEDER_MOTOR_SPEED = 0.1;

    public Feeder(SpeedController motor) {
        this.motor = motor;
    }

    public void move() {
        motor.set(FEEDER_MOTOR_SPEED);
    }

    public void stop() {
        motor.set(0);
    }


    @Override
    protected void initDefaultCommand() {

    }
}
