package Main.Util;

import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;

public class SizeConfig {
    public static double Width(double width){
        Rectangle2D rectangle2D = Screen.getPrimary().getBounds();
        return width*rectangle2D.getWidth();
    }
    public static double Height(double height){
        Rectangle2D rectangle2D = Screen.getPrimary().getBounds();
        return height*rectangle2D.getHeight();
    }
}
