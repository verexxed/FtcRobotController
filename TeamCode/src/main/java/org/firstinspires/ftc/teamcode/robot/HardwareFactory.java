// File for creating a hardware factory

// Imports
package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.hardware.motors.Motor;
import com.seattlesolvers.solverslib.hardware.motors.MotorEx;
import com.seattlesolvers.solverslib.hardware.motors.MotorGroup;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import org.firstinspires.ftc.teamcode.enums.Motors;

// Class for creating a HardwareFactory
public class HardwareFactory {
  public RobotHardware create(HardwareMap hardwareMap) {
    Map<Motors, Motor> motors = createMotors(hardwareMap);
    MotorGroup flywheel = createFlywheel(motors);

    return new RobotHardware(motors, flywheel);
  }

  private Map<Motors, Motor> createMotors(HardwareMap hardwareMap) {
    Map<Motors, Motor> motors = new EnumMap<>(Motors.class);

    motors.clear();

    for (Motors config : Motors.values()) {
      MotorEx motor = new MotorEx(hardwareMap, config.getMotorName(), config.getMotorType());

      motor.setRunMode(config.getRunMode());
      motor.setZeroPowerBehavior(config.getZeroPowerBehavior());
      motor.setInverted(config.getInverted());
      motor.setCachingTolerance(config.getCachingTolerance());

      motors.put(config, motor);
    }

    return motors;
  }

  private MotorGroup createFlywheel(Map<Motors, Motor> motors) {
    Motor flywheel1 =
        Objects.requireNonNull(motors.get(Motors.FLYWHEEL_1), "FLYWHEEL_1 was not initialized");
    Motor flywheel2 =
        Objects.requireNonNull(motors.get(Motors.FLYWHEEL_2), "FLYWHEEL_2 was not initialized");

    return new MotorGroup(flywheel1, flywheel2);
  }
}
