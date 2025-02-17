package Main.Screens.Aylyklar;

import Main.Screens.Admin_Screen.Left_list;
import Main.Screens.Onumler.*;
import Main.Util.Global;
import Main.Util.SizeConfig;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

import java.sql.SQLException;

public class Umumy_kalas extends StackPane {
    public Umumy_kalas() {
        Button go = new Button("Aýlar");
        go.setPrefSize(SizeConfig.Width(0.075),SizeConfig.Height(0.04));
        go.getStyleClass().add("Hasaplasyklar");


        ComboBox ay = new ComboBox();
        ay.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
        ay.getStyleClass().add("Hasaplasyklar");
        ay.getItems().add("Ýanwar");
        ay.getItems().add("Fewral");
        ay.getItems().add("Mart");
        ay.getItems().add("Aprel");
        ay.getItems().add("Maý");
        ay.getItems().add("Iýun");
        ay.getItems().add("Iýul");
        ay.getItems().add("Awgust");
        ay.getItems().add("Sentiýabr");
        ay.getItems().add("Oktýabr");
        ay.getItems().add("Noýabr");
        ay.getItems().add("Dekabr");

        Line line = new Line();
        line.setEndY(870);
        go.setOnAction((e)->{
            VBox klas = new VBox();
            Global.main_hbox.getChildren().clear();
            try {
                klas.getChildren().addAll(new Umumy_kalas(),new Aylar_boyunca(ay.getSelectionModel().getSelectedItem()));
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            Global.main_hbox.getChildren().setAll(new Left_list(),line,klas);

        });
        HBox aybox = new HBox(2);
        aybox.getChildren().addAll(ay,go);
        aybox.setMaxSize(SizeConfig.Width(0.175),SizeConfig.Height(0.04));
        aybox.setMinSize(SizeConfig.Width(0.175),SizeConfig.Height(0.04));
        aybox.getStyleClass().add("Regbtn");



        Button onum = new Button("Aýlyklar");
        onum.setPrefSize(SizeConfig.Width(0.175),SizeConfig.Height(0.04));
        onum.getStyleClass().add("Regbtn");

        onum.setOnAction((e)->{
            VBox klas = new VBox();
            Global.main_hbox.getChildren().clear();
            try {
                klas.getChildren().addAll(new Umumy_kalas(),new Aylyklar());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            Global.main_hbox.getChildren().setAll(new Left_list(),line,klas);

        });

        Button giriz = new Button("Aýlardaky tölegi girizmek");
        giriz.setPrefSize(SizeConfig.Width(0.175),SizeConfig.Height(0.04));
        giriz.getStyleClass().add("Regbtn");

        giriz.setOnAction((e)->{
            VBox klas = new VBox();
            Global.main_hbox.getChildren().clear();
            try {
                klas.getChildren().addAll(new Umumy_kalas(),new Aydaky_toleg());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            Global.main_hbox.getChildren().setAll(new Left_list(),line,klas);
        });

        Button yyl = new Button("Ýyl boýunça Aýlyklar");

        yyl.setPrefSize(SizeConfig.Width(0.175),SizeConfig.Height(0.04));
        yyl.getStyleClass().add("Regbtn");

        yyl.setOnAction((e)->{
            VBox klas = new VBox();
            Global.main_hbox.getChildren().clear();
            try {
                klas.getChildren().addAll(new Umumy_kalas(),new Yyldaky_aylyk_haklar());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            Global.main_hbox.getChildren().setAll(new Left_list(),line,klas);
        });

        Button cykmak = new Button("Çykmak");
        cykmak.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
        cykmak.getStyleClass().add("Regbtn");

        cykmak.setOnAction((e)->{
            Global.main_hbox.getChildren().clear();
            Global.main_hbox.getChildren().setAll(new Left_list(),line);
        });




        HBox hbox = new HBox(aybox,onum,giriz,yyl,cykmak);
        VBox thisbox = new VBox();
        Global.opane = thisbox;
        thisbox.getChildren().addAll(hbox);
        Global.onumpane = this;
        this.getChildren().setAll(hbox);
        this.setPrefSize(SizeConfig.Width(0.8),SizeConfig.Height(0.04));
    }
}
