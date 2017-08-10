package com.spikes2212.robot.commands.groups;

import com.spikes2212.robot.commands.basic.Load;
import com.spikes2212.robot.commands.basic.Shoot;
import com.spikes2212.robot.subsystems.Loader;
import com.spikes2212.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class LoadAndShoot extends CommandGroup {


    public LoadAndShoot() {
        addParallel(new Shoot(Shooter.SHOOTING_SPEED));
        addSequential(new Load(Loader.LOADER_MOTOR_1_SPEED, Loader.LOADER_MOTOR_2_SPEED));
    }
}
