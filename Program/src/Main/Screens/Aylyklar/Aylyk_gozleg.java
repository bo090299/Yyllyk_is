package Main.Screens.Aylyklar;

import Main.Models.Wezipeler;
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

public class Aylyk_gozleg extends StackPane {
    public Aylyk_gozleg() throws SQLException {
        ScrollPane scroll = new ScrollPane();
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/accountant", "root","");
        String buyruk = "SELECT * FROM `wezipeler`";
        java.sql.Statement st = connection.createStatement();
        ResultSet rt = st.executeQuery(buyruk);
        VBox dikine = new VBox();
        int i = 0 ;
        while (rt.next()){
            i++;
            String update = "UPDATE `wezipeler` SET `id`= "+i+" WHERE id = "+rt.getInt("id")+" ;";
            Statement up = connection.createStatement();
            up.executeUpdate(update);
            Label label1 = new Label(rt.getString("id"));
            label1.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
            label1.setAlignment(Pos.CENTER);
            label1.getStyleClass().add("label_for_list");


            Label label2 = new Label(rt.getString("ady"));
            label2.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            label2.setAlignment(Pos.CENTER);
            label2.getStyleClass().add("label_for_list");

            Label label3 = new Label(rt.getString("familiyasy"));
            label3.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
            label3.setAlignment(Pos.CENTER);
            label3.getStyleClass().add("label_for_list");


            Label label5 = new Label(rt.getString("title"));
            label5.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            label5.setAlignment(Pos.CENTER);
            label5.getStyleClass().add("label_for_list");


            Label label7 = new Label(rt.getString("aylyk_haky")+"  TMT");
            label7.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
            label7.setAlignment(Pos.CENTER);
            label7.getStyleClass().add("label_for_list");

            HBox hBox = new HBox();
            hBox.getChildren().addAll(label1,label2,label3,label5,label7);

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
        number.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));


        Label ady = new Label("Ady");
        ady.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        ady.setAlignment(Pos.CENTER);
        ady.getStyleClass().add("label_worker");

        Label familiyasy = new Label("Familiýasy");
        familiyasy.getStyleClass().add("label_worker");
        familiyasy.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
        familiyasy.setAlignment(Pos.CENTER);

        Label wezipe = new Label("Wezipesi");
        wezipe.getStyleClass().add("label_worker");
        wezipe.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        wezipe.setAlignment(Pos.CENTER);

        Label aylyk = new Label("Aýlyk");
        aylyk.getStyleClass().add("label_worker");
        aylyk.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        aylyk.setAlignment(Pos.CENTER);

        main_hbox.getChildren().addAll(number,ady,familiyasy,wezipe,aylyk);
        VBox all_vbox = new VBox();


        HBox for_text = new HBox();
        TextField textField =new TextField();
        textField.setPromptText("Gözlemek üçin");
        Label search = new Label("Gözleg...");
        search.getStyleClass().add("Search");
        textField.setPrefSize(SizeConfig.Width(0.2),SizeConfig.Height(0.04));
        textField.getStyleClass().add("Gozleg");
        VBox vBox =new VBox();
        ObservableList<Wezipeler> wezipeler = FXCollections.observableArrayList();

        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    Connection baglansyk = DriverManager.getConnection("jdbc:mysql://127.0.0.1/accountant","root","");
                    String buyruk = "SELECT * FROM wezipeler WHERE ady LIKE '%"+newValue+"%'";
                    Statement st=baglansyk.createStatement();
                    ResultSet rs=st.executeQuery(buyruk);
                    while (rs.next()){
                        wezipeler.clear();

                    }
                    if(!textField.getText().isEmpty()){
                        for (Wezipeler out : wezipeler){
                            Platform.runLater(()->{




                                HBox jemi = new HBox();
                                Label label1 = new Label(String.valueOf(out.getId()));
                                label1.setPrefSize(SizeConfig.Width(0.03),SizeConfig.Height(0.04));
                                label1.setAlignment(Pos.CENTER);
                                label1.getStyleClass().add("label_for_list");


                                Label label2 = new Label();
                                label2.setPrefSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
                                label2.setAlignment(Pos.CENTER);
                                label2.getStyleClass().add("label_for_list");

                                Label label3 = new Label();
                                label3.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label3.setAlignment(Pos.CENTER);
                                label3.getStyleClass().add("label_for_list");



                                Label label4 = new Label();
                                label4.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
                                label4.setAlignment(Pos.CENTER);
                                label4.getStyleClass().add("label_for_list");


                                Label label5 = new Label();
                                label5.setPrefSize(SizeConfig.Width(0.25),SizeConfig.Height(0.04));
                                label5.setAlignment(Pos.CENTER);
                                label5.getStyleClass().add("label_for_list");





                                jemi.getChildren().addAll(label1,label2,label3,label4,label5);
                                wezipeler.clear();
                                vBox.getChildren().clear();
                                vBox.getChildren().addAll(new VBox(jemi) );
                                vBox.getChildren().add(0,all_vbox);

                            });

                        }
                    }
                    else {
                        wezipeler.clear();
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
        vBox.getChildren().add(1,wezipeler.size() == 0 ? scroll : null);

        this.getChildren().addAll(vBox);
        this.setPrefSize(SizeConfig.Width(0.6),SizeConfig.Height(0.8));
    }
    }

