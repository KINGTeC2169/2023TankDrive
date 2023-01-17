// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class DriveCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Drivetrain m_drivetrain;

  private TalonSRX rMain = new TalonSRX(Ports.rMain);
  private TalonSRX rOne = new TalonSRX(Ports.rOne);
  private TalonSRX rTwo = new TalonSRX(Ports.rSTwo);
  private TalonSRX lMain = new TalonSRX(Ports.lMain);
  private TalonSRX lOne = new TalonSRX(Ports.lOne);
  private TalonSRX lTwo = new TalonSRX(Ports.lTwo);
  
  
  private Supplier<Double> leftX, leftY, rightX, rightY;
  /**
   * Creates a new ExampleCommand.
   *
   * @param drivetrain The subsystem used by this command.
   */
  public DriveCommand(Drivetrain drivetrain, Supplier<Double> leftX, Supplier<Double> leftY, Supplier<Double> rightX, Supplier<Double> rightY) {
    m_drivetrain = drivetrain;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivetrain);
    this.leftX = leftX;
    this.leftY = leftY;
    this.rightX = rightX;
    this.rightY = rightY;
    talon.set(0); // the % output of the motor, between -1 and 1
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  public void rDrive(double power) {
    rMain.set(ControlMod.PercentOutput, power);
  }

  public void lDrive(double power) {
    lMain.set(ControlMod.PercentOutput, power);
  }
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {


  



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
