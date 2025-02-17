package Main.Util;

import java.awt.*;

public class Number_Allert {
    public static boolean DoubleAllert(String string){
        try{
            Double.parseDouble(string);
            return true;
        }catch (NumberFormatException e1){
            return false;
        }
    }
    public static boolean IntegerAllert(String string){
        try {
            Integer.parseInt(string);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
