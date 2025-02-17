package Main.Screens.Aylyklar;

import Main.Component.MainScreen.Main_Screen;
import Main.Util.Connector;
import Main.Util.Global;
import Main.Util.SizeConfig;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.sql.SQLException;
import java.sql.Statement;

public class Ay_boyunca_aylyk extends  VBox{
        public Ay_boyunca_aylyk(String ayy) throws SQLException {
            Connector connector = new Connector();
            Label idup = new Label("Id");
            idup.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            idup.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            idup.getStyleClass().add("Registration_labels");
            TextField idtext = new TextField();
            idtext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            idtext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            idtext.getStyleClass().add("Registration_Texts");
            VBox idbox = new VBox();
            idbox.getChildren().addAll(idup,idtext);
            idbox.setAlignment(Pos.CENTER);

            Label nameup = new Label("Ady");
            nameup.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            nameup.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            nameup.getStyleClass().add("Registration_labels");
            TextField nametext = new TextField();
            nametext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            nametext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            nametext.getStyleClass().add("Registration_Texts");
            VBox namebox = new VBox();
            namebox.getChildren().addAll(nameup,nametext);
            namebox.setAlignment(Pos.CENTER);

            Label surnameup = new Label("Familiýasy");
            surnameup.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            surnameup.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            surnameup.getStyleClass().add("Registration_labels");
            TextField surnametext = new TextField();
            surnametext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            surnametext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            surnametext.getStyleClass().add("Registration_Texts");
            VBox surnamebox = new VBox();
            surnamebox.getChildren().addAll(surnameup,surnametext);
            surnamebox.setAlignment(Pos.CENTER);

            Label wezipeup = new Label("Wezipesi");
            wezipeup.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            wezipeup.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            wezipeup.getStyleClass().add("Registration_labels");
            TextField wezipesitext = new TextField();
            wezipesitext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            wezipesitext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            wezipesitext.getStyleClass().add("Registration_Texts");
            VBox wezipebox = new VBox();
            wezipebox.getChildren().addAll(wezipeup,wezipesitext);
            wezipebox.setAlignment(Pos.CENTER);

            ComboBox ay = new ComboBox();
            ay.setPromptText("Aý saýla");
            ay.setPrefSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            ay.getStyleClass().add("Combobox");
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
            VBox aybox = new VBox();
            aybox.getChildren().addAll(ay);
            aybox.setAlignment(Pos.CENTER);

            Label salary = new Label("Umumy aýlygy");
            salary.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            salary.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            salary.getStyleClass().add("Registration_labels");
            TextField salarytext = new TextField();
            salarytext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            salarytext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            salarytext.getStyleClass().add("Registration_Texts");
            VBox saalarybox = new VBox();
            saalarybox.getChildren().addAll(salary,salarytext);
            saalarybox.setAlignment(Pos.CENTER);


            Label monthsalary = new Label("Aýlygy");
            monthsalary.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            monthsalary.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            monthsalary.getStyleClass().add("Registration_labels");
            TextField monthsalarytext = new TextField();
            monthsalarytext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            monthsalarytext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            monthsalarytext.getStyleClass().add("Registration_Texts");
            VBox monthsaalarybox = new VBox();
            monthsaalarybox.getChildren().addAll(monthsalary,monthsalarytext);
            monthsaalarybox.setAlignment(Pos.CENTER);

            Label islansagat = new Label("Işlän sagady");
            islansagat.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            islansagat.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            islansagat.getStyleClass().add("Registration_labels");
            TextField islansagattext = new TextField();
            islansagattext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            islansagattext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            islansagattext.getStyleClass().add("Registration_Texts");
            VBox islanbox = new VBox();
            islanbox.getChildren().addAll(islansagat,islansagattext);
            islanbox.setAlignment(Pos.CENTER);

            Label islemeli = new Label("Işlemeli sagady");
            islemeli.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            islemeli.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            islemeli.getStyleClass().add("Registration_labels");
            TextField islemelitext = new TextField();
            islemelitext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            islemelitext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            islemelitext.getStyleClass().add("Registration_Texts");
            VBox islemelibox = new VBox();
            islemelibox.getChildren().addAll(islemeli,islemelitext);
            islemelibox.setAlignment(Pos.CENTER);

            ComboBox ayboyunca = new ComboBox();
            ayboyunca.setPromptText("Aýlar boýunça");
            ayboyunca.getStyleClass().add("Combobox");
            ayboyunca.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.03));
            ayboyunca.getStyleClass().add("Hasaplasyklar");
            ayboyunca.getItems().add("Ýanwar");
            ayboyunca.getItems().add("Fewral");
            ayboyunca.getItems().add("Mart");
            ayboyunca.getItems().add("Aprel");
            ayboyunca.getItems().add("Maý");
            ayboyunca.getItems().add("Iýun");
            ayboyunca.getItems().add("Iýul");
            ayboyunca.getItems().add("Awgust");
            ayboyunca.getItems().add("Sentiýabr");
            ayboyunca.getItems().add("Oktýabr");
            ayboyunca.getItems().add("Noýabr");
            ayboyunca.getItems().add("Dekabr");

            Button gormek = new Button("Görmek");
            gormek.setMaxSize(SizeConfig.Width(0.07),SizeConfig.Height(0.03));
            gormek.setMinSize(SizeConfig.Width(0.07),SizeConfig.Height(0.03));
            gormek.getStyleClass().add("Regbtn");


            HBox ayboxb = new HBox(10);
            ayboxb.getChildren().addAll(ayboyunca,gormek);

            Button update = new Button("Üýtgetmek");
            update.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            update.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            update.getStyleClass().add("Regbtn");
            update.setOnAction((e->{
                try {
                    if (idtext.getText().isEmpty()){
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Ýalňyşlyk");
                        alert.setContentText("Öçürmeli maglumatyňyzyň idisini giriziň");
                        alert.show();
                    }else {
                        String buyruk = "UPDATE `hasaplasyk` SET `name`='" + nametext.getText() + "',`surname`='" + surnametext.getText() + "'," +
                                "`wezipe`='" + wezipesitext.getText() + "',`ayy`='" + ay.getSelectionModel().getSelectedItem() + "',`aylygy`='" + monthsalarytext.getText() + "'," +
                                "`umumy_aylyk`='" + salarytext.getText() + "',`islan_sagat`='" + Integer.parseInt(islansagattext.getText()) + "',`islemeli_sagat`='" + Integer.parseInt(islemelitext.getText()) + "" +
                                "' WHERE id = '" + idtext.getText() + "'";
                        Statement st = connector.getConnection().createStatement();
                        st.executeUpdate(buyruk);
                        Global.main_hbox.getChildren().clear();
                        Global.main_hbox.getChildren().addAll(new Main.Screens.Aylyklar.Aylyk_list());
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }));

            Button girizmek = new Button("Girizmek");
            girizmek.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            girizmek.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            girizmek.getStyleClass().add("Regbtn");
            girizmek.setOnAction((e->{
                        Global.main_hbox.getChildren().clear();
                        try {
                            Global.main_hbox.getChildren().addAll(new Aydaky_toleg());
                        } catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                    })
            );


            Button ocurmek = new Button("Öçürmek");
            ocurmek.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            ocurmek.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            ocurmek.getStyleClass().add("Regbtn");
            ocurmek.setOnAction((e->{
                String buyruk = "DELETE FROM `hasaplasyk` WHERE `id` = '"+idtext.getText()+"'";
                try {
                    Statement st = connector.getConnection().createStatement();
                    st.executeUpdate(buyruk);
                    Global.main_hbox.getChildren().clear();
                    Global.main_hbox.getChildren().addAll(new Main.Screens.Aylyklar.Aylyk_list());
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }));

            Button cykmak = new Button("Çykmak");
            cykmak.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            cykmak.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
            cykmak.getStyleClass().add("Regbtn");
            cykmak.setOnAction((e->{
                Global.pane.getChildren().clear();
                Global.pane.getChildren().addAll(new Main_Screen());
            }));

            VBox uytgetmekbox = new VBox(10);
            uytgetmekbox.getChildren().addAll(idbox,namebox,surnamebox,wezipebox,aybox,saalarybox,monthsaalarybox,
                    islanbox,islemelibox,ayboxb,girizmek,update,ocurmek,cykmak);
            HBox has_box = new HBox();
            has_box.setStyle("-fx-background-color: #007B7F;" +
                    "         -fx-border-width:2pt;\n" +
                    "         -fx-border-color:green;\n" +
                    "         -fx-border-radius:50px;");

            has_box.getChildren().addAll(uytgetmekbox,new Ay_boyunca_aylyk_list((String) ayboyunca.getSelectionModel().getSelectedItem()));
            has_box.setMargin(uytgetmekbox, new Insets(0,0,0,100));
            has_box.setSpacing(100);
            this.getChildren().addAll(has_box);
            this.setMaxSize(SizeConfig.Width(1),SizeConfig.Height(0.8));



        }
    }


