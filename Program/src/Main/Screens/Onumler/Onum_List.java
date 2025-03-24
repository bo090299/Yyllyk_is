package Main.Screens.Onumler;

import Main.Screens.Admin_Screen.Left_list;
import Main.Util.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.sql.*;


public class Onum_List extends StackPane{
    public Onum_List() throws SQLException {
        Connector conn = new Connector();
        Box_class box_class = new Box_class();
        Button_class button_class = new Button_class();


        TextField idtext = new TextField();
        VBox idbox = box_class.Vbox_method("Id",idtext,"Id");

        TextField cat_id = new TextField();
        VBox cat_id_box = box_class.Vbox_method("Ketegoriýa id",cat_id,"Ketegoriýa id");

        TextField nametext = new TextField();
        VBox namebox = box_class.Vbox_method("Ady",nametext,"Ady");


        TextField bahasytext = new TextField();
        VBox bahasybox = box_class.Vbox_method("Bahasy",bahasytext,"Bahasy");

       TextField info = new TextField();
        VBox senebox = box_class.Vbox_method("Umumy maglumat",info,"Umumy maglumat");


        Button update = button_class.Sized_btns("Üýtgetmek",0.06,0.04);
        update.setOnAction((e)->{
            if (idtext.getText().isEmpty()||cat_id.getText().isEmpty()||nametext.getText().isEmpty()||bahasytext.getText().isEmpty()||info.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Ýalňyşlyk");
                alert.setContentText("Boş öýjükleri dolduryň");
                alert.show();
            }else if (Number_Allert.DoubleAllert(bahasytext.getText())==false||Number_Allert.IntegerAllert(idtext.getText())==false ||
            Number_Allert.IntegerAllert(cat_id.getText())==false){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Ýalňyşlyk");
                alert.setContentText("Id , kategoriýa id we bahasy öýjükler san bolmaly");
                alert.show();
            }else {
                String upquery = "UPDATE `onumler` SET `id`=?,`category_id`=?,`name`=?,`bahasy`=?,`info`=? WHERE `id` = ?";
                try {
                    PreparedStatement ps = conn.getConnection().prepareStatement(upquery);
                    ps.setInt(1, Integer.valueOf(idtext.getText()));
                    ps.setInt(2, Integer.valueOf(cat_id.getText()));
                    ps.setString(3, nametext.getText());
                    ps.setDouble(4, Double.valueOf(bahasytext.getText()));
                    ps.setString(5, info.getText());
                    ps.setInt(6,Integer.valueOf(idtext.getText()));
                    ps.executeUpdate();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                idtext.clear();
                cat_id.clear();
                nametext.clear();
                bahasytext.clear();
                info.clear();
                Global.main_hbox.getChildren().clear();
                try {
                    Global.main_hbox.getChildren().addAll(new Onum_List());
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        Button delete = button_class.Sized_btns("Öçürmek",0.06,0.04);
        delete.setOnAction((e)->{
            String buyruk2 = "DELETE FROM `onumler` WHERE id = "+idtext.getText()+";";
            if (idtext.getText().isEmpty()) {
                Alert alert= new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ýalňyşlyk!");
                alert.setContentText("Öçürmeli önümiňiziň idisini giriziň!");
                alert.show();
                idtext.clear();
            }else {
                try {
                    Statement stat1 = conn.getConnection().createStatement();
                    stat1.executeUpdate(buyruk2);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                Global.main_hbox.getChildren().clear();
                try {
                    Global.main_hbox.getChildren().addAll(new Onum_List());
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });


        Button giriz = button_class.Sized_btns("Önüm girizmek",0.06,0.04);
        giriz.setOnAction((e->{
            Global.main_hbox.getChildren().clear();
            try {
                Global.main_hbox.getChildren().addAll(new Onumleri_girizmek());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }));

        Button yza = button_class.Sized_btns("çykmak",0.06,0.04);
        yza.setOnAction((e->{
            Global.main_hbox.getChildren().clear();
            Global.main_hbox.getChildren().addAll(new Umumy_onumler_class());
        }));

        VBox bir_btns = new VBox(15);
        bir_btns.getChildren().addAll(giriz,yza);
        bir_btns.setAlignment(Pos.CENTER);

        VBox iki_btns = new VBox(15);
        iki_btns.getChildren().addAll(update,delete);
        iki_btns.setAlignment(Pos.CENTER);

        HBox btns = new HBox(15);
        btns.getChildren().addAll(bir_btns,iki_btns);
        btns.setAlignment(Pos.CENTER);

        VBox umumy = new VBox();
        umumy.getChildren().addAll(idbox,cat_id_box,namebox,bahasybox,senebox,btns);
        umumy.setMargin(btns,new Insets(50,0,0,200));
        umumy.setMargin(idbox,new Insets(0,0,0,200));
        umumy.setMargin(cat_id_box,new Insets(0,0,0,200));
        umumy.setMargin(namebox,new Insets(0,0,0,200));
        umumy.setMargin(bahasybox,new Insets(0,0,0,200));
        umumy.setMargin(senebox,new Insets(0,0,0,200));
        umumy.setAlignment(Pos.CENTER);
        umumy.setPrefSize(SizeConfig.Width(0.2),SizeConfig.Height(0.8));
            ScrollPane scroll = new ScrollPane();
            scroll.setContent(new Onumler_sc());


        HBox mainbox1 = new HBox(20);
        mainbox1.getChildren().addAll(umumy,scroll);
        mainbox1.setHgrow(umumy , Priority.ALWAYS);
        mainbox1.setMargin(scroll, new Insets(0,0,0,SizeConfig.Width(0.1)));
        this.getChildren().add(mainbox1);
        umumy.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.8));
        umumy.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.8));
//        this.setStyle("-fx-background-color:green;");


    }
}
