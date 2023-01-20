// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;

import java.util.function.Supplier;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.CommandBase;

import java.lang.ModuleLayer.Controller;
import java.math.*;


/** An example command that uses an example subsystem. */
public class DriveCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Drivetrain m_drivetrain;

  private TalonSRX rMain = new TalonSRX(1);
  private TalonSRX rOne = new TalonSRX(2);
  private TalonSRX rTwo = new TalonSRX(3);
  private TalonSRX lMain = new TalonSRX(4);
  private TalonSRX lOne = new TalonSRX(5);
  private TalonSRX lTwo = new TalonSRX(6);
  private Control control = new Control();

  
  private Supplier<Double> leftY, rightZ;
  /**
   * Creates a new ExampleCommand.
   *
   * @param drivetrain The subsystem used by this command.
   */
  public DriveCommand(Drivetrain drivetrain){
    m_drivetrain = drivetrain;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivetrain);
    //this.leftY = 0; // we can change these later
    //this.rightZ = 0;
    rMain.set(ControlMode.PercentOutput,0); // the % output of the motor, between -1 and 1
    rOne.set(ControlMode.PercentOutput,0);
    rTwo.set(ControlMode.PercentOutput,0);
    lMain.set(ControlMode.PercentOutput,0);
    lOne.set(ControlMode.PercentOutput,0);
    lTwo.set(ControlMode.PercentOutput,0);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  public void rDrive(double power) {
    rMain.set(ControlMode.PercentOutput, power);
    rOne.set(ControlMode.PercentOutput, power);
    rTwo.set(ControlMode.PercentOutput, power);
  }

  public void lDrive(double power) {
    lMain.set(ControlMode.PercentOutput, -power);
    lOne.set(ControlMode.PercentOutput, -power);
    lTwo.set(ControlMode.PercentOutput, -power);
  }
  // Called every time the scheduler runs while the command is scheduled.
  private double leftPow = 0;
  private double rightPow = 0;
  @Override
  public void execute() {
    
    
    leftPow = -Control.getLeftStickY(); //One Joystick moves forward and backward
    rightPow = -Control.getLeftStickY();

    if(Control.getRightStickX() > 0){ //Turns Right
      leftPow *= 1-Control.getRightStickX();
    }
    else if(Control.getRightStickX() < 0){ //Turns Left
      rightPow *= 1+Control.getRightStickX();
    }
    else if(Control.getRightStickTwist() < 0 && Control.getLeftStickY() == 0){
      leftPow = Control.getRightStickTwist();
      rightPow = -Control.getRightStickTwist();
    }
    else if(Control.getRightStickTwist() > 0 && Control.getLeftStickY() == 0){
      leftPow = -Control.getRightStickTwist();
      rightPow = Control.getRightStickTwist();
    }
    lDrive(leftPow);
    rDrive(rightPow);
    

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
