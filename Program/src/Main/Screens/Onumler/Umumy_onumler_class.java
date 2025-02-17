package Main.Screens.Onumler;

import Main.Component.MainScreen.Main_Screen;
import Main.Util.Global;
import Main.Util.SizeConfig;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.sql.SQLException;

public class Umumy_onumler_class extends VBox {
    public Umumy_onumler_class() {
        HBox birinji = new HBox(200);
        HBox ikinji = new HBox(200);

        Button onumler = new Button("Önümler");
        onumler.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.3));
        onumler.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.3));
        onumler.setOnAction((e->{
            Global.main_hbox.getChildren().clear();
            try {
                Global.main_hbox.getChildren().addAll(new Onum_List());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }));

        Button onumcilik = new Button("Öndüriliş");
        onumcilik.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.3));
        onumcilik.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.3));

        birinji.getChildren().addAll(onumler,onumcilik);
        birinji.setAlignment(Pos.CENTER);



        Button ammar = new Button("Ammar");
        ammar.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.3));
        ammar.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.3));

        Button category = new Button("Kategoriýalar");
        category.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.3));
        category.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.3));

        ikinji.getChildren().addAll(ammar,category);
        ikinji.setAlignment(Pos.CENTER);

        Button yza = new Button("<- Yza çykmak");
        yza.setMaxSize(SizeConfig.Width(0.1),SizeConfig.Height(0.03));
        yza.setMinSize(SizeConfig.Width(0.1),SizeConfig.Height(0.03));
        yza.setOnAction((e->{
            Global.pane.getChildren().clear();
            Global.pane.getChildren().addAll(new Main_Screen());
        }));

        VBox buttuns = new VBox(100);
        buttuns.getChildren().addAll(birinji,ikinji);
        this.setSpacing(50);
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(buttuns,yza);
        this.setMargin(birinji,new Insets(0,0,0,500));
        this.setMargin(ikinji,new Insets(0,0,0,500));
        this.setMargin(yza,new Insets(0,0,0,500));
    }
}
