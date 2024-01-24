// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class DriveCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Drivetrain m_drivetrain;
  
  private Supplier<Double> leftPow, rightPow; 

  /**
   * Creates a new ExampleCommand.
   *
   * @param drivetrain The subsystem used by this command.
   */
  public DriveCommand(Drivetrain drivetrain, Supplier<Double> leftPow, Supplier<Double> rightPow){
    m_drivetrain = drivetrain;
    this.leftPow = leftPow;
    this.rightPow = rightPow;

    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    double leftSpeed = leftPow.get();
    double rightSpeed = rightPow.get();

    if (Math.abs(leftSpeed) > 0.07){
      m_drivetrain.lDrive(leftSpeed);
    }
    else{
      m_drivetrain.stopLeft();
    }
    if (Math.abs(rightSpeed) > 0.07){
      m_drivetrain.rDrive(rightSpeed);
    }
    else{
      m_drivetrain.stopRight();
    }
    System.out.println(leftSpeed + "\t" + rightSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivetrain.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
