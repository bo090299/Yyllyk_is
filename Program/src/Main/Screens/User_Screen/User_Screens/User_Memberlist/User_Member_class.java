package Main.Screens.User_Screen.User_Screens.User_Memberlist;

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

public class User_Member_class extends StackPane {
    public User_Member_class() throws SQLException {
        Connector connector = new Connector();

        ScrollPane scroll = new ScrollPane();
        String buyruk = "SELECT * FROM `isgarler`";
        Statement st = connector.getConnection().createStatement();
        ResultSet rt = st.executeQuery(buyruk);
        VBox dikine = new VBox();
        int i = 0;

        while (rt.next()){
            i++;
            String buyruk1 = "UPDATE `isgarler` SET `id`='"+i+"'WHERE id = '"+rt.getInt("id")+"';";
            Statement st1;
            st1 = connector.getConnection().createStatement();
            st1.executeUpdate(buyruk1);

            Label label1 = new Label(rt.getString("id"));
            label1.setPrefSize(SizeConfig.Width(0.02),SizeConfig.Height(0.04));
            label1.setAlignment(Pos.CENTER);
            label1.getStyleClass().add("label_for_list");


            Label label2 = new Label(rt.getString("name"));

            label2.setPrefSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
            label2.setAlignment(Pos.CENTER);
            label2.getStyleClass().add("label_for_list");

            Label label3 = new Label(rt.getString("surname"));
            label3.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            label3.setAlignment(Pos.CENTER);
            label3.getStyleClass().add("label_for_list");



            Label label4 = new Label(rt.getString("wezipe"));
            label4.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
            label4.setAlignment(Pos.CENTER);
            label4.getStyleClass().add("label_for_list");


            Label label5 = new Label(rt.getString("brithday"));
            label5.setPrefSize(SizeConfig.Width(0.25),SizeConfig.Height(0.04));
            label5.setAlignment(Pos.CENTER);
            label5.getStyleClass().add("label_for_list");

            Label label6 = new Label(rt.getString("number"));
            label6.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            label6.setAlignment(Pos.CENTER);
            label6.getStyleClass().add("label_for_list");

            Label label7 = new Label(rt.getString("pasport"));
            label7.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
            label7.setAlignment(Pos.CENTER);
            label7.getStyleClass().add("label_for_list");

            HBox hBox = new HBox();
            hBox.getChildren().addAll(label1,label2,label3,label4,label5,label6,label7);

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
        number.setPrefSize(SizeConfig.Width(0.02),SizeConfig.Height(0.04));


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

        Label adress = new Label("Öý salgysy");
        adress.getStyleClass().add("label_worker");
        adress.setPrefSize(SizeConfig.Width(0.25),SizeConfig.Height(0.04));
        adress.setAlignment(Pos.CENTER);



        Label telofony = new Label("Telefon belgisi");
        telofony.getStyleClass().add("label_worker");
        telofony.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        telofony.setAlignment(Pos.CENTER);


        Label pasport = new Label("Pasport belgi");
        pasport.getStyleClass().add("label_worker");
        pasport.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
        pasport.setAlignment(Pos.CENTER);

        main_hbox.getChildren().addAll(number,ady,familiyasy,wezipe,adress,telofony,pasport);
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
                        members.addAll(new Isgarler(rs.getInt("id"),rs.getString("name"),rs.getString("surname"),rs.getString("wezipesi"),rs.getString("brithday"),rs.getString("login"),
                                rs.getString("password"),rs.getString("number"),rs.getDouble("umumyAylyk"),rs.getString("role"),rs.getString("own_id")));

                    }
                    if(!textField.getText().isEmpty()){
                        for (Isgarler out : members){
                            Platform.runLater(()->{
                                int a = out.getId();

                                HBox jemi = new HBox();
                                Label label1 = new Label(String.valueOf(a));
                                label1.setPrefSize(SizeConfig.Width(0.03),SizeConfig.Height(0.04));
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
                                label5.setPrefSize(SizeConfig.Width(0.25),SizeConfig.Height(0.04));
                                label5.setAlignment(Pos.CENTER);
                                label5.getStyleClass().add("label_for_list");

                                Label label6 = new Label(out.getLogin());
                                label6.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label6.setAlignment(Pos.CENTER);
                                label6.getStyleClass().add("label_for_list");

                                Label label7 = new Label(out.getPassword());
                                label7.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
                                label7.setAlignment(Pos.CENTER);
                                label7.getStyleClass().add("label_for_list");

                                Label label8 = new Label(out.getNumber());
                                label8.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
                                label8.setAlignment(Pos.CENTER);
                                label8.getStyleClass().add("label_for_list");

                                String aylyk = String.valueOf(out.getUmumyAylyk());

                                Label label9 = new Label(aylyk);
                                label9.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
                                label9.setAlignment(Pos.CENTER);
                                label9.getStyleClass().add("label_for_list");

                                Label label10 = new Label(out.getRole());
                                label10.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
                                label10.setAlignment(Pos.CENTER);
                                label10.getStyleClass().add("label_for_list");

                                Label label11 = new Label(String.valueOf(out.getOwn_id()));
                                label11.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
                                label11.setAlignment(Pos.CENTER);
                                label11.getStyleClass().add("label_for_list");



                                jemi.getChildren().addAll(label1,label2,label3,label4,label5,label6,label7);
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
