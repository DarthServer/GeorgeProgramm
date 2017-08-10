package com.spikes2212.robot.commands.basic;

import com.spikes2212.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Load extends Command {

    private double speed1;
    private double speed2;

    public Load(double speed1, double speed2) {
        requires(Robot.loader);

        this.speed1 = speed1;
        this.speed2 = speed2;
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Robot.loader.move(speed1, speed2);
    }

    @Override
    protected void end() {
        Robot.loader.stop();
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
