package Main.Screens.Aylyklar;

import Main.Util.Global;
import Main.Util.SizeConfig;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.sql.*;

public class Aylar_boyunca extends StackPane {
    String month;
    public Aylar_boyunca(Object month) throws SQLException {

        this.month = (String) month;
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountant", "root", "");
        String buyruk = "SELECT * FROM `aylar`";
        Statement st = conn.createStatement();
        System.out.println(month);
        ResultSet rs = st.executeQuery(buyruk);
        Label idisi = new Label("Idisi");
        idisi.setPrefSize(SizeConfig.Width(0.03), SizeConfig.Height(0.04));
        idisi.getStyleClass().add("label_for_list");
        Label bas_ady = new Label("Ady");
        bas_ady.setPrefSize(SizeConfig.Width(0.1), SizeConfig.Height(0.04));
        bas_ady.getStyleClass().add("label_for_list");
        Label bas_familiya = new Label("Familiýasy");
        bas_familiya.setPrefSize(SizeConfig.Width(0.1), SizeConfig.Height(0.04));
        bas_familiya.getStyleClass().add("label_for_list");
        Label bas_wezipesi = new Label("Wezipesi");
        bas_wezipesi.setPrefSize(SizeConfig.Width(0.08), SizeConfig.Height(0.04));
        bas_wezipesi.getStyleClass().add("label_for_list");
        Label bas_gelmedik_guni = new Label("Gelmedik günleri");
        bas_gelmedik_guni.setPrefSize(SizeConfig.Width(0.06), SizeConfig.Height(0.04));
        bas_gelmedik_guni.getStyleClass().add("label_for_list");
        Label bas_ayy = new Label("Aýy");
        bas_ayy.setPrefSize(SizeConfig.Width(0.08), SizeConfig.Height(0.04));
        bas_ayy.getStyleClass().add("label_for_list");
        Label bas_girdejisi = new Label("Aýlygy" + "  TMT");
        bas_girdejisi.setPrefSize(SizeConfig.Width(0.1), SizeConfig.Height(0.04));
        bas_girdejisi.getStyleClass().add("label_for_list");

        HBox basbox = new HBox();
        basbox.getChildren().addAll(idisi, bas_ady, bas_familiya, bas_wezipesi, bas_gelmedik_guni, bas_ayy, bas_girdejisi);
        VBox mainbox = new VBox();
        mainbox.getChildren().addAll(basbox);

        HBox boluji = new HBox();

        VBox piebox = new VBox();

        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Işgärler");
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Aýlyk haky");
        BarChart barChart = new BarChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName((String) month);

        PieChart pieChart = new PieChart();
        pieChart.setPrefSize(SizeConfig.Width(0.2), SizeConfig.Height(0.4));
        int i = 0 ;
        while (rs.next()) {
            i++;
            if (month.equals(rs.getString("aylar"))) {
                String update = "UPDATE `aylar` SET `id`="+i+" WHERE id = "+rs.getInt("id")+";";
                Statement stat = conn.createStatement();
                stat.executeUpdate(update);
                Label id = new Label(rs.getString("id"));
                id.setPrefSize(SizeConfig.Width(0.03), SizeConfig.Height(0.04));
                id.getStyleClass().add("label_for_list");
                Label ady = new Label(rs.getString("ady"));
                ady.setPrefSize(SizeConfig.Width(0.1), SizeConfig.Height(0.04));
                ady.getStyleClass().add("label_for_list");
                Label familiya = new Label(rs.getString("familiyasy"));
                familiya.setPrefSize(SizeConfig.Width(0.1), SizeConfig.Height(0.04));
                familiya.getStyleClass().add("label_for_list");
                Label wezipesi = new Label(rs.getString("wezipesi"));
                wezipesi.setPrefSize(SizeConfig.Width(0.08), SizeConfig.Height(0.04));
                wezipesi.getStyleClass().add("label_for_list");
                Label gelmedik_guni = new Label(rs.getString("gelmedik_gunler"));
                gelmedik_guni.setPrefSize(SizeConfig.Width(0.06), SizeConfig.Height(0.04));
                gelmedik_guni.getStyleClass().add("label_for_list");
                Label aylar = new Label(rs.getString("aylar"));
                aylar.setPrefSize(SizeConfig.Width(0.08), SizeConfig.Height(0.04));
                aylar.getStyleClass().add("label_for_list");
                Label aylygy = new Label(rs.getString("ay_ucin_aylyk") + "TMT");
                aylygy.setPrefSize(SizeConfig.Width(0.1), SizeConfig.Height(0.04));
                aylygy.getStyleClass().add("label_for_list");

                HBox list = new HBox();
                list.getChildren().addAll(id, ady, familiya, wezipesi, gelmedik_guni, aylar, aylygy);


                dataSeries1.getData().add(new XYChart.Data(rs.getString("ady"), rs.getDouble("ay_ucin_aylyk")));

                PieChart.Data slice1 = new PieChart.Data(rs.getString("ady"), rs.getInt("ay_ucin_aylyk"));
                pieChart.getData().addAll(slice1);


                mainbox.getChildren().addAll(list);
            }

        }
        Label satylany = new Label("Aý boýunça aýlygy");
        VBox sany = new VBox();
        sany.getChildren().addAll(satylany, pieChart);

        Label girdeyji_graf = new Label("Aýlygyň grafigi");
        piebox.getChildren().addAll(girdeyji_graf, barChart);

        barChart.getData().add(dataSeries1);
        barChart.setPrefSize(SizeConfig.Width(0.6), SizeConfig.Height(0.3));
        mainbox.getChildren().add(barChart);
        mainbox.setPrefSize(SizeConfig.Width(0.6), SizeConfig.Height(0.8));
        sany.setPrefSize(SizeConfig.Width(0.2), SizeConfig.Height(0.5));


        boluji.getChildren().addAll(mainbox, sany);


        VBox thisbox = new VBox();
        thisbox.getChildren().addAll(boluji);
        Global.onumpane.getChildren().add(this);
        this.getChildren().addAll(thisbox);
        this.setPrefSize(SizeConfig.Width(0.8), SizeConfig.Height(0.76));

    }
}
