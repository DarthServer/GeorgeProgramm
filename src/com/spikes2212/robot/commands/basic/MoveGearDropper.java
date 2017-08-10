package com.spikes2212.robot.commands.basic;

import com.spikes2212.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class MoveGearDropper extends Command {

    private double speed;


    public MoveGearDropper(double speed) {
        requires(Robot.gearDropper);
        this.speed = speed;
    }
    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Robot.gearDropper.move(speed);
    }

    @Override
    protected void end() {
        Robot.gearDropper.move(0);
    }

    @Override
    protected void interrupted() {
        end();
    }

    @Override
    protected boolean isFinished() {
        return !Robot.gearDropper.canMove(speed);
    }

}
