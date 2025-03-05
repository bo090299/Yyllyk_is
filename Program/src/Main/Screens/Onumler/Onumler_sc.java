package Main.Screens.Onumler;

import Main.Models.Hasaplasyklar;
import Main.Models.Onumler;
import Main.Util.Connector;
import Main.Util.Label_class;
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
        Label_class label_class = new Label_class();
        Connector connector = new Connector();
        ScrollPane scroll = new ScrollPane();
        String buyruk = "SELECT * FROM `onumler`";
        Statement st = connector.getConnection().createStatement();
        ResultSet rt = st.executeQuery(buyruk);

        VBox dikine = new VBox();
        int t_b = 0;
        while (rt.next()){
                t_b +=1;
                Label tb = label_class.label(String.valueOf(t_b),0.08,0.04);

                Label id = label_class.label(String.valueOf(rt.getInt("id")),0.08,0.04);

                Label cat_id = label_class.label(String.valueOf(rt.getInt("category_id")), 0.08,0.04);

                Label name = label_class.label(rt.getString("name"),0.1,0.04);

                Label baha = label_class.label(String.valueOf(rt.getDouble("bahasy")),0.1,0.04);

                Label infoma = label_class.label(rt.getString("info"),0.2,0.04);

                HBox hBox = new HBox();
                hBox.getChildren().addAll(tb,id,cat_id,name,baha,infoma);

                dikine.getChildren().addAll(hBox);

        }

        dikine.setAlignment(Pos.CENTER);
        scroll.setContent(dikine);
        scroll.hbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);
        scroll.vbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);

        //yokarky bolegi
        HBox main_hbox = new HBox();

        Label number = label_class.label("№",0.08,0.04);


        Label id = label_class.label("Id",0.08,0.04);

        Label cat_id = label_class.label("Kategoriýa id",0.08,0.04);

        Label name = label_class.label("Ady",0.1,0.04);

        Label bahasy = label_class.label("Bahasy",0.1,0.04);
        Label info = label_class.label("Umumy maglumat",0.2,0.04);


        main_hbox.getChildren().addAll(number,id,cat_id,name,bahasy,info);
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
                    int teb = 0;
                    while (rs.next()){
                        onumler.clear();
                        onumler.addAll(new Onumler(rs.getInt("id"),rs.getInt("category_id"),rs.getString("name"),
                                rs.getDouble("bahasy"),rs.getString("info")));

                    }
                    if(!textField.getText().isEmpty()){
                        for (Onumler out : onumler){
                            teb+=1;
                            int finalTeb = teb;
                            Platform.runLater(()->{
                                int id = out.getId();
                                int cd = out.getCategory_id();
                                double baha = out.getBahasy();

                                HBox jemi = new HBox();
                                Label tb = label_class.label(String.valueOf(finalTeb),0.08,0.04);


                                Label id1 = label_class.label(String.valueOf(id),0.08,0.04);

                                Label cat_id = label_class.label(String.valueOf(cd),0.08,0.04);

                                Label name = label_class.label(out.getName(),0.1,0.04);

                                Label bahasy = label_class.label(String.valueOf(baha),0.1,0.04);


                                Label info = label_class.label(out.getInfo(),0.2,0.04);


                                jemi.getChildren().addAll(tb,id1,cat_id,name,bahasy,info);
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
    }
}
