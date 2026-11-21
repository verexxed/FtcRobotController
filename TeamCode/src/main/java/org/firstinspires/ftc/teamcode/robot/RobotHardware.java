package org.firstinspires.ftc.teamcode.robot;

import com.seattlesolvers.solverslib.hardware.motors.Motor;
import com.seattlesolvers.solverslib.hardware.motors.MotorGroup;

import org.firstinspires.ftc.teamcode.enums.Motors;

import java.util.Map;

public class RobotHardware {
    private final Map<Motors, Motor> motors;
    private final MotorGroup flywheel;


    public RobotHardware(Map<Motors, Motor> motors, MotorGroup flywheel) {
        this.motors = Map.copyOf(motors);
        this.flywheel = flywheel;
    }


}
