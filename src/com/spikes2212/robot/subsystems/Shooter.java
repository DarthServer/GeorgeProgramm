package com.spikes2212.robot.subsystems;

import com.spikes2212.robot.commands.basic.Shoot;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

    private SpeedController motor;
    private Encoder encoder;


    public static final double SHOOTING_SPEED = 0.2;

    public Shooter(SpeedController motor, Encoder encoder) {
        this.motor = motor;
        this.encoder = encoder;
    }

    public void move(double speed) {
        motor.set(speed);
    }

    public void stop() {
        move(0);
    }
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new Shoot(0));
    }
}
