package Main.Screens.User_Screen.User_Screens.User_Memberlist;

import Main.Screens.Aylyklar.Umumy_kalas;
import Main.Screens.Admin_Screen.Left_list;
import Main.Screens.Onumler.Onumler_sc;
import Main.Util.CssConfig;
import Main.Util.Exit_class;
import Main.Util.Global;
import Main.Util.SizeConfig;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.sql.SQLException;

public class User_Left_list extends VBox {
    public User_Left_list() {
        Global.left_list = this;

        Button isgarbtn = new Button("Işgärler");
        isgarbtn.setMaxSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        isgarbtn.setMinSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        isgarbtn.getStyleClass().add("btns");
        isgarbtn.setOnAction((e)->{
            Global.main_hbox.getChildren().clear();
            try {
                Global.main_hbox.getChildren().setAll(new User_Left_list(),new User_Member_class());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            System.out.println("Isgarler klasa gecdi");
        });



        Button onumbtn = new Button("Onumler_sc");
        onumbtn.setMaxSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        onumbtn.setMinSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        onumbtn.getStyleClass().add("btns");
        onumbtn.setOnAction((e)->{
            Global.main_hbox.getChildren().clear();
            try {
                Global.main_hbox.getChildren().setAll(new Left_list(),new Onumler_sc());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            System.out.println("Onumler_sc klasa gecdi");
        });

        Button aylykbtn = new Button("Aýlyklar");
        aylykbtn.setMaxSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        aylykbtn.setMinSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        aylykbtn.getStyleClass().add("btns");
        aylykbtn.setOnAction((e)->{
            Global.main_hbox.getChildren().clear();
            Global.main_hbox.getChildren().setAll(new Left_list(),new Umumy_kalas());
            System.out.println("Aýlyk haklar klasa gecdi");
        });


        Button tutumlarbtn = new Button("Tutumlar");
        tutumlarbtn.setMaxSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        tutumlarbtn.setMinSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        tutumlarbtn.getStyleClass().add("btns");

        Button  aygirbtn= new Button("Girdejiler");
        aygirbtn.setMaxSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        aygirbtn.setMinSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        aygirbtn.getStyleClass().add("btns");

//        Button agza_bolun = new Button("Ulanyjy goşmak!");
//        agza_bolun.setMaxSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
//        agza_bolun.setMinSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
//        agza_bolun.getStyleClass().addAll("btns");
//        agza_bolun.setOnAction((e)->{
//            Global.main_hbox.getChildren().clear();
//            Global.main_hbox.getChildren().setAll(new Left_list(),new Registration());
//            System.out.println("Registrasiya_gecdi");
//        });



        Button back = new Button("Logout");
        back.setMaxSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        back.setMinSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        back.getStyleClass().add("btns");
        back.setOnAction((e)->{
            Global.pane.getChildren().remove(0);
            Global.pane.getChildren().setAll(Global.pane1);
        });

        Button exit = new Button("Exit");
        exit.setMaxSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        exit.setMinSize(SizeConfig.Width(0.1),SizeConfig.Height(0.06));
        exit.getStyleClass().add("btns");
        exit.setOnAction((e)-> {
            new Exit_class();
        });
        VBox btns = new VBox();
        btns.getChildren().addAll(isgarbtn,onumbtn,aylykbtn,aygirbtn,tutumlarbtn,back,exit);
        btns.setMargin(isgarbtn,new Insets(0,0,0,0));
        btns.setMargin(back,new Insets(200,0,0,0));
        btns.setAlignment(Pos.CENTER);
        btns.setSpacing(20);

        this.getChildren().addAll(btns);
        this.setAlignment(Pos.CENTER);
        this.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.8));
        this.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.8));
        this.getStyleClass().add("Cep_list_arka_fon");
        this.getStylesheets().addAll(CssConfig.Css());
    }
}
