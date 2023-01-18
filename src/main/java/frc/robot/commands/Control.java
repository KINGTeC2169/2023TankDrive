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
    public boolean bButtonPressed()
    {
        return controller.getBButtonPressed();
    }
    public boolean bButtonReleased()
    {
        return controller.getBButtonReleased();
    }
    public boolean xButtonPressed()
    {
        return controller.getXButtonPressed();
    }
    public boolean xButtonReleased()
    {
        return controller.getXButtonReleased();
    }
    public boolean yButtonPressed()
    {
        return controller.getYButtonPressed();
    }
    public boolean yButtonReleased()
    {
        return controller.getYButtonReleased();
    }

}
