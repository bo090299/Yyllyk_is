package Main.Util;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class Box_class {
    public VBox Vbox_method(String labelText, TextField text, String promt_text){
        Label label = new Label(labelText);
        label.getStyleClass().add("Registration_labels");
        text.setPromptText(promt_text);
        text.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        text.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        text.getStyleClass().add("Registration_Texts");

        VBox vBox = new VBox(15);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(label,text);

        return vBox;
    }
}
