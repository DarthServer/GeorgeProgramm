package com.spikes2212.robot.commands.groups;

import com.spikes2212.robot.Robot;
import com.spikes2212.robot.commands.basic.DriveTank;
import com.spikes2212.robot.commands.basic.Feed;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class DriveAndFeed extends CommandGroup {

    public DriveAndFeed(int timeout) {
        addParallel(new Feed());
        addSequential(new DriveTank(Robot.oi::getLeft, Robot.oi::getRight), timeout);
    }

}
