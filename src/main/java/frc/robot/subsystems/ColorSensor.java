
package frc.robot.subsystems;
import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ColorSensor extends SubsystemBase {


    private final static I2C.Port i2cPort = I2C.Port.kOnboard;
    static ColorSensorV3 sensor = new ColorSensorV3(i2cPort);
    private static int[] color = new int[3];
    public static Color getColor() {
        color[0] = sensor.getRed();
        color[1] = sensor.getGreen();
        color[2] = sensor.getBlue();
        return sensor.getColor();
    }

}

