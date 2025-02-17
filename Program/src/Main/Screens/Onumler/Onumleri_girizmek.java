package Main.Screens.Onumler;

import Main.Util.Connector;
import Main.Util.Global;
import Main.Util.Number_Allert;
import Main.Util.SizeConfig;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.sql.*;

public class Onumleri_girizmek extends VBox {
    public Onumleri_girizmek() throws SQLException {

        Connector conn = new Connector();

        Label id = new Label("Id");
        id.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        id.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        id.getStyleClass().add("Registration_labels");


        TextField idtext = new TextField();
        idtext.setPromptText("Id");
        idtext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        idtext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        idtext.getStyleClass().add("Registration_Texts");

        VBox id_box = new VBox();
        id_box.getChildren().addAll(id,idtext);
        id_box.setSpacing(15);
        id_box.setAlignment(Pos.CENTER);

        Label cat_id = new Label("Kategoriya id");
        cat_id.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        cat_id.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        cat_id.getStyleClass().add("Registration_labels");


        ComboBox catid_text = new ComboBox();
        catid_text.setPromptText("Kategoriýa id");
        catid_text.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        catid_text.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        catid_text.getStyleClass().add("Registration_Texts");

        String selbuyruk = "SELECT * FROM `kategoriya`";
        Statement sl = conn.getConnection().createStatement();
        ResultSet res = sl.executeQuery(selbuyruk);
        while (res.next()){
            catid_text.getItems().addAll(res.getInt("id"));
        }
        int category_id = Integer.valueOf(String.valueOf(catid_text.getSelectionModel()));

        VBox catid_box = new VBox();
        catid_box.getChildren().addAll(cat_id,catid_text);
        catid_box.setSpacing(15);
        catid_box.setAlignment(Pos.CENTER);

        Label name = new Label("Ady");
        name.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        name.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        name.getStyleClass().add("Registration_labels");


        TextField name_text = new TextField();
        name_text.setPromptText("Ady");
        name_text.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        name_text.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));

        VBox name_box = new VBox();
        name_box.getChildren().addAll(name,name_text);
        name_box.setSpacing(15);
        name_box.setAlignment(Pos.CENTER);

        Label bahasy = new Label("Bahasy");
        bahasy.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        bahasy.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        bahasy.getStyleClass().add("Registration_labels");


        TextField bahasy_text = new TextField();
        bahasy_text.setPromptText("Bahasy");
        bahasy_text.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        bahasy_text.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        bahasy_text.getStyleClass().add("Registration_Texts");

        VBox baha_box = new VBox();
        baha_box.getChildren().addAll(bahasy,bahasy_text);
        baha_box.setSpacing(15);
        baha_box.setAlignment(Pos.CENTER);

        Label info = new Label("Umumy maglumat");
        info.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        info.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        info.getStyleClass().add("Registration_labels");

        TextField info_text = new TextField();
        info_text.setPromptText("Umumy maglumat");
        info_text.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        info_text.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        info_text.getStyleClass().add("Registration_Texts");

        VBox info_box = new VBox();
        info_box.getChildren().addAll(info,info_text);
        info_box.setSpacing(15);
        info_box.setAlignment(Pos.CENTER);

        Button girizmek = new Button("Girizmek");
        girizmek.setPrefSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        girizmek.getStyleClass().addAll("Regbtn");

        girizmek.setOnAction((e)->{

            if (Number_Allert.DoubleAllert(bahasy_text.getText())== false||Number_Allert.IntegerAllert(id.getText())==false){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ýalňyşlyk");
                alert.setContentText("Siziň bahasy ýa - da idisi maglumatlaryňyz san bolmaly!");
                alert.show();
            }

            if (Number_Allert.DoubleAllert(bahasy_text.getText())== true||Number_Allert.IntegerAllert(id.getText())==true) {

                String buyruk = "INSERT INTO `onumler`(`id`, `ctegory_id`, `name`, `bahasy`, `info`) VALUES ('"+Integer.valueOf(idtext.getText())+"'," +
                        "'"+catid_text.getSelectionModel().getSelectedItem()+"','"+name_text.getText()+"','"+Double.valueOf(bahasy_text.getText())+"','"+info_text.getText()+"')";
                Statement st;
                try {
                    st = conn.getConnection().createStatement();
                    st.executeUpdate(buyruk);
                    String select1 = "SELECT * FROM `onumler`";
                    Statement stat1 = conn.getConnection().createStatement();
                    ResultSet rt1 = stat1.executeQuery(select1);
                    while (rt1.next()){
                        int i2 = 0;
                        i2++;
                        String udate = "UPDATE `onumler` SET `tb`='"+i2+"'WHERE tb = '"+rt1.getInt("tb")+"';";
                        Statement st1;
                        st1 = conn.getConnection().createStatement();
                        st1.executeUpdate(udate);
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            }

            System.out.println("Onum girizildi");

        });

        Button yza = new Button("çykmak");
        yza.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        yza.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
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
        productbox.getChildren().addAll(id_box,catid_box,name_box,baha_box,info_box,girizmek,yza);
        productbox.setAlignment(Pos.CENTER);



        this.getChildren().addAll(productbox);
        this.setPrefSize(SizeConfig.Width(0.8),SizeConfig.Height(0.76));
        this.setAlignment(Pos.CENTER);
        this.setVgrow(productbox,Priority.ALWAYS);
        this.getStylesheets().addAll("/Resource/Style/Style.css");
        this.getStyleClass().addAll("product");
    }
}
