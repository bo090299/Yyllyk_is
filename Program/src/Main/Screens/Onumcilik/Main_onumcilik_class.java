package Main.Screens.Onumcilik;

import Main.Text_Classes.Bottom_text;
import Main.Util.Box_class;
import Main.Util.Button_class;
import Main.Util.Connector;
import Main.Util.SizeConfig;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class Main_onumcilik_class extends VBox {
    public Main_onumcilik_class() {
        Connector conn = new Connector();
        Box_class box_class = new Box_class();
        Button_class button_class = new Button_class();

        TextField onum_id = new TextField();
        VBox onum_box = box_class.Vbox_method("Onum id", onum_id,"Onum id");

        TextField ady = new TextField();
        VBox ady_box = box_class.Vbox_method("Ady",ady,"Ady");

        TextField kat_id = new TextField();
        VBox kat_box = box_class.Vbox_method("Kategoriya id",kat_id,"Kategoriya id");

        TextField bahasy = new TextField();
        VBox bahasy_box = box_class.Vbox_method("Bahasy", bahasy, "Bahasy");

        DatePicker ondurilen_sene = new DatePicker();
        ondurilen_sene.setPromptText("Ondurilen senesi");
        ondurilen_sene.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));

        DatePicker mohleti = new DatePicker();
        mohleti.setPromptText("Mohleti");
        mohleti.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        mohleti.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));

        TextField umumymu = new TextField();
        VBox umumy_box = box_class.Vbox_method("Umumy mukdary",umumymu,"Umumy mukdary");

        TextField nace_girdeji = new TextField();
        VBox nace_box = box_class.Vbox_method("Nace girdejilik onum",nace_girdeji,"Nace girdejilik onum");

        Button update = button_class.Sized_btns("üýtgetmek", 0.06,0.04);
        Button delete = button_class.Sized_btns("öçürmek",0.06,0.04);
        Button input = button_class.Sized_btns("girizmek", 0.06,0.04);
        Button yza = button_class.Sized_btns("çykmak", 0.06,0.04);

        VBox birinji_btns = new VBox(15);
        birinji_btns.getChildren().addAll(update,delete);
        birinji_btns.setAlignment(Pos.CENTER);

        VBox ikinji_btns = new VBox(15);
        ikinji_btns.getChildren().addAll(input,yza);
        ikinji_btns.setAlignment(Pos.CENTER);

        HBox main_btns = new HBox(15);
        main_btns.getChildren().addAll(birinji_btns,ikinji_btns);
        main_btns.setAlignment(Pos.CENTER);

        VBox esasy_box = new VBox(15);
        esasy_box.getChildren().addAll(onum_box,kat_box,ady_box,bahasy_box,ondurilen_sene,mohleti,umumy_box,nace_box);
        esasy_box.setAlignment(Pos.CENTER);

        ScrollPane scroll = new ScrollPane();
        scroll.setContent(new Onumcilik_list_class());

        HBox main_box = new HBox(15);
        main_box.getChildren().addAll(esasy_box,scroll);
        main_box.setAlignment(Pos.CENTER);
        scroll.setFitToWidth(true);
        scroll.setFitToHeight(true);
        main_box.setHgrow(esasy_box, Priority.ALWAYS);
        main_box.setHgrow(scroll, Priority.ALWAYS);
        this.getChildren().addAll(main_box);
        esasy_box.setMaxSize(SizeConfig.Width(0.3),SizeConfig.Height(0.8));
        esasy_box.setMinSize(SizeConfig.Width(0.3),SizeConfig.Height(0.8));




    }
}
