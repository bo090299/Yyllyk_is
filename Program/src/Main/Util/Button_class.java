package Main.Util;

import javafx.scene.control.Button;

public class Button_class {
    public Button Btn_class(String text_to_btn){
        Button button = new Button(text_to_btn);
        button.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.3));
        button.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.3));
        button.getStyleClass().add("uly_button");
        return button;
    }
}
