// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {

  //make your motor variables here
  private TalonSRX rMain;
  private TalonSRX rOne;
  private TalonSRX rTwo;
  private TalonSRX lMain;
  private TalonSRX lOne;
  private TalonSRX lTwo;

  public Drivetrain() {

    //assign motor values here
    rMain = new TalonSRX(1);
    rOne = new TalonSRX(2);
    rTwo = new TalonSRX(3);
    lMain = new TalonSRX(4);
    lOne = new TalonSRX(5);
    lTwo = new TalonSRX(6);

  }

  public void rDrive(double power) {
    rMain.set(ControlMode.PercentOutput, -power);
    rOne.set(ControlMode.PercentOutput, power);
    rTwo.set(ControlMode.PercentOutput, power);
  }

  public void lDrive(double power) {
    lMain.set(ControlMode.PercentOutput, power);
    lOne.set(ControlMode.PercentOutput, -power);
    lTwo.set(ControlMode.PercentOutput, -power);
  }

  public void stop(){
    lMain.set(ControlMode.PercentOutput, 0);
    lOne.set(ControlMode.PercentOutput, 0);
    lTwo.set(ControlMode.PercentOutput, 0);
    rMain.set(ControlMode.PercentOutput, 0);
    rOne.set(ControlMode.PercentOutput, 0);
    rTwo.set(ControlMode.PercentOutput, 0);
  }

  public void stopLeft(){
    lMain.set(ControlMode.PercentOutput, 0);
    lOne.set(ControlMode.PercentOutput, 0);
    lTwo.set(ControlMode.PercentOutput, 0);
  }

  public void stopRight(){
    rMain.set(ControlMode.PercentOutput, 0);
    rOne.set(ControlMode.PercentOutput, 0);
    rTwo.set(ControlMode.PercentOutput, 0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
