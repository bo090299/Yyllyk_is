package Main.Screens.Onumler;

import Main.Util.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.sql.*;

public class Onumleri_girizmek extends VBox {
    public Onumleri_girizmek() throws SQLException {
        Box_class box_class = new Box_class();
        Connector conn = new Connector();

        TextField cat_id = new TextField();
        VBox cat_id_box = box_class.Vbox_method("Kategoriýa id",cat_id,"Kategoriýa id");

        TextField name_text = new TextField();
        VBox name_box = box_class.Vbox_method("Ady",name_text,"Ady");

        TextField bahasy_text = new TextField();
        VBox baha_box = box_class.Vbox_method("Bahasy",bahasy_text,"Bahasy");

        TextField info_text = new TextField();
        VBox info_box = box_class.Vbox_method("Umumy maglumat",info_text,"Umumy maglumat");

        Button girizmek = new Button("Girizmek");
        girizmek.setPrefSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        girizmek.getStyleClass().addAll("Regbtn");

        girizmek.setOnAction((e)->{


            if (name_text.getText().isEmpty()||bahasy_text.getText().isEmpty()||info_text.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Ýalňyşlyk");
                alert.setContentText("Boş öýjükleri dolduryň!");
                alert.show();
            }
            else if (Number_Allert.DoubleAllert(bahasy_text.getText())== false){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Ýalňyşlyk");
                alert.setContentText("Siziň bahasy ýa - da idisi maglumatlaryňyz san bolmaly!");
                alert.show();
            }else {
                String chek_cat_id = "SELECT id FROM kategoriya WHERE id = ?";
                try (PreparedStatement prs = conn.getConnection().prepareStatement(chek_cat_id)){
                    prs.setInt(1,Integer.parseInt(cat_id.getText()));
                    try (ResultSet res = prs.executeQuery()){
                        if (!res.next()){
                            throw new SQLException("Bu kategoriyaly"+cat_id.getText()+"onum yok");
                        }

                    }

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                String quary = "INSERT INTO `onumler`(`category_id`, `name`, `bahasy`, `info`) VALUES (?,?,?,?)";
                try {
                    System.out.println("girdi");
                    PreparedStatement ps = conn.getConnection().prepareStatement(quary);
                    ps.setInt(1,Integer.parseInt(cat_id.getText()));
                    ps.setString(2,name_text.getText());
                    ps.setDouble(3,Double.parseDouble(bahasy_text.getText()));
                    ps.setString(4,info_text.getText());

                    int rowsAffectec = ps.executeUpdate();
                    if (rowsAffectec > 0){
                        System.out.println("Maglumat girizildi");
                    }else {
                        System.out.println("Maglumaty grizilmedi");
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }


            }
        });

        Button yza = new Button("çykmak");
        yza.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        yza.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        yza.getStyleClass().addAll("Regbtn");
        yza.setOnAction((e->{
            Global.main_hbox.getChildren().clear();
            try {
                Global.main_hbox.getChildren().addAll(new Onum_List());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }));



        VBox productbox = new VBox();
        productbox.setSpacing(10);
        productbox.getChildren().addAll(cat_id_box,name_box,baha_box,info_box,girizmek,yza);
        productbox.setAlignment(Pos.CENTER);



        this.getChildren().addAll(productbox);
        this.setMargin(productbox, new Insets(0,0,0,350));
        this.setPrefSize(SizeConfig.Width(0.8),SizeConfig.Height(0.76));
        this.setAlignment(Pos.CENTER);
        this.setVgrow(productbox,Priority.ALWAYS);
        this.getStylesheets().addAll("/Resource/Style/Style.css");
        this.getStyleClass().addAll("product");
    }
}
