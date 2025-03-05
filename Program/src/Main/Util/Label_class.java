package Main.Util;

import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class Label_class {
    public Label label(String name,double width , double height){

        Label label = new Label(name);
        label.setMaxSize(SizeConfig.Width(width),SizeConfig.Height(height));
        label.setMinSize(SizeConfig.Width(width),SizeConfig.Height(height));
        label.setAlignment(Pos.CENTER);
        label.getStyleClass().add("label_for_list");
        return  label;
    }
}
