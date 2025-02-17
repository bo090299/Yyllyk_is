package Main.Screens.Admin_Screen;

import Main.Component.LoginScreen.Registration;
import Main.Screens.Aylyklar.Aylyk_list;
import Main.Screens.Onumler.Umumy_onumler_class;
import Main.Util.CssConfig;
import Main.Util.Exit_class;
import Main.Util.Global;
import Main.Util.SizeConfig;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

import java.sql.SQLException;

public class Left_list extends VBox {
    public Left_list() {
        Global.left_list = this;

        // Кнопка "Işgärler"
        Button isgarbtn = new Button("Işgärler");
        configureButton(isgarbtn);
        isgarbtn.setOnAction((e) -> {
            Global.main_hbox.getChildren().clear();
            try {
                Global.main_hbox.getChildren().addAll(new Mamber_List());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            System.out.println("Isgarler klasa gecdi");
        });

        // Кнопка "Önümler"
        Button onumbtn = new Button("Önümler");
        configureButton(onumbtn);
        onumbtn.setOnAction((e) -> {
            Global.main_hbox.getChildren().clear();
            Global.main_hbox.getChildren().setAll(new Umumy_onumler_class());
        });

        // Кнопка "Aýlyklar"
        Button aylykbtn = new Button("Aýlyklar");
        configureButton(aylykbtn);
        aylykbtn.setOnAction((e) -> {
            Global.main_hbox.getChildren().clear();
            try {
                Global.main_hbox.getChildren().setAll(new Aylyk_list());
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            System.out.println("Aýlyk haklar klasa gecdi");
        });

        // Кнопка "Ulanyjy goşmak"
        Button agza_bolun = new Button("Ulanyjy \ngoşmak");
        configureButton(agza_bolun);
        agza_bolun.setOnAction((e) -> {
            Global.main_hbox.getChildren().clear();
            Global.main_hbox.getChildren().setAll(new Registration());
            System.out.println("Registrasiya_gecdi");
        });

        // Кнопка "Logout"
        Button back = new Button("Logout");
        configureButton(back);
        back.setOnAction((e) -> {
            Global.pane.getChildren().remove(0);
            Global.pane.getChildren().setAll(Global.pane1);
        });

        // Кнопка "Exit"
        Button exit = new Button("Exit");
        configureButton(exit);
        exit.setOnAction((e) -> {
            new Exit_class();
        });

        // Создание контейнера для кнопок
        VBox btns = new VBox();
        btns.getChildren().addAll(isgarbtn, onumbtn, aylykbtn, agza_bolun, back, exit);
        btns.setSpacing(20);
        btns.setAlignment(Pos.CENTER);
        btns.setMargin(isgarbtn, new Insets(0, 0, 0, 0));
        btns.setMargin(back, new Insets(200, 0, 0, 0));

        // Добавление кнопок в основной контейнер
        this.getChildren().addAll(btns);
        this.setAlignment(Pos.CENTER);
        this.setMaxSize(SizeConfig.Width(0.2), SizeConfig.Height(0.8));
        this.setMinSize(SizeConfig.Width(0.2), SizeConfig.Height(0.8));
        this.getStyleClass().add("Cep_list_arka_fon");
        this.getStylesheets().addAll(CssConfig.Css());
    }

    // Метод для настройки кнопок
    private void configureButton(Button button) {
        button.setMaxSize(SizeConfig.Width(0.1), SizeConfig.Height(0.06));
        button.setMinSize(SizeConfig.Width(0.1), SizeConfig.Height(0.06));
        button.getStyleClass().add("btns");
    }
}
