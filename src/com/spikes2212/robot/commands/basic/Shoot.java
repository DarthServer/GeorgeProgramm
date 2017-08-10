package com.spikes2212.robot.commands.basic;

import com.spikes2212.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command {

    private double speed;

    public Shoot(double speed) {
        this.speed = speed;
    }
    @Override
    protected void execute() {
    }

    @Override
    protected void end() {
        Robot.shooter.stop();
    }

    @Override
    protected void interrupted() {
        end();
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

}
