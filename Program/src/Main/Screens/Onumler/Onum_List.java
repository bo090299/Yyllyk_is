package Main.Screens.Onumler;

import Main.Screens.Admin_Screen.Left_list;
import Main.Util.Connector;
import Main.Util.Global;
import Main.Util.SizeConfig;
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
        Label idn = new Label("Id");
        idn.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        idn.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        idn.getStyleClass().add("Registration_labels");

        TextField idtext = new TextField();
        idtext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        idtext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        idtext.getStyleClass().add("Registration_Texts");


        VBox idbox = new VBox();
        idbox.getChildren().addAll(idn,idtext);
        idbox.setSpacing(10);
        idbox.setAlignment(Pos.CENTER);


        Label onumname = new Label("Ady");
        onumname.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        onumname.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        onumname.getStyleClass().add("Registration_labels");

        TextField nametext = new TextField();
        nametext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        nametext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        nametext.getStyleClass().add("Registration_Texts");


        VBox namebox = new VBox();
        namebox.getChildren().addAll(onumname,nametext);
        namebox.setSpacing(10);
        namebox.setAlignment(Pos.CENTER);

        Label onumbahasy = new Label("Bahasy");
        onumbahasy.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        onumbahasy.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        onumbahasy.getStyleClass().add("Registration_labels");

        TextField bahasytext = new TextField();
        bahasytext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        bahasytext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        bahasytext.getStyleClass().add("Registration_Texts");


        VBox bahasybox = new VBox();
        bahasybox.getChildren().addAll(onumbahasy,bahasytext);
        bahasybox.setSpacing(10);
        bahasybox.setAlignment(Pos.CENTER);

        Label cykarylan_sene = new Label("Çykarylan sene");
        cykarylan_sene.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        cykarylan_sene.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        cykarylan_sene.getStyleClass().add("Registration_labels");

        DatePicker senetext = new DatePicker();
        senetext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        senetext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        senetext.getStyleClass().add("Registration_Texts");


        VBox senebox = new VBox();
        senebox.getChildren().addAll(cykarylan_sene,senetext);
        senebox.setSpacing(10);
        senebox.setAlignment(Pos.CENTER);

        Label onummohleti = new Label("Mohleti");
        onummohleti.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        onummohleti.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        onummohleti.getStyleClass().add("Registration_labels");

        TextField mohletitext = new TextField();
        mohletitext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        mohletitext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        mohletitext.getStyleClass().add("Registration_Texts");


        VBox mohletibox = new VBox();
        mohletibox.getChildren().addAll(onummohleti,mohletitext);
        mohletibox.setSpacing(10);
        mohletibox.setAlignment(Pos.CENTER);

        Label mukdary = new Label("Mukdary");
        mukdary.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        mukdary.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        mukdary.getStyleClass().add("Registration_labels");

        TextField mukdarytext = new TextField();
        mukdarytext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        mukdarytext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        mukdarytext.getStyleClass().add("Registration_Texts");


        VBox muktarybox = new VBox();
        muktarybox.getChildren().addAll(mukdary,mukdarytext);
        muktarybox.setSpacing(10);
        muktarybox.setAlignment(Pos.CENTER);

        Label satylany = new Label("Satylany");
        satylany.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        satylany.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        satylany.getStyleClass().add("Registration_labels");

        TextField satylanytext = new TextField();
        satylanytext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        satylanytext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        satylanytext.getStyleClass().add("Registration_Texts");


        VBox satylanbox = new VBox();
        satylanbox.getChildren().addAll(satylany,satylanytext);
        satylanbox.setSpacing(10);
        satylanbox.setAlignment(Pos.CENTER);



        Button update = new Button("Üýtgetmek");
        update.setMaxSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
        update.setMinSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
        update.getStyleClass().addAll("Regbtn");

        update.setOnAction((e)->{
            double a = Double.parseDouble(bahasytext.getText())* Double.parseDouble(satylanytext.getText());

            String buyruk1 = "UPDATE `onumler` SET`ady`='"+nametext.getText()+"',`bahasy`='"+bahasytext.getText()+"',`cykarylansenesi`='"+senetext.getValue()+"',`mohleti`='"+mohletitext.getText()+"',`umumymukdary`="+mukdarytext.getText()+",`satylanmukdary`="+satylanytext.getText()+",`girdeyji`="+a+" WHERE id = "+idtext.getText()+"; ";
            try {
                Statement stat = conn.getConnection().createStatement();
                stat.executeUpdate(buyruk1);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            VBox klas = new VBox();
            Global.main_hbox.getChildren().clear();
            try {
                klas.getChildren().addAll(new Onumler_sc(),new Onum_List());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            Global.main_hbox.getChildren().setAll(new Left_list(),klas);

        });

        Button delete = new Button("Öçürmek");
        delete.setMaxSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
        delete.setMinSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
        delete.getStyleClass().addAll("Regbtn");

        delete.setOnAction((e)->{
            String buyruk2 = "DELETE FROM `onumler` WHERE id = "+idtext.getText()+";";
            if (idtext.getText().isEmpty()||nametext.getText().isEmpty()||bahasytext.getText().isEmpty()) {
                Alert alert= new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ýalňyşlyk!");
                alert.setContentText("Öçürmeli önümiňiziň idisini giriziň!");
                alert.show();
                idtext.clear();
            }
            try {
                Statement stat1 = conn.getConnection().createStatement();
                stat1.executeUpdate(buyruk2);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            VBox klas = new VBox();
            Global.main_hbox.getChildren().clear();
            try {
                klas.getChildren().addAll(new Onumler_sc(),new Onum_List());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            Global.main_hbox.getChildren().setAll(new Left_list(),klas);
        });


        Button giriz = new Button("Önüm girizmek");
        giriz.setMaxSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
        giriz.setMinSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
        giriz.setOnAction((e->{
            Global.main_hbox.getChildren().clear();
            try {
                Global.main_hbox.getChildren().addAll(new Onumleri_girizmek());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }));

        Button yza = new Button("çykmak");
        yza.setMaxSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
        yza.setMinSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
        yza.setOnAction((e->{
            Global.main_hbox.getChildren().clear();
            Global.main_hbox.getChildren().addAll(new Umumy_onumler_class());
        }));

        VBox umumy = new VBox();
        umumy.getChildren().addAll(idbox,namebox,bahasybox,senebox,mohletibox,muktarybox,satylanbox,giriz,update,delete,yza);
        umumy.setAlignment(Pos.CENTER);
        umumy.setPrefSize(SizeConfig.Width(0.2),SizeConfig.Height(0.8));
            ScrollPane scroll = new ScrollPane();
            scroll.setContent(new Onumler_sc());


        HBox mainbox1 = new HBox();
        mainbox1.getChildren().addAll(umumy,scroll);
        mainbox1.setHgrow(umumy , Priority.ALWAYS);
        Global.pane.getChildren().add(this);
        this.getChildren().add(mainbox1);
//        this.setStyle("-fx-background-color:green;");
        this.setPrefSize(SizeConfig.Width(0.8),SizeConfig.Height(0.76));

    }
}
