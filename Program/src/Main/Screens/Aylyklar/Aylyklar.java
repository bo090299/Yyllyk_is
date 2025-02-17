package Main.Screens.Aylyklar;

import Main.Util.SizeConfig;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.sql.*;

public class Aylyklar extends HBox {
    public Aylyklar() throws SQLException {
        Label id = new Label("Idisi");
        id.setPrefSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        id.getStyleClass().add("Registration_labels");
        TextField idtext = new TextField();
        idtext.setPromptText("Id");
        idtext.setMaxSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        idtext.setMinSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        idtext.getStyleClass().add("Registration_Texts");

        VBox idbox = new VBox();
        idbox.getChildren().addAll(id, idtext);
        idbox.setSpacing(10);
        idbox.setAlignment(Pos.CENTER);

        Label ady = new Label("Ady");
        ady.setPrefSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        ady.getStyleClass().add("Registration_labels");
        TextField adytext = new TextField();
        adytext.setPromptText("Ady");
        adytext.setMaxSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        adytext.setMinSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        adytext.getStyleClass().add("Registration_Texts");

        VBox adybox = new VBox();
        adybox.getChildren().addAll(ady, adytext);
        adybox.setSpacing(10);
        adybox.setAlignment(Pos.CENTER);

        Label familiyasy = new Label("Familiýasy");
        familiyasy.setPrefSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        familiyasy.getStyleClass().add("Registration_labels");
        TextField familiyasytext = new TextField();
        familiyasytext.setPromptText("Familiýasy");
        familiyasytext.setMaxSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        familiyasytext.setMinSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        familiyasytext.getStyleClass().add("Registration_Texts");

        VBox falmiliyabox = new VBox();
        falmiliyabox.getChildren().addAll(familiyasy, familiyasytext);
        falmiliyabox.setSpacing(10);
        falmiliyabox.setAlignment(Pos.CENTER);

        Label wezipe = new Label("Wezipesi");
        wezipe.setPrefSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        wezipe.getStyleClass().add("Registration_labels");
        TextField wezipetext = new TextField();
        wezipetext.setPromptText("Wezipesi");
        wezipetext.setMaxSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        wezipetext.setMinSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        wezipetext.getStyleClass().add("Registration_Texts");

        VBox wezipebox = new VBox();
        wezipebox.getChildren().addAll(wezipe, wezipetext);
        wezipebox.setSpacing(10);
        wezipebox.setAlignment(Pos.CENTER);

        Label aylyklar = new Label("Aýlygy");
        aylyklar.setPrefSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        aylyklar.getStyleClass().add("Registration_labels");
        TextField aylyktext = new TextField();
        aylyktext.setPromptText("Aýlygy");
        aylyktext.setMaxSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        aylyktext.setMinSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        aylyktext.getStyleClass().add("Registration_Texts");

        VBox aylykbox = new VBox();
        aylykbox.getChildren().addAll(aylyklar, aylyktext);
        aylykbox.setSpacing(10);
        aylykbox.setAlignment(Pos.CENTER);

        Button update = new Button("Update");
        update.setMaxSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        update.setMinSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        update.getStyleClass().add("Regbtn");

        TextField findtext = new TextField();
        findtext.setPromptText("Gözleg...");
        findtext.setPrefSize(SizeConfig.Width(0.3), SizeConfig.Height(0.04));

        Button find = new Button("Find");
        find.setMaxSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        find.setMinSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));

        HBox findbox = new HBox();
        findbox.getChildren().addAll(findtext, find);

        Button delete = new Button("Delete");
        delete.setMaxSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        delete.setMinSize(SizeConfig.Width(0.2), SizeConfig.Height(0.04));
        delete.getStyleClass().add("Regbtn");

        VBox leftbox = new VBox();
        leftbox.getChildren().addAll(idbox, adybox, falmiliyabox, wezipebox, aylykbox, update, delete);
        leftbox.setAlignment(Pos.CENTER);
        leftbox.setSpacing(10);

        int i = 0;
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountant", "root", "");
        String buyruk = "SELECT * FROM members";
        Statement st;
        ResultSet rs;
        st = conn.createStatement();
        rs = st.executeQuery(buyruk);
        String buyruk3 = "SELECT * FROM `wezipeler`;";
        Statement st2;
        ResultSet rs1;
        st2 = conn.createStatement();
        rs1 = st2.executeQuery(buyruk3);
        Label label1 = new Label("Wezipe idisi");
        label1.setPrefSize(SizeConfig.Width(0.06), SizeConfig.Height(0.03));

        Label label6 = new Label("Idisi");
        label6.setPrefSize(SizeConfig.Width(0.03), SizeConfig.Height(0.03));

        Label label2 = new Label("Ady");
        label2.setPrefSize(SizeConfig.Width(0.09), SizeConfig.Height(0.03));
        Label label3 = new Label("Familiýasy");
        label3.setPrefSize(SizeConfig.Width(0.2), SizeConfig.Height(0.03));
        Label label4 = new Label("Wezipesi");
        label4.setPrefSize(SizeConfig.Width(0.06), SizeConfig.Height(0.03));
        Label label5 = new Label("Aýlyk haky");
        label5.setPrefSize(SizeConfig.Width(0.06), SizeConfig.Height(0.03));
        HBox names = new HBox();
        names.getChildren().addAll(label6,label1, label2, label3, label4, label5);

        VBox list = new VBox();
        list.getChildren().addAll(names);
        while (rs.next() && rs1.next()) {
            i++;
            Label idisi = new Label(String.valueOf(i));
            idisi.setPrefSize(SizeConfig.Width(0.03), SizeConfig.Height(0.03));
            idisi.getStyleClass().add("label_for_list");

            Label id1 = new Label(rs1.getString("id"));
            id1.setPrefSize(SizeConfig.Width(0.06), SizeConfig.Height(0.03));
            id1.getStyleClass().add("label_for_list");

            Label ady1 = new Label(rs1.getString("ady"));
            ady1.setPrefSize(SizeConfig.Width(0.09), SizeConfig.Height(0.03));
            ady1.getStyleClass().add("label_for_list");

            Label familiyasy1 = new Label(rs1.getString("familiyasy"));
            familiyasy1.setPrefSize(SizeConfig.Width(0.2), SizeConfig.Height(0.03));
            familiyasy1.getStyleClass().add("label_for_list");

            Label wezipesi = new Label(rs1.getString("title"));
            wezipesi.setPrefSize(SizeConfig.Width(0.06), SizeConfig.Height(0.03));
            wezipesi.getStyleClass().add("label_for_list");

            Label aylykhaky = new Label(rs1.getString("aylyk_haky")+" TMT");
            aylykhaky.setPrefSize(SizeConfig.Width(0.06), SizeConfig.Height(0.03));
            aylykhaky.getStyleClass().add("label_for_list");

            String buyruk2 = "UPDATE `members` SET `id`='" + i + "'WHERE id ='" + rs.getInt("id") + "'";
            Statement st1;
            st1 = conn.createStatement();
            st1.executeUpdate(buyruk2);

            HBox main_list = new HBox();
            main_list.getChildren().addAll(idisi,id1, ady1, familiyasy1, wezipesi, aylykhaky);

            list.getChildren().addAll(main_list);

        }

        HBox thisbox = new HBox();
        thisbox.getChildren().addAll(leftbox,list);
        thisbox.setSpacing(60);
        this.getChildren().addAll(thisbox);
        this.setPrefSize(SizeConfig.Width(0.8),SizeConfig.Height(0.76));
    }

}
