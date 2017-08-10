package com.spikes2212.robot.subsystems;

import com.spikes2212.robot.commands.basic.Load;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Loader extends Subsystem {

    public static final double LOADER_MOTOR_1_SPEED = 0.3;
    public static final double LOADER_MOTOR_2_SPEED = 0.3;

    private SpeedController motor1;
    private SpeedController motor2;

    public Loader(SpeedController motor1, SpeedController motor2) {
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    public void move(double speed1, double speed2) {
        motor1.set(speed1);
        motor2.set(speed2);
    }

    public void stop() {
        move(0, 0);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new Load(0, 0));
    }
}
