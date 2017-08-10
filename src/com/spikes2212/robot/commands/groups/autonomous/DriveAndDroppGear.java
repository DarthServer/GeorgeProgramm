package com.spikes2212.robot.commands.groups.autonomous;

import com.spikes2212.robot.commands.basic.DriveTank;
import com.spikes2212.robot.commands.basic.MoveGearDropper;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class DriveAndDroppGear extends CommandGroup {

    public DriveAndDroppGear() {
        addSequential(new DriveTank(1, 1), 5);
        addSequential(new MoveGearDropper(1));
    }

}
