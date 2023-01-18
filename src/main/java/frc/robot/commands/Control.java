package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;

public class Control 
{
    private static final XboxController controller = new XboxController(0);
    public boolean aButtonPressed()
    {
        return controller.getAButtonPressed();
    }

    public boolean aButtonReleased()
    {
        return controller.getAButtonReleased();
    }
}
