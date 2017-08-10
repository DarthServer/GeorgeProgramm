package com.spikes2212.robot.commands.basic;

import com.spikes2212.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

import java.util.function.Supplier;

public class DriveTank extends Command {

    private Supplier<Double> leftSupplier, rightSupplier;

    public DriveTank(Supplier<Double> leftSupplier, Supplier<Double> rightSupplier) {
        this.leftSupplier = leftSupplier;
        this.rightSupplier = rightSupplier;
        requires(Robot.drivetrain);
    }

    public DriveTank(double leftSpeed, double rightSpeed) {
        this(() -> leftSpeed, () -> rightSpeed);
    }


    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Robot.drivetrain.move(leftSupplier.get(), rightSupplier.get());
    }

    @Override
    protected void end() {
        Robot.drivetrain.stop();
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
