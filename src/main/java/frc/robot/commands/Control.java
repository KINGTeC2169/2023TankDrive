package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class Control {
    private static XboxController controller = new XboxController(ActuatorMap.controller);
    private static Joystick leftJoy = new Joystick(ActuatorMap.lJoyStick);
    private static Joystick rightJoy = new Joystick(ActuatorMap.rJoyStick);

    //Controller inputs
    public static double getLeftControllerX() {
        return controller.getLeftX();
    }

    public static double getLeftControllerY() {
        return controller.getLeftY();
    }

    public static double getRightControllerX() {
        return controller.getRightX();
    }

    public static double getRightControllerY() {
        return controller.getRightY();
    }

    public static boolean getControllerA() {
        return controller.getAButton();
    }
    public static boolean getControllerAPressed() {
        return controller.getAButtonPressed();
    }

    public static boolean getControllerB() {
        return controller.getBButton();
    }
    public static boolean getControllerBPressed() {
        return controller.getBButtonPressed();
    }

    public static boolean getControllerX() {
        return controller.getXButton();
    }
    public static boolean getControllerXPressed() {
        return controller.getXButtonPressed();
    }

    public static boolean getControllerY() {
        return controller.getYButton();
    }
    public static boolean getControllerYPressed() {
        return controller.getYButtonPressed();
    }

    public static double getRightControllerTrigger() {
        return controller.getRightTriggerAxis();
    }

    public static double getLeftControllerTrigger() {
        return controller.getLeftTriggerAxis();
    }

    public static boolean getLeftControllerBumper() {
        return controller.getLeftBumper();
    }
    public static boolean getLeftControllerBumperPressed() {
        return controller.getLeftBumperPressed();
    }

    public static boolean getRightControllerBumper() {
        return controller.getRightBumper();
    }
    public static boolean getRightControllerBumperPressed() {
        return controller.getRightBumperPressed();
    }

    public static boolean getLeftControllerStick() {
        return controller.getLeftStickButtonPressed();
    }

    public static boolean getRightControllerStick() {
        return controller.getRightStickButtonPressed();
    }

    public static int getDPad() {
        return controller.getPOV();
    }

    public static boolean babyBackRibs() {
        return controller.getBackButton();
    }

    public static boolean startYourEngines() {
        return controller.getStartButtonPressed();
    }

    //Joystick inputs
    public static double getLeftStickY() {
        return -leftJoy.getY();
    }

    public static double getLeftStickX() {
        return leftJoy.getX();
    }

    public static double getRightStickY() {
        return rightJoy.getY();
    }

    public static double getRightStickX() {
        return rightJoy.getX();
    }

    public static double getLeftStickTwist() {
        return leftJoy.getTwist();
    }

    public static double getRightStickTwist() {
        return rightJoy.getTwist();
    }

    public static boolean getLeftStickTop() {
        return leftJoy.getRawButton(1);
    }

    public static boolean getLeftStickTopPressed() {
        return leftJoy.getRawButtonPressed(1);
    }

    public static boolean getLeftStickBottom() {
        return leftJoy.getRawButton(2);
    }

    public static boolean getLeftStickBottomPressed() {
        return leftJoy.getRawButtonPressed(2);
    }

    public static boolean getRightStickTop() {
        return rightJoy.getRawButton(1);
    }

    public static boolean getRightStickBottom() {
        return rightJoy.getRawButton(2);
    }

    public static boolean getRightStickBottomPressed() {
        return rightJoy.getRawButtonPressed(2);
    }

}