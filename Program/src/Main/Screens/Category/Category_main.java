package Main.Screens.Category;

import Main.Screens.Onumler.Umumy_onumler_class;
import Main.Util.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Category_main extends VBox {
    public Category_main() {
        Connector conn = new Connector();
        Box_class box_class = new Box_class();
        Button_class button_class = new Button_class();

        TextField id = new TextField();
        VBox idbox = box_class.Vbox_method("Id",id,"Id");

        TextField name = new TextField();
        VBox name_box = box_class.Vbox_method("Ady",name,"Ady");

        Button update = button_class.Sized_btns("üýtgetmek", 0.06,0.04);
        update.setOnAction((e->{
            if (id.getText().isEmpty()|| name.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Ýalňyşlyk");
                alert.setContentText("Boş öýjükleri dolduryň");
                alert.show();
            }else if (Number_Allert.IntegerAllert(id.getText()) == false){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Ýalňyşlyk");
                alert.setContentText("Id öýjügine san girizmeli");
                alert.show();
            }else{
                String upquery = "UPDATE `kategoriya` SET `id` = ?, `name` = ? WHERE id = "+id.getText()+"";
                try {
                    PreparedStatement ps = conn.getConnection().prepareStatement(upquery);
                    ps.setInt(1,Integer.valueOf(id.getText()));
                    ps.setString(2, name.getText());
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                id.clear();
                name.clear();
                Global.main_hbox.getChildren().clear();
                Global.main_hbox.getChildren().addAll(new Category_main());
            }
        }));
        Button delete = button_class.Sized_btns("öçürmek",0.06,0.04);
        delete.setOnAction((e->{
            String delquery = "DELETE FROM `kategoriya` WHERE id ="+id.getText()+";";
            if(id.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Ýalňyşlyk");
                alert.setContentText("Öçürmeli önümiňiziň idisini giriziň");
                alert.show();
            }else {
                try {
                    Statement st = conn.getConnection().createStatement();
                    st.executeUpdate(delquery);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                Global.main_hbox.getChildren().clear();
                Global.main_hbox.getChildren().addAll(new Category_main());
            }
        }));
        Button girizmek = button_class.Sized_btns("girizmek",0.06,0.04);
        girizmek.setOnAction((e->{
            Global.main_hbox.getChildren().clear();
            Global.main_hbox.getChildren().addAll(new Input_category_class());
        }));
        Button yza = button_class.Sized_btns("çykmak",0.06,0.04);
        yza.setOnAction((e ->{
            Global.main_hbox.getChildren().clear();
            Global.main_hbox.getChildren().addAll(new Umumy_onumler_class());
        }));

        VBox bir_btns = new VBox(15);
        bir_btns.getChildren().addAll(update, delete);
        bir_btns.setAlignment(Pos.CENTER);

        VBox iki_btns = new VBox(15);
        iki_btns.getChildren().addAll(girizmek,yza);
        iki_btns.setAlignment(Pos.CENTER);

        HBox btns = new HBox(15);
        btns.getChildren().addAll(bir_btns,iki_btns);
        btns.setAlignment(Pos.CENTER);
        btns.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.08));
        btns.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.08));

        VBox umumy = new VBox(20);
        umumy.getChildren().addAll(idbox,name_box,btns);
        umumy.setAlignment(Pos.CENTER);
//        umumy.setMargin(btns, new Insets(50,0,0,200));
        ScrollPane scroll = new ScrollPane();
        try {
            scroll.setContent(new Category_list());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        HBox main_box = new HBox(20);
        main_box.getChildren().addAll(umumy,scroll);
        scroll.setFitToWidth(true);
        scroll.setFitToHeight(true);
        main_box.setHgrow(umumy, Priority.ALWAYS);
        main_box.setHgrow(scroll, Priority.ALWAYS);
        this.getChildren().addAll(main_box);
        umumy.setMaxSize(SizeConfig.Width(0.3),SizeConfig.Height(0.8));
        umumy.setMinSize(SizeConfig.Width(0.3),SizeConfig.Height(0.8));

    }
}
