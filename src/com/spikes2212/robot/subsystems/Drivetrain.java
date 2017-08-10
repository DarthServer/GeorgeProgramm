package com.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
    private SpeedController leftMotor;
    private SpeedController rightMotor;

    public Drivetrain(SpeedController leftSpeedController, SpeedController rightSpeedController) {
        this.leftMotor = leftSpeedController;
        this.rightMotor = rightSpeedController;
    }


    public void move(double leftSpeed, double rightSpeed) {
        leftMotor.set(leftSpeed);
        rightMotor.set(rightSpeed);
    }

    public void stop() {
        move(0, 0);
    }

    @Override
    protected void initDefaultCommand() {

    }
}
