package Main.Text_Classes;

import Main.Util.CssConfig;
import Main.Util.SizeConfig;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Bottom_text extends VBox {
    public Bottom_text() {

        Label futtortext = new Label("Developed by Batyr Omurkulow in TMHI");
        futtortext.getStylesheets().add(CssConfig.Css());
        futtortext.getStyleClass().addAll("Futtortext");
        HBox futtor = new HBox();
        futtor.getChildren().addAll(futtortext);
        futtor.setPrefSize(SizeConfig.Width(1),SizeConfig.Height(0.06));
        futtor.getStylesheets().add(CssConfig.Css());
        futtor.getStyleClass().addAll("Bottom_back");
        futtor.setAlignment(Pos.CENTER);

        this.getChildren().addAll(futtor);
        this.setPrefSize(SizeConfig.Width(1),SizeConfig.Height(0.06));
    }
}
