package com.spikes2212.robot.commands.basic;

import com.spikes2212.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Feed extends Command {

    public Feed() {
        requires(Robot.feeder);
    }
    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Robot.feeder.move();
    }

    @Override
    protected void end() {
        Robot.feeder.stop();
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
