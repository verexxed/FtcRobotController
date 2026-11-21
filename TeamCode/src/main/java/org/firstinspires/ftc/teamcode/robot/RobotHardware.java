package org.firstinspires.ftc.teamcode.robot;

import com.seattlesolvers.solverslib.hardware.motors.Motor;
import com.seattlesolvers.solverslib.hardware.motors.MotorGroup;
import java.util.Map;
import org.firstinspires.ftc.teamcode.enums.Motors;

public class RobotHardware {
  private final Map<Motors, Motor> motors;
  private final MotorGroup flywheel;

  public RobotHardware(Map<Motors, Motor> motors, MotorGroup flywheel) {
    this.motors = motors;
    this.flywheel = flywheel;
  }
}
