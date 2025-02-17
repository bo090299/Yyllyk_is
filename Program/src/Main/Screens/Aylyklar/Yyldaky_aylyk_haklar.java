package Main.Screens.Aylyklar;

import Main.Util.SizeConfig;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.sql.*;

public class Yyldaky_aylyk_haklar extends StackPane {
    public Yyldaky_aylyk_haklar() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountant","root","");
        String buyruk = "SELECT * FROM aylar";
        Statement st;
        ResultSet rs;
        st = conn.createStatement();
        rs = st.executeQuery(buyruk);


        int i = 0;


        VBox mainbox = new VBox();
        Label id1 = new Label("Idisi");
        id1.setPrefSize(SizeConfig.Width(0.04),SizeConfig.Height(0.04));
        id1.getStyleClass().add("label_worker");

        Label b_ady = new Label("Ady");
        b_ady.setPrefSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
        b_ady.getStyleClass().add("label_worker");

        Label b_familya = new Label("Familiýasy");
        b_familya.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        b_familya.getStyleClass().add("label_worker");

        Label b_wezipe = new Label("Wezipesi");
        b_wezipe.setPrefSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
        b_wezipe.getStyleClass().add("label_worker");

        Label b_umuyaylygy = new Label("Aýlyk haky");
        b_umuyaylygy.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
        b_umuyaylygy.getStyleClass().add("label_worker");

        Label aylary = new Label("Aýlary");
        aylary.setPrefSize(SizeConfig.Width(0.08),SizeConfig.Height(0.04));
        aylary.getStyleClass().add("label_worker");

        Label aylar_ucin = new Label("Aýdaky aýlagy");
        aylar_ucin.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
        aylar_ucin.getStyleClass().add("label_worker");

        Label Yyl = new Label("Ýyl girdejisi");
        Yyl.setPrefSize(SizeConfig.Width(0.1),SizeConfig.Height(0.04));
        Yyl.getStyleClass().add("label_worker");

        HBox atlarylabel = new HBox();
        atlarylabel.getChildren().addAll(id1,b_ady,b_familya,b_wezipe,b_umuyaylygy,aylary,aylar_ucin,Yyl);
        mainbox.getChildren().add(atlarylabel);

        while (rs.next()){



        }



        while (rs.next()){
            i++;
            String buýruk = "UPDATE `aylar` SET `id`='" + i + "' WHERE id = '" +rs.getInt("id")+ "'";
            Statement st2;
            st2 = conn.createStatement();
            st2.executeUpdate(buýruk);

            Label id = new Label(rs.getString("id"));
            id.setPrefSize(SizeConfig.Width(0.03),SizeConfig.Height(0.04));
            id.getStyleClass().add("label_for_list");

            Label ady = new Label(rs.getString("ady"));
            ady.setPrefSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
            ady.getStyleClass().add("label_for_list");

            Label baha = new Label(rs.getString("bahasy")+" TMT");
            baha.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
            baha.getStyleClass().add("label_for_list");

            Label cykarylan_wagt = new Label(rs.getString("cykarylansenesi"));
            cykarylan_wagt.setPrefSize(SizeConfig.Width(0.09),SizeConfig.Height(0.04));
            cykarylan_wagt.getStyleClass().add("label_for_list");

            Label mohlet = new Label(rs.getString("mohleti"));
            mohlet.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.04));
            mohlet.getStyleClass().add("label_for_list");

            Label umumymukdar = new Label(rs.getString("umumymukdary"));
            umumymukdar.setPrefSize(SizeConfig.Width(0.09),SizeConfig.Height(0.04));
            umumymukdar.getStyleClass().add("label_for_list");

            Label satylanmukdary = new Label(rs.getString("satylanmukdary"));
            satylanmukdary.setPrefSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
            satylanmukdary.getStyleClass().add("label_for_list");

            Label girdejisi = new Label(rs.getString("girdeyji")+"TMT");
            girdejisi.setPrefSize(SizeConfig.Width(0.06),SizeConfig.Height(0.04));
            girdejisi.getStyleClass().add("label_for_list");

            HBox list_label = new HBox();
            list_label.getChildren().addAll(id,ady,baha,cykarylan_wagt,mohlet,umumymukdar,satylanmukdary,girdejisi);

            mainbox.getChildren().addAll(list_label);
        }
    }
}
