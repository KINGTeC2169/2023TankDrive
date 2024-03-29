// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import java.util.function.Supplier;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class DriveCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Drivetrain m_drivetrain;
  
  private Supplier<Double> leftMove, rightMove; 
  private Supplier<Boolean> slowo, actualSlow;

  /**
   * Creates a new ExampleCommand.
   *
   * @param drivetrain The subsystem used by this command.
   */
  public DriveCommand(Drivetrain drivetrain, Supplier<Double> leftPow, Supplier<Double> rightPow, Supplier<Boolean> slowo, Supplier<Boolean> actualSlow){
    m_drivetrain = drivetrain;
    this.leftMove = leftPow;
    this.rightMove = rightPow;
    this.slowo = slowo;
    this.actualSlow = actualSlow;


    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  // Tell the robot what to do when it detects the left joystick or right joystick is moved
  // This is where you would call methods from your drivetrain subsystem
  @Override
  public void execute() {
    if(leftMove.get() != 0) {
      m_drivetrain.lDrive(leftMove.get());
    } else {
      m_drivetrain.stopLeft();
    }
    if(rightMove.get() != 0) {
      m_drivetrain.rDrive(rightMove.get());
    }else{
      m_drivetrain.stopRight();
    }
    if(actualSlow.get()) {
      m_drivetrain.setPowahh(-0.1);
      Timer.delay(0.2);
    }
    if(slowo.get()) {
      m_drivetrain.setPowahh(0.1);
      Timer.delay(0.2);
    }
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
