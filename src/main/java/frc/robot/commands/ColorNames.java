package frc.robot.commands;

public class ColorNames {


    private final static String hex = "0123456789abcdef";
    private static int[] numbers = new int[3];
    public static String hexToName(String hexVal){
        numbers[0] = hex.indexOf(hexVal.substring(1,2))*16 + hex.indexOf(hexVal.substring(2,3));
        numbers[1] = hex.indexOf(hexVal.substring(3,4))*16 + hex.indexOf(hexVal.substring(4,5));
        numbers[2] = hex.indexOf(hexVal.substring(5,6))*16 + hex.indexOf(hexVal.substring(6,7));
        
        if(numbers[0] > numbers[1] && numbers[0] > numbers[2]){
            return "red";
        }
        else if(numbers[1] > numbers[0] && numbers[1] > numbers[2]){
            return "green";
        }
        else {
            return "blue";
        }
    
    }
}
