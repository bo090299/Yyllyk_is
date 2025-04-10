package Main.Screens.Onumcilik;

import Main.Util.Box_class;
import Main.Util.Button_class;
import Main.Util.Connector;
import Main.Util.SizeConfig;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
        ondurilen_sene.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));






    }
}
