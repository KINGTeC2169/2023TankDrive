// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {

  //make your motor variables here
  //There should be 6 instances, 3 for each side.
  private TalonSRX LS6;
  private TalonSRX LS5;
  private TalonSRX LM4;
  private TalonSRX RS3;
  private TalonSRX RS2;
  private TalonSRX RM1;
  private double powahh;
  private ShuffleboardTab tab = Shuffleboard.getTab("idk");

  public Drivetrain() {
    //assign motor values here
    LS6 = new TalonSRX(6);
    LS5 = new TalonSRX(5);
    LM4 = new TalonSRX(4);
    RS3 = new TalonSRX(3);
    RS2 = new TalonSRX(2);
    RM1 = new TalonSRX(1);
    powahh = 1;
    tab.addDouble("ik",() -> powahh);
    
  }

  //This class should set the power level of the right side motors to the power instance variable
  public void rDrive(double power) {
    RS3.set(ControlMode.PercentOutput, power*0.6*powahh);
    RS2.set(ControlMode.PercentOutput, power*0.6*powahh);
    RM1.set(ControlMode.PercentOutput, -power*0.6*powahh);    

  }
  public void setPowahh(double powahh) {
    this.powahh += powahh;
  }
  //This class should set the power level of the left side motors to the power instance variable
  public void lDrive(double power) {
    LS6.set(ControlMode.PercentOutput, -power*0.8*powahh);
    LS5.set(ControlMode.PercentOutput, -power*0.8*powahh);
    LM4.set(ControlMode.PercentOutput, power*0.8*powahh);

  }
  //This class should set the power of all the motors to 0
  public void stop(){
    RS3.set(ControlMode.PercentOutput, 0);
    RS2.set(ControlMode.PercentOutput, 0);
    RM1.set(ControlMode.PercentOutput, 0);
    LS6.set(ControlMode.PercentOutput, 0);
    LS5.set(ControlMode.PercentOutput, 0);
    LM4.set(ControlMode.PercentOutput, 0);


  }
  
  //This class should set all the left side motors to 0
  public void stopLeft(){
    LS6.set(ControlMode.PercentOutput, 0);
    LS5.set(ControlMode.PercentOutput, 0);
    LM4.set(ControlMode.PercentOutput, 0);

  }

  //This class should set all the right side motors to 0
  public void stopRight(){
    RS3.set(ControlMode.PercentOutput, 0);
    RS2.set(ControlMode.PercentOutput, 0);
    RM1.set(ControlMode.PercentOutput, 0);


  }
}
