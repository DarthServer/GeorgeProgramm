
package com.spikes2212.robot;


public class RobotMap {


    public static interface PWM {
        public static final int LOADER_MOTOR_1  = 2;
        public static final int LOADER_LOADER_2 = 3;
        public static final int FEEDER_MOTOR = 0;
        public static final int GEAR_DROPPER_MOTOR = 1;


    }

    public static interface CAN {
        public static final int LEFT_MOTOR_1 = 6;
        public static final int LEFT_MOTOR_2 = 3;

        public static final int RIGHT_MOTOR_1 = 5;
        public static final int RIGHT_MOTOR_2 = 1;

        public static final int CLIMBER_MOTOR = 2;
        public static final int SHOOTER_MOTOR = 4;
    }

    public static interface DIO {
        public static final int GEAR_DROPPER_OPEN  = 0;
        public static final int GEAR_DROPPER_CLOSE = 1;

    }

    public static interface JOYSTICK {
        public static final int LEFT_JOYSTICK = 0;
        public static final int RIGHT_JOYSTICK = 1;


        public static final int SHOOT_BUTTON = 1;
        public static final int DROPP_GEAR_BUTTON = 3;
        public static final int FEED_BUTTON = 2;

    }
}
