package Main.Screens.Aylyklar;

import Main.Models.Hasaplasyklar;
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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Aylyk_tablitsa extends StackPane {
    public Aylyk_tablitsa() throws SQLException {
        Connector connector = new Connector();
        ScrollPane scroll = new ScrollPane();
        String buyruk = "SELECT * FROM `hasaplasyk`";
        Statement st = connector.getConnection().createStatement();
        ResultSet rt = st.executeQuery(buyruk);
        VBox dikine = new VBox();

        while (rt.next()){

            Label id = new Label(rt.getString("id"));
            id.setPrefSize(SizeConfig.Width(0.04),SizeConfig.Height(0.04));
            id.setAlignment(Pos.CENTER);
            id.getStyleClass().add("label_for_list");


            Label name = new Label(rt.getString("name"));

            name.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            name.setAlignment(Pos.CENTER);
            name.getStyleClass().add("label_for_list");

            Label surname = new Label(rt.getString("surname"));
            surname.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            surname.setAlignment(Pos.CENTER);
            surname.getStyleClass().add("label_for_list");



            Label wezipe = new Label(rt.getString("wezipe"));
            wezipe.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            wezipe.setAlignment(Pos.CENTER);
            wezipe.getStyleClass().add("label_for_list");


            Label month = new Label(rt.getString("ayy"));
            month.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
            month.setAlignment(Pos.CENTER);
            month.getStyleClass().add("label_for_list");

            Label monthsalary = new Label(rt.getString("aylygy"));
            monthsalary.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            monthsalary.setAlignment(Pos.CENTER);
            monthsalary.getStyleClass().add("label_for_list");



            Label salary = new Label(rt.getString("umumy_aylyk"));
            salary.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            salary.setAlignment(Pos.CENTER);
            salary.getStyleClass().add("label_for_list");

            Label islansagady = new Label(rt.getString("islan_sagat"));
            islansagady.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            islansagady.setAlignment(Pos.CENTER);
            islansagady.getStyleClass().add("label_for_list");


            Label islemelisagat = new Label(rt.getString("islemeli_sagat"));
            islemelisagat.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            islemelisagat.setAlignment(Pos.CENTER);
            islemelisagat.getStyleClass().add("label_for_list");

            HBox hBox = new HBox();
            hBox.getChildren().addAll(id,name,surname,wezipe,month,monthsalary,salary,islansagady,islemelisagat);

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
        ady.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        ady.setAlignment(Pos.CENTER);
        ady.getStyleClass().add("label_worker");

        Label familiyasy = new Label("Familiýasy");
        familiyasy.getStyleClass().add("label_worker");
        familiyasy.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        familiyasy.setAlignment(Pos.CENTER);

        Label wezipe = new Label("Wezipesi");
        wezipe.getStyleClass().add("label_worker");
        wezipe.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        wezipe.setAlignment(Pos.CENTER);

        Label doglanguni = new Label("Aýy");
        doglanguni.getStyleClass().add("label_worker");
        doglanguni.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
        doglanguni.setAlignment(Pos.CENTER);

        Label login = new Label("Aýlygy");
        login.getStyleClass().add("label_worker");
        login.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        login.setAlignment(Pos.CENTER);

        Label password = new Label("Umumy Aýlygy");
        password.getStyleClass().add("label_worker");
        password.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        password.setAlignment(Pos.CENTER);


        Label islemediksagat = new Label("Işlemedik sagady");
        islemediksagat.getStyleClass().add("label_worker");
        islemediksagat.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        islemediksagat.setAlignment(Pos.CENTER);

        Label aylyk = new Label("Işlemeli sagady");
        aylyk.getStyleClass().add("label_worker");
        aylyk.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        aylyk.setAlignment(Pos.CENTER);



        main_hbox.getChildren().addAll(number,ady,familiyasy,wezipe,doglanguni,login,password,islemediksagat,aylyk);
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
        ObservableList<Hasaplasyklar> members = FXCollections.observableArrayList();

        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {

                    String buyruk = "SELECT * FROM hasaplasyk WHERE name LIKE '%"+newValue+"%'";
                    Statement st=connector.getConnection().createStatement();
                    ResultSet rs=st.executeQuery(buyruk);
                    while (rs.next()){
                        members.clear();
                        members.addAll(new Hasaplasyklar(rs.getInt("id"),rs.getString("name"),rs.getString("surname"),rs.getString("wezipe"),rs.getString("ayy"),rs.getDouble("aylygy"),
                                rs.getDouble("umumy_aylyk"),rs.getInt("islan_sagat"),rs.getInt("islemeli_sagat")));

                    }
                    if(!textField.getText().isEmpty()){
                        for (Hasaplasyklar out : members){
                            Platform.runLater(()->{
                                int a = out.getId();

                                HBox jemi = new HBox();
                                Label label1 = new Label(String.valueOf(a));
                                label1.setPrefSize(SizeConfig.Width(0.04),SizeConfig.Height(0.04));
                                label1.setAlignment(Pos.CENTER);
                                label1.getStyleClass().add("label_for_list");


                                Label label2 = new Label(out.getName());
                                label2.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label2.setAlignment(Pos.CENTER);
                                label2.getStyleClass().add("label_for_list");

                                Label label3 = new Label(out.getSurname());
                                label3.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label3.setAlignment(Pos.CENTER);
                                label3.getStyleClass().add("label_for_list");



                                Label label4 = new Label(out.getWezipe());
                                label4.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label4.setAlignment(Pos.CENTER);
                                label4.getStyleClass().add("label_for_list");


                                Label label5 = new Label(out.getAyy());
                                label5.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
                                label5.setAlignment(Pos.CENTER);
                                label5.getStyleClass().add("label_for_list");

                                Label label6 = new Label(String.valueOf(out.getAylygy()));
                                label6.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label6.setAlignment(Pos.CENTER);
                                label6.getStyleClass().add("label_for_list");

                                Label label7 = new Label(String.valueOf(out.getUmumy_aylyk()));
                                label7.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label7.setAlignment(Pos.CENTER);
                                label7.getStyleClass().add("label_for_list");

                                Label label8 = new Label(String.valueOf(out.getIslan_sagat()));
                                label8.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label8.setAlignment(Pos.CENTER);
                                label8.getStyleClass().add("label_for_list");

                                String aylyk = String.valueOf(String.valueOf(out.getIslemeli_sagat()));

                                Label label9 = new Label(aylyk);
                                label9.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label9.setAlignment(Pos.CENTER);
                                label9.getStyleClass().add("label_for_list");


                                jemi.getChildren().addAll(label1,label2,label3,label4,label5,label6,label7,label8,label9);
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

