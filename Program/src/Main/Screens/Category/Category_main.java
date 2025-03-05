package Main.Screens.Category;

import Main.Util.Box_class;
import Main.Util.Button_class;
import Main.Util.Connector;
import Main.Util.SizeConfig;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.awt.*;

public class Category_main extends VBox {
    public Category_main() {
        Connector conn = new Connector();
        Box_class box_class = new Box_class();
        Button_class button_class = new Button_class();

        TextField id = new TextField();
        VBox idbox = box_class.Vbox_method("Id",id,"Id");

        TextField name = new TextField();
        VBox name_box = box_class.Vbox_method("Ady",name,"Ady");

        Button update = button_class.Sized_btns("üýtgetmek", SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        Button delete = button_class.Sized_btns("öçürmek",SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        Button girizmek = button_class.Sized_btns("girizmek",SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        Button yza = button_class.Sized_btns("çykmak",SizeConfig.Width(0.2),SizeConfig.Height(0.04));
    }
}
