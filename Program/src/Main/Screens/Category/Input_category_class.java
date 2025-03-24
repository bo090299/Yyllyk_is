package Main.Screens.Category;

import Main.Util.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Input_category_class extends VBox {
    public Input_category_class() {
        Box_class box_class = new Box_class();
        Button_class btn = new Button_class();
        Connector connector = new Connector();

        TextField name = new TextField();
        VBox name_box = box_class.Vbox_method("Ady",name, "Ady");


        Button girizmek = btn.Sized_btns("girizmek",0.2,0.03);
        girizmek.setOnAction((e->{
            if (name.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Ýalňyşlyk");
                alert.setContentText("Boş öýjügi dolduryň");
                alert.show();
            }else {
                String input = "INSERT INTO `kategoriya`(`name`)VALUES (?)";
                System.out.println("maglumat girdi");
                try {
                    PreparedStatement ps = connector.getConnection().prepareStatement(input);
                    ps.setString(1,name.getText());
                    ps.executeUpdate();
                    name.clear();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        }));

        Button yza = btn.Sized_btns("Çykmak",0.2,0.03);
        yza.setOnAction((e->{
            Global.main_hbox.getChildren().clear();
            Global.main_hbox.getChildren().addAll(new Category_main());
        }));

        VBox kat_box = new VBox(15);
        kat_box.getChildren().addAll(name_box,girizmek,yza);
        kat_box.setAlignment(Pos.CENTER);


        this.getChildren().addAll(kat_box);
        this.setMargin(kat_box,new Insets(0,0,0,750));
        this.setAlignment(Pos.CENTER);
        this.setVgrow(name_box, Priority.ALWAYS);
        this.getStylesheets().addAll("/Resource/Style/Style.css");
        this.getStyleClass().add("product");













    }
}
