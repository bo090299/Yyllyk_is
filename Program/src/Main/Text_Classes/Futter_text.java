package Main.Text_Classes;

import Main.Util.CssConfig;
import Main.Util.Global;
import Main.Util.SizeConfig;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Futter_text extends VBox {
    public Futter_text() {
        Global.futterbox = this;

        Image image = new Image("/Resource/Assets/logotip.png");
        ImageView logo = new ImageView(image);
        logo.setFitWidth(0.06);
        logo.setFitHeight(0.06);

        Label futtortext = new Label("Hasapçy");
        futtortext.getStylesheets().add(CssConfig.Css());
        futtortext.getStyleClass().addAll("Futtortext");
        HBox futtor = new HBox();
        futtor.getChildren().addAll(logo,futtortext);
        futtor.setPrefSize(SizeConfig.Width(1),SizeConfig.Height(0.06));
        futtor.getStylesheets().add(CssConfig.Css());
        futtor.getStyleClass().addAll("Futtorback");
        futtor.setAlignment(Pos.CENTER);

        this.getChildren().addAll(futtor);
        this.setPrefSize(SizeConfig.Width(1),SizeConfig.Height(0.06));






    }
}
