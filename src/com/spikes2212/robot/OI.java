package com.spikes2212.robot;

import com.spikes2212.robot.commands.basic.Feed;
import com.spikes2212.robot.commands.basic.MoveGearDropper;
import com.spikes2212.robot.commands.groups.LoadAndShoot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI /* GEVALD */ {

    private Joystick leftJoystick;
    private Joystick rightJoystick;

    public OI() {
        leftJoystick = new Joystick(RobotMap.JOYSTICK.LEFT_JOYSTICK);
        rightJoystick = new Joystick(RobotMap.JOYSTICK.RIGHT_JOYSTICK);

        initButtons();
    }

    private void initButtons() {
        JoystickButton shootButton = new JoystickButton(leftJoystick, RobotMap.JOYSTICK.SHOOT_BUTTON);
        JoystickButton droppGearButton = new JoystickButton(leftJoystick, RobotMap.JOYSTICK.DROPP_GEAR_BUTTON);
        JoystickButton feedButton = new JoystickButton(leftJoystick, RobotMap.JOYSTICK.FEED_BUTTON);

        shootButton.whileHeld(new LoadAndShoot());

        droppGearButton.whenPressed(new MoveGearDropper(1));

        feedButton.whileHeld(new Feed());
    }

    private double adjustValue(double speed) {
        return speed * Math.abs(speed);
    }

    public double getLeft() {
        return adjustValue(leftJoystick.getY());
    }

    public double getRight() {
        return adjustValue(rightJoystick.getY());
    }
}
