// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {

  //make your motor variables here
  //There should be 6, 3 for each side.

  public Drivetrain() {
    //assign motor values here

  }

  //This class should set the power level of the right side motors to the power instance variable
  public void rDrive(double power) {}

  //This class should set the power level of the left side motors to the power instance variable
  public void lDrive(double power) {}

  //This class should set the power of all the motors to 0
  public void stop(){}

  //This class should set all the left side motors to 0
  public void stopLeft(){}

  //This class should set all the right side motors to 0
  public void stopRight(){}
}
