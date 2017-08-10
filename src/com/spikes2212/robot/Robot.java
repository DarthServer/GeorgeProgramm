
package com.spikes2212.robot;

import com.ctre.CANTalon;
import com.spikes2212.robot.components.MotorGroup;
import com.spikes2212.robot.subsystems.Drivetrain;
import com.spikes2212.robot.subsystems.Feeder;
import com.spikes2212.robot.subsystems.GearDropper;
import com.spikes2212.robot.subsystems.Loader;
import com.spikes2212.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
public class Robot extends IterativeRobot {
	public static Loader loader;
	public static Drivetrain drivetrain;
	public static Feeder feeder;
	public static GearDropper gearDropper;
	public static Shooter shooter;
	public static OI oi;
	@Override
	public void robotInit() {

		// init subsystems

		drivetrain = new Drivetrain(new MotorGroup(new CANTalon(RobotMap.CAN.LEFT_MOTOR_1),
				new CANTalon(RobotMap.CAN.LEFT_MOTOR_2)),
				new MotorGroup(new CANTalon(RobotMap.CAN.RIGHT_MOTOR_1), new CANTalon(RobotMap.CAN.RIGHT_MOTOR_2)));
		loader = new Loader(new VictorSP(RobotMap.PWM.LOADER_MOTOR_1), new VictorSP(RobotMap.PWM.LOADER_LOADER_2));
		feeder = new Feeder(new VictorSP(RobotMap.PWM.FEEDER_MOTOR));
		shooter = new Shooter(new CANTalon(RobotMap.CAN.SHOOTER_MOTOR));
		gearDropper = new GearDropper(new VictorSP(RobotMap.PWM.GEAR_DROPPER_MOTOR),
				new DigitalInput(RobotMap.DIO.GEAR_DROPPER_OPEN),
				new DigitalInput(RobotMap.DIO.GEAR_DROPPER_CLOSE));

		// init oi

		oi = new OI();
	}

	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {
	}
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}


	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
