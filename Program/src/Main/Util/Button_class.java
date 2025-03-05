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
    public Button Sized_btns(String text_btn, double width, double height){
        Button button = new Button(text_btn);
        button.setMaxSize(SizeConfig.Width(width),SizeConfig.Height(height));
        button.setMinSize(SizeConfig.Width(width),SizeConfig.Height(height));
        button.getStyleClass().add("Regbtn");
        return button;

    }
}
