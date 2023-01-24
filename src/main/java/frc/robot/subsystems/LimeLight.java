package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LimeLight {
    private static NetworkTable limeLight = NetworkTableInstance.getDefault().getTable("limelight");

    public static double getX() {
        return limeLight.getEntry("tx").getDouble(0);
    }

    public static double getY() {
        return limeLight.getEntry("ty").getDouble(0);
    }
    public static boolean isThere() {
        if(limeLight.getEntry("tv").getDouble(0) == 1)
        {
            return true;
        }
        return false;
    }
    public static String getBoth() {
        return "THE X IS: "+ getX() + " AND THE Y IS: " + getY();
    }
}
