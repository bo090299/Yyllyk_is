package Main.Screens.Aylyklar;

import Main.Util.Connector;
import Main.Util.Global;
import Main.Util.Number_Allert;
import Main.Util.SizeConfig;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.sql.*;

public class
Aydaky_toleg extends VBox {
    public Aydaky_toleg() throws SQLException {

        Connector connector = new Connector();

        Label isgarin_ady = new Label("Ady");
        isgarin_ady.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.02));
        isgarin_ady.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.02));
        isgarin_ady.getStyleClass().add("Registration_labels");
        TextField ady = new TextField();
        ady.setPromptText("Ady");
        ady.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        ady.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        ady.getStyleClass().add("Registration_Texts");
        VBox adybox = new VBox();
        adybox.getChildren().addAll(isgarin_ady,ady);
        adybox.setSpacing(5);
        adybox.setAlignment(Pos.CENTER);


        Label familiya = new Label("Familiýasy");
        familiya.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        familiya.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        familiya.getStyleClass().add("Registration_labels");
        TextField isgarin_familiyasy = new TextField();
        isgarin_familiyasy.setPromptText("Familiýasy");
        isgarin_familiyasy.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        isgarin_familiyasy.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        isgarin_familiyasy.getStyleClass().add("Registration_Texts");
        VBox familiyabox = new VBox();
        familiyabox.getChildren().addAll(familiya,isgarin_familiyasy);
        familiyabox.setSpacing(5);
        familiyabox.setAlignment(Pos.CENTER);


        Label wezipe = new Label("Wezipesi");
        wezipe.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        wezipe.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        wezipe.getStyleClass().add("Registration_labels");
        TextField isgarin_wezipesi = new TextField();
        isgarin_wezipesi.setPromptText("Wezipesi");
        isgarin_wezipesi.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        isgarin_wezipesi.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        isgarin_wezipesi.getStyleClass().add("Registration_Texts");
        VBox wezipebox = new VBox();
        wezipebox.getChildren().addAll(wezipe,isgarin_wezipesi);
        wezipebox.setSpacing(5);
        wezipebox.setAlignment(Pos.CENTER);


        Label islemedik_sagatlar = new Label("Işlemedik sagatlary");
        islemedik_sagatlar.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        islemedik_sagatlar.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        islemedik_sagatlar.getStyleClass().add("Registration_labels");
        TextField islemedik_sagattext = new TextField();
        islemedik_sagattext.setPromptText("Işlemedik sagatlary");
        islemedik_sagattext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        islemedik_sagattext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        islemedik_sagattext.getStyleClass().add("Registration_Texts");
        VBox islenmedik_sagatbox = new VBox();
        islenmedik_sagatbox.getChildren().addAll(islemedik_sagatlar,islemedik_sagattext);
        islenmedik_sagatbox.setSpacing(5);
        islenmedik_sagatbox.setAlignment(Pos.CENTER);

        Label islenmeli_sagat = new Label("Işlemeli sagady");
        islenmeli_sagat.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        islenmeli_sagat.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        islenmeli_sagat.getStyleClass().add("Registration_labels");
        TextField islenmeli_sagattext = new TextField();
        islenmeli_sagattext.setPromptText("Işlemeli sagady");
        islenmeli_sagattext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        islenmeli_sagattext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        islenmeli_sagattext.getStyleClass().add("Registration_Texts");
        VBox islenmeli_sagatbox = new VBox();
        islenmeli_sagatbox.getChildren().addAll(islenmeli_sagat,islenmeli_sagattext);
        islenmeli_sagatbox.setSpacing(5);
        islenmeli_sagatbox.setAlignment(Pos.CENTER);


        Label ayy = new Label("Aýy");
        ayy.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        ayy.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        ayy.getStyleClass().add("Registration_labels");
        ComboBox ay = new ComboBox();
        ay.setPrefSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        ay.getStyleClass().add("Registration_Texts");
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
        VBox ayybox = new VBox();
        ayybox.getChildren().addAll(ayy,ay);
        ayybox.setSpacing(5);
        ayybox.setAlignment(Pos.CENTER);


        Button girizmek = new Button("Girizmek");
        girizmek.setPrefSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        girizmek.getStyleClass().addAll("Regbtn");
        girizmek.setOnAction((e)->{
            String select = "SELECT * FROM `wezipeler`;";
            double girmeli_hasap = 0;

            if (Number_Allert.IntegerAllert(islemedik_sagattext.getText())== false
                || Number_Allert.IntegerAllert(islenmeli_sagattext.getText()) == false ){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ýalňyşlyk");
                alert.setContentText("Işlenmedik sagat bilen Işlemeli sagat san gornuşde girizilmeli");
                alert.show();
            }
            else if (ady.getText().isEmpty()||isgarin_familiyasy.getText().isEmpty()||isgarin_wezipesi.getText().isEmpty()
                    ||islemedik_sagattext.getText().isEmpty()||islenmeli_sagattext.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ýalňyşlyk");
                alert.setContentText("Boşluklary doldurmagyňyzy haýyş edýäris !");
                alert.show();
            }else {
                try {
                    Statement sel = connector.getConnection().createStatement();
                    ResultSet res = sel.executeQuery(select);
                    while (res.next()) {
                        if (res.getString("name").equals(ady.getText())&&res.getString("surname").equals(isgarin_familiyasy.getText()) ){
                            girmeli_hasap = res.getDouble("aylygy")-((res.getDouble("aylygy")/Double.valueOf(islenmeli_sagattext.getText())*Double.valueOf(islemedik_sagattext.getText())));
                            String buyruk = "INSERT INTO `hasaplasyk`(`name`, `surname`, `wezipe`, `ayy`, `aylygy`, `umumy_aylyk`, `islan_sagat`, `islemeli_sagat`) " +
                                    "VALUES ('"+ady.getText()+"','"+isgarin_familiyasy.getText()+"','"+isgarin_wezipesi.getText()+"','"+ay.getSelectionModel().getSelectedItem()+"'," +
                                    "'"+girmeli_hasap+"','"+res.getDouble("aylygy")+"','"+Integer.parseInt(islemedik_sagattext.getText())+"','"+Integer.parseInt(islenmeli_sagattext.getText())+"')";
                            Statement st = connector.getConnection().createStatement();
                            st.executeUpdate(buyruk);
                        }else {
                            girmeli_hasap = res.getDouble("aylygy")-((res.getDouble("aylygy")/Double.valueOf(islenmeli_sagattext.getText())*Double.valueOf(islemedik_sagattext.getText())));
                            String buyruk = "INSERT INTO `hasaplasyk`(`name`, `surname`, `wezipe`, `ayy`, `aylygy`, `umumy_aylyk`, `islan_sagat`, `islemeli_sagat`) " +
                                    "VALUES ('"+ady.getText()+"','"+isgarin_familiyasy.getText()+"','"+isgarin_wezipesi.getText()+"','"+ay.getSelectionModel().getSelectedItem()+"'," +
                                    "'"+girmeli_hasap+"','"+res.getDouble("aylygy")+"','"+Integer.parseInt(islemedik_sagattext.getText())+"','"+Integer.parseInt(islenmeli_sagattext.getText())+"')";
                            Statement st = connector.getConnection().createStatement();
                            st.executeUpdate(buyruk);
                        }
//                    else if (res.getString("ady").equals(ady.getText())&&res.getString("familiyasy").equals(isgarin_familiyasy.getText())){
//                        girmeli_hasap = res.getDouble("aylyk_haky")-(gelmedik*(res.getDouble("aylyk_haky")/31));
//                    }

                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }

            ady.clear();
            isgarin_familiyasy.clear();
            isgarin_wezipesi.clear();
            islemedik_sagattext.clear();
            islenmeli_sagattext.clear();
            System.out.println("Aylyk girizildi");

        });

        Button yza = new Button("Yza");
        yza.setPrefSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        yza.getStyleClass().addAll("Regbtn");
        yza.setOnAction((e)->{
            Global.main_hbox.getChildren().clear();
            try {
                Global.main_hbox.getChildren().addAll(new Aylyk_list());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            System.out.println("cykdy");
        });

        VBox mainbox = new VBox();
        mainbox.setSpacing(10);
        mainbox.getChildren().addAll(adybox,familiyabox,wezipebox,ayybox,islenmedik_sagatbox,islenmeli_sagatbox,girizmek,yza);
        mainbox.setAlignment(Pos.CENTER);


        this.getChildren().addAll(mainbox);
        this.setPrefSize(SizeConfig.Width(1),SizeConfig.Height(0.8));
        this.setAlignment(Pos.CENTER);
        this.setVgrow(mainbox,Priority.ALWAYS);
    }
}
