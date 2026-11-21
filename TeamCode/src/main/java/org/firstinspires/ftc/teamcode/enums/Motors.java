// File for creating a motor enum

// Imports
package org.firstinspires.ftc.teamcode.enums;

import com.seattlesolvers.solverslib.hardware.motors.Motor;

// Enum class for creating a motor enum
public enum Motors {
  // Motor Enums
  FRONT_LEFT(
      "front_left",
      Motor.GoBILDA.BARE,
      Motor.RunMode.RawPower,
      Motor.ZeroPowerBehavior.BRAKE,
      true,
      0.01),
  FRONT_RIGHT(
      "front_right",
      Motor.GoBILDA.BARE,
      Motor.RunMode.RawPower,
      Motor.ZeroPowerBehavior.BRAKE,
      false,
      0.01),
  BACK_LEFT(
      "back_left",
      Motor.GoBILDA.BARE,
      Motor.RunMode.RawPower,
      Motor.ZeroPowerBehavior.BRAKE,
      true,
      0.01),
  BACK_RIGHT(
      "back_right",
      Motor.GoBILDA.BARE,
      Motor.RunMode.RawPower,
      Motor.ZeroPowerBehavior.BRAKE,
      false,
      0.01),
  INTAKE(
      "intake",
      Motor.GoBILDA.BARE,
      Motor.RunMode.RawPower,
      Motor.ZeroPowerBehavior.BRAKE,
      false,
      0.01),
  TRANSFER(
      "transfer",
      Motor.GoBILDA.BARE,
      Motor.RunMode.RawPower,
      Motor.ZeroPowerBehavior.BRAKE,
      false,
      0.01),
  FLYWHEEL_1(
      "flywheel_1",
      Motor.GoBILDA.BARE,
      Motor.RunMode.RawPower,
      Motor.ZeroPowerBehavior.BRAKE,
      false,
      0.001),
  FLYWHEEL_2(
      "flywheel_2",
      Motor.GoBILDA.BARE,
      Motor.RunMode.RawPower,
      Motor.ZeroPowerBehavior.BRAKE,
      false,
      0.001);

  // Variables for motor data
  private final String MotorName;
  private final Motor.GoBILDA motorType;
  private final Motor.RunMode runMode;
  private final Motor.ZeroPowerBehavior zeroPowerBehavior;
  private final boolean invert;
  private final double cachingTolerance;

  // Constructor method for setting motor data
  Motors(
      String motorName,
      Motor.GoBILDA motorType,
      Motor.RunMode runMode,
      Motor.ZeroPowerBehavior zeroPowerBehavior,
      boolean invert,
      double cachingTolerance) {
    this.MotorName = motorName;
    this.motorType = motorType;
    this.runMode = runMode;
    this.zeroPowerBehavior = zeroPowerBehavior;
    this.invert = invert;
    this.cachingTolerance = cachingTolerance;
  }

  // Getter methods for returning motor data
  public String getMotorName() {
    return this.MotorName;
  }

  public Motor.GoBILDA getMotorType() {
    return this.motorType;
  }

  public Motor.RunMode getRunMode() {
    return this.runMode;
  }

  public Motor.ZeroPowerBehavior getZeroPowerBehavior() {
    return this.zeroPowerBehavior;
  }

  public boolean getInverted() {
    return this.invert;
  }

  public double getCachingTolerance() {
    return this.cachingTolerance;
  }
}
