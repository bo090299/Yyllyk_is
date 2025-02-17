package Main.Screens.Onumler;

import Main.Models.Hasaplasyklar;
import Main.Models.Onumler;
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

public class Onumler_sc extends StackPane {
    public Onumler_sc() throws SQLException {

        Connector connector = new Connector();
        ScrollPane scroll = new ScrollPane();
        String buyruk = "SELECT * FROM `onumler`";
        Statement st = connector.getConnection().createStatement();
        ResultSet rt = st.executeQuery(buyruk);

        VBox dikine = new VBox();

        while (rt.next()){


                Label id = new Label(rt.getString("tb"));
                id.setPrefSize(SizeConfig.Width(0.04),SizeConfig.Height(0.04));
                id.setAlignment(Pos.CENTER);
                id.getStyleClass().add("label_for_list");


                Label name = new Label(rt.getString("id"));

                name.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                name.setAlignment(Pos.CENTER);
                name.getStyleClass().add("label_for_list");

                Label surname = new Label(rt.getString("category_id"));
                surname.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                surname.setAlignment(Pos.CENTER);
                surname.getStyleClass().add("label_for_list");



                Label wezipe = new Label(rt.getString("name"));
                wezipe.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                wezipe.setAlignment(Pos.CENTER);
                wezipe.getStyleClass().add("label_for_list");


                Label month = new Label(rt.getString("bahasy"));
                month.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
                month.setAlignment(Pos.CENTER);
                month.getStyleClass().add("label_for_list");

                Label monthsalary = new Label(rt.getString("info"));
                monthsalary.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                monthsalary.setAlignment(Pos.CENTER);
                monthsalary.getStyleClass().add("label_for_list");


                HBox hBox = new HBox();
                hBox.getChildren().addAll(id,name,surname,wezipe,month,monthsalary);

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


        Label ady = new Label("id");
        ady.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        ady.setAlignment(Pos.CENTER);
        ady.getStyleClass().add("label_worker");

        Label familiyasy = new Label("category_id");
        familiyasy.getStyleClass().add("label_worker");
        familiyasy.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        familiyasy.setAlignment(Pos.CENTER);

        Label wezipe = new Label("name");
        wezipe.getStyleClass().add("label_worker");
        wezipe.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        wezipe.setAlignment(Pos.CENTER);

        Label doglanguni = new Label("bahasy");
        doglanguni.getStyleClass().add("label_worker");
        doglanguni.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
        doglanguni.setAlignment(Pos.CENTER);

        Label login = new Label("info");
        login.getStyleClass().add("label_worker");
        login.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        login.setAlignment(Pos.CENTER);


        main_hbox.getChildren().addAll(number,ady,familiyasy,wezipe,doglanguni,login);
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
        ObservableList<Onumler> onumler = FXCollections.observableArrayList();

        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {

                    String buyruk = "SELECT * FROM onumler WHERE name LIKE '%"+newValue+"%'";
                    Statement st=connector.getConnection().createStatement();
                    ResultSet rs=st.executeQuery(buyruk);
                    while (rs.next()){
                        onumler.clear();
                        onumler.addAll(new Onumler(rs.getInt("tb"),rs.getInt("id"),rs.getInt("category_id"),rs.getString("name"),
                                rs.getDouble("bahasy"),rs.getString("info")));

                    }
                    if(!textField.getText().isEmpty()){
                        for (Onumler out : onumler){
                            Platform.runLater(()->{
                                int tb = out.getTb();
                                int id = out.getId();
                                int cd = out.getCategory_id();
                                double baha = out.getBahasy();

                                HBox jemi = new HBox();
                                Label label1 = new Label(String.valueOf(tb));
                                label1.setPrefSize(SizeConfig.Width(0.04),SizeConfig.Height(0.04));
                                label1.setAlignment(Pos.CENTER);
                                label1.getStyleClass().add("label_for_list");


                                Label label2 = new Label(String.valueOf(id));
                                label2.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label2.setAlignment(Pos.CENTER);
                                label2.getStyleClass().add("label_for_list");

                                Label label3 = new Label(String.valueOf(cd));
                                label3.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label3.setAlignment(Pos.CENTER);
                                label3.getStyleClass().add("label_for_list");



                                Label label4 = new Label(out.getName());
                                label4.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label4.setAlignment(Pos.CENTER);
                                label4.getStyleClass().add("label_for_list");


                                Label label5 = new Label(String.valueOf(baha));
                                label5.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
                                label5.setAlignment(Pos.CENTER);
                                label5.getStyleClass().add("label_for_list");

                                Label label6 = new Label(String.valueOf(out.getInfo()));
                                label6.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
                                label6.setAlignment(Pos.CENTER);
                                label6.getStyleClass().add("label_for_list");


                                jemi.getChildren().addAll(label1,label2,label3,label4,label5,label6);
                                onumler.clear();
                                vBox.getChildren().clear();
                                vBox.getChildren().addAll(new VBox(jemi) );
                                vBox.getChildren().add(0,all_vbox);

                            });

                        }
                    }
                    else {
                        onumler.clear();
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
        vBox.getChildren().add(1,onumler.size() == 0 ? scroll : null);

        this.getChildren().addAll(vBox);
        this.setPrefSize(SizeConfig.Width(0.8),SizeConfig.Height(0.8));
        this.setPrefSize(SizeConfig.Width(0.8),SizeConfig.Height(0.04));
    }
}
