package Main.Component.MainScreen;

import Main.Text_Classes.Bottom_text;
import Main.Text_Classes.Center_class;
import Main.Text_Classes.Futter_text;
import Main.Screens.Admin_Screen.Left_list;
import Main.Util.CssConfig;
import Main.Util.Global;
import Main.Util.SizeConfig;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

public class Main_Screen extends StackPane {
    public Main_Screen() {

        HBox hBox = new HBox();
        Global.main_hbox = hBox;
        VBox vBox = new VBox();
        Line line = new Line();
        line.setEndY(870);
        hBox.getChildren().addAll(new Left_list(),line,new Center_class());
        hBox.setPrefSize(SizeConfig.Width(1),SizeConfig.Height(0.8));
        hBox.setStyle("-fx-background-color:white;");


        vBox.getChildren().addAll(new Futter_text(),hBox,new Bottom_text());


        this.getChildren().add(vBox);
        this.getStylesheets().add(CssConfig.Css());



    }
}
