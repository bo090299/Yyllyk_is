package Main.Screens.Admin_Screen;

import Main.Models.Isgarler;
import Main.Util.Connector;
import Main.Util.SizeConfig;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.sql.*;

public class Tablisa extends StackPane {
    public Tablisa() throws SQLException {
        ScrollPane scroll = new ScrollPane();
        Connector connector = new Connector();
        String buyruk = "SELECT * FROM `isgarler`";
        Statement st = connector.getConnection().createStatement();
        ResultSet rt = st.executeQuery(buyruk);
        VBox dikine = new VBox();

        while (rt.next()){

            Label id = new Label(rt.getString("id"));
            id.setPrefSize(SizeConfig.Width(0.04),SizeConfig.Height(0.04));
            id.setAlignment(Pos.CENTER);
            id.getStyleClass().add("label_for_list");


            Label name = new Label(rt.getString("name"));

            name.setPrefSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
            name.setAlignment(Pos.CENTER);
            name.getStyleClass().add("label_for_list");

            Label surname = new Label(rt.getString("surname"));
            surname.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            surname.setAlignment(Pos.CENTER);
            surname.getStyleClass().add("label_for_list");



            Label wezipe = new Label(rt.getString("wezipe"));
            wezipe.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
            wezipe.setAlignment(Pos.CENTER);
            wezipe.getStyleClass().add("label_for_list");


            Label birthday = new Label(rt.getString("brithday"));
            birthday.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
            birthday.setAlignment(Pos.CENTER);
            birthday.getStyleClass().add("label_for_list");

            Label number = new Label(rt.getString("number"));
            number.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            number.setAlignment(Pos.CENTER);
            number.getStyleClass().add("label_for_list");

            Label login = new Label(rt.getString("login"));
            login.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            login.setAlignment(Pos.CENTER);
            login.getStyleClass().add("label_for_list");

            Label password = new Label(rt.getString("password"));
            password.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            password.setAlignment(Pos.CENTER);
            password.getStyleClass().add("label_for_list");

            Label nomeri = new Label(rt.getString("number"));
            nomeri.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            nomeri.setAlignment(Pos.CENTER);
            nomeri.getStyleClass().add("label_for_list");

            Label salary = new Label(rt.getString("umumyAylyk"));
            salary.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
            salary.setAlignment(Pos.CENTER);
            salary.getStyleClass().add("label_for_list");

            Label role = new Label(rt.getString("role"));
            role.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            role.setAlignment(Pos.CENTER);
            role.getStyleClass().add("label_for_list");


            Label own_id = new Label(rt.getString("own_id"));
            own_id.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
            own_id.setAlignment(Pos.CENTER);
            own_id.getStyleClass().add("label_for_list");

            HBox hBox = new HBox();
            hBox.getChildren().addAll(id,name,surname,wezipe,birthday,login,password,number,salary,role,own_id);

            dikine.getChildren().addAll(hBox);
        }

        dikine.setAlignment(Pos.CENTER);
        scroll.setContent(dikine);
        scroll.hbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);
        scroll.vbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);

        //yokarky bolegi
        HBox main_hbox = new HBox();

        Label number = new Label("№");
        number.getStyleClass().add("label_worker");
        number.setPrefSize(SizeConfig.Width(0.04),SizeConfig.Height(0.04));


        Label ady = new Label("Ady");
        ady.setPrefSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
        ady.setAlignment(Pos.CENTER);
        ady.getStyleClass().add("label_worker");

        Label familiyasy = new Label("Familiýasy");
        familiyasy.getStyleClass().add("label_worker");
        familiyasy.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        familiyasy.setAlignment(Pos.CENTER);

        Label wezipe = new Label("Wezipesi");
        wezipe.getStyleClass().add("label_worker");
        wezipe.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
        wezipe.setAlignment(Pos.CENTER);

        Label doglanguni = new Label("Doglan güni");
        doglanguni.getStyleClass().add("label_worker");
        doglanguni.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
        doglanguni.setAlignment(Pos.CENTER);

        Label login = new Label("Logini");
        login.getStyleClass().add("label_worker");
        login.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        login.setAlignment(Pos.CENTER);

        Label password = new Label("Paroly");
        password.getStyleClass().add("label_worker");
        password.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        password.setAlignment(Pos.CENTER);


        Label telofony = new Label("Telefon belgisi");
        telofony.getStyleClass().add("label_worker");
        telofony.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        telofony.setAlignment(Pos.CENTER);

        Label aylyk = new Label("Aýlygy");
        aylyk.getStyleClass().add("label_worker");
        aylyk.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
        aylyk.setAlignment(Pos.CENTER);

        Label role = new Label("Roly");
        role.getStyleClass().add("label_worker");
        role.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        role.setAlignment(Pos.CENTER);

        Label sahsy_id = new Label("Şahsy idisi");
        sahsy_id.getStyleClass().add("label_worker");
        sahsy_id.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
        sahsy_id.setAlignment(Pos.CENTER);

        main_hbox.getChildren().addAll(number,ady,familiyasy,wezipe,doglanguni,login,password,telofony,aylyk,role,sahsy_id);
        main_hbox.setPrefWidth(SizeConfig.Width(0.6));

        VBox all_vbox = new VBox();


        HBox for_text = new HBox();
        TextField textField =new TextField();
        textField.setPromptText("Gözlemek üçin");
        Label search = new Label("Gözleg...");
        search.getStyleClass().add("Search");
        textField.setPrefSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        textField.getStyleClass().add("Gozleg");
        VBox vBox =new VBox();
        ObservableList<Isgarler> members = FXCollections.observableArrayList();

        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {

                    String buyruk = "SELECT * FROM isgarler WHERE name LIKE '%"+newValue+"%'";
                    Statement st=connector.getConnection().createStatement();
                    ResultSet rs=st.executeQuery(buyruk);
                    while (rs.next()){
                        members.clear();
                        members.addAll(new Isgarler(rs.getInt("id"),rs.getString("name"),rs.getString("surname"),rs.getString("wezipe"),rs.getString("brithday"),rs.getString("login"),
                                rs.getString("password"),rs.getString("number"),rs.getDouble("umumyAylyk"),rs.getString("role"),rs.getString("own_id")));

                    }
                    if(!textField.getText().isEmpty()){
                        for (Isgarler out : members){
                            Platform.runLater(()->{
                                int a = out.getId();

                                HBox jemi = new HBox();
                                Label label1 = new Label(String.valueOf(a));
                                label1.setPrefSize(SizeConfig.Width(0.04),SizeConfig.Height(0.04));
                                label1.setAlignment(Pos.CENTER);
                                label1.getStyleClass().add("label_for_list");


                                Label label2 = new Label(out.getName());
                                label2.setPrefSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
                                label2.setAlignment(Pos.CENTER);
                                label2.getStyleClass().add("label_for_list");

                                Label label3 = new Label(out.getSurname());
                                label3.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label3.setAlignment(Pos.CENTER);
                                label3.getStyleClass().add("label_for_list");



                                Label label4 = new Label(out.getWezipe());
                                label4.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
                                label4.setAlignment(Pos.CENTER);
                                label4.getStyleClass().add("label_for_list");


                                Label label5 = new Label(out.getBrithday());
                                label5.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
                                label5.setAlignment(Pos.CENTER);
                                label5.getStyleClass().add("label_for_list");

                                Label label6 = new Label(out.getLogin());
                                label6.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label6.setAlignment(Pos.CENTER);
                                label6.getStyleClass().add("label_for_list");

                                Label label7 = new Label(out.getPassword());
                                label7.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label7.setAlignment(Pos.CENTER);
                                label7.getStyleClass().add("label_for_list");

                                Label label8 = new Label(out.getNumber());
                                label8.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label8.setAlignment(Pos.CENTER);
                                label8.getStyleClass().add("label_for_list");

                                String aylyk = String.valueOf(out.getUmumyAylyk());

                                Label label9 = new Label(aylyk);
                                label9.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
                                label9.setAlignment(Pos.CENTER);
                                label9.getStyleClass().add("label_for_list");

                                Label label10 = new Label(out.getRole());
                                label10.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label10.setAlignment(Pos.CENTER);
                                label10.getStyleClass().add("label_for_list");

                                Label label11 = new Label(String.valueOf(out.getOwn_id()));
                                label11.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
                                label11.setAlignment(Pos.CENTER);
                                label11.getStyleClass().add("label_for_list");



                                jemi.getChildren().addAll(label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11);
                                members.clear();
                                vBox.getChildren().clear();
                                vBox.getChildren().addAll(new VBox(jemi) );
                                vBox.getChildren().add(0,all_vbox);

                            });

                        }
                    }
                    else {
                        members.clear();
                        vBox.getChildren().clear();
                        vBox.getChildren().add(scroll);
                        vBox.getChildren().add(0,all_vbox);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        for_text.getChildren().addAll(search,textField);

        for_text.setAlignment(Pos.CENTER_LEFT);

        all_vbox.getChildren().addAll(for_text,main_hbox);
        vBox.getChildren().addAll(all_vbox);
        vBox.getChildren().add(1,members.size() == 0 ? scroll : null);

        this.getChildren().addAll(vBox);
        this.setPrefSize(SizeConfig.Width(0.8),SizeConfig.Height(0.8));
    }

    }

