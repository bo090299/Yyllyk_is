package Main.Component.LoginScreen;

import Main.Component.MainScreen.Main_Screen;
import Main.Screens.User_Screen.User_main_class;
import Main.Util.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class PasswordScreen {
    public PasswordScreen() throws SQLException {
        Stage loginscreen = new Stage();
        Connector connector = new Connector();
        loginscreen.setMaximized(true);
        String buyruk4 = "SELECT * FROM `isgarler`";
        Statement st2 = connector.getConnection().createStatement();
        ResultSet set = st2.executeQuery(buyruk4);
        int i = 0;
        while (set.next()) {
            i++;
            String buyruk2 = "UPDATE `isgarler` SET `id`='" + i + "' WHERE id=" + set.getInt("id") + ";";
            Statement st3 = connector.getConnection().createStatement();
            st3.executeUpdate(buyruk2);
        }

        Label log = new Label("Login");
        log.setPrefSize(SizeConfig.Width(0.2), SizeConfig.Height(0.02));
        log.getStyleClass().add("Password");

        TextField login = new TextField();
        login.setPromptText("Login");
        login.setMaxSize(SizeConfig.Width(0.2), SizeConfig.Height(0.03));
        login.setMinSize(SizeConfig.Width(0.2), SizeConfig.Height(0.03));
        login.getStyleClass().add("In_password");


        Label pass = new Label("Password");
        pass.setPrefSize(SizeConfig.Width(0.2), SizeConfig.Height(0.02));
        pass.getStyleClass().add("Password");

        PasswordField password = new PasswordField();
        password.setPromptText("Password");
        password.setMaxSize(SizeConfig.Width(0.2), SizeConfig.Height(0.03));
        password.setMinSize(SizeConfig.Width(0.2), SizeConfig.Height(0.03));
        password.getStyleClass().add("In_password");
        String hasi = Has_class.hashString(password.getText());

        Label role = new Label("Dereje");
        role.setPrefSize(SizeConfig.Width(0.2), SizeConfig.Height(0.02));
        role.getStyleClass().add("Password");

        ComboBox<String> type = new ComboBox<>();
        type.setPromptText("Ulanyjy derejesi");
        type.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        type.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        type.getStyleClass().add("In_password");

        type.getItems().add("Administrator");
        type.getItems().add("Hasapçy");

        type.setPrefSize(SizeConfig.Width(0.05),SizeConfig.Height(0.02));




        Button ok = new Button("Ok");
        ok.setPrefSize(SizeConfig.Width(0.06), SizeConfig.Height(0.02));
        ok.getStyleClass().add("Password");
        ok.setOnAction((e) -> {
            try {
                Statement st;
                ResultSet rs;
                st = connector.getConnection().createStatement();
                String buyruk = "SELECT * FROM `user` WHERE `login` = '"+login.getText()+"' AND `password` = '"+hasi+"' AND `role` = '"+type.getSelectionModel().getSelectedItem()+"' ";
                rs = st.executeQuery(buyruk);

                if (rs.next()){
                    String logy = rs.getString("login");
                    String passwordy = rs.getString("password");
                    String dereje = rs.getString("role");
                    if (logy.equals(login.getText())&& passwordy.equals(hasi)&&dereje.equals("Administrator")){
                        Global.pane.getChildren().clear();
                        Global.pane.getChildren().addAll(new Main_Screen());
                    }
                    else if (logy.equals(login.getText())&& passwordy.equals(hasi)&&dereje.equals("Ulanyjy")){
                        Global.pane.getChildren().clear();
                        Global.pane.getChildren().addAll(new User_main_class());
                    }
                    else if (logy.equals(login.getText())&& passwordy.equals(hasi)&&dereje.equals("Hasapçy")){
                        Global.pane.getChildren().clear();
                        Global.pane.getChildren().addAll(new User_main_class());
                    }

                }
                else if (login.getText().isEmpty()||password.getText().isEmpty()||type.getValue() == null){
                        Alert alert= new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Ýalňyşlyk!");
                        alert.setContentText("Logiňizde, parolyňyzda ýa - da rolyňyzda bosluk bar olary dolduryň!");
                        alert.show();
                        login.clear();
                        password.clear();
                        type.setValue(null);
                    }
                else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Ýalňyşlyk!");
                        alert.setContentText("Bagyşlaň siziň parolyňyz ýa-da loginiňiz ýa-da rolyňyz ýalňyş dogry giriziň!");
                        alert.show();
                        login.clear();
                        password.clear();
                        type.setValue(null);
                    }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        });

        ImageView imageView = new ImageView(new Image("Resource/Assets/bacgraun_photo.jpg"));
        imageView.setFitHeight(SizeConfig.Height(1));
        imageView.setFitWidth(SizeConfig.Width(1));
        StackPane pane1 = new StackPane();

        VBox mainbox = new VBox();
        mainbox.setAlignment(Pos.CENTER);
        mainbox.setSpacing(15);
        pane1.getChildren().addAll(imageView,mainbox);
        mainbox.getChildren().addAll(log, login, pass, password, role,type, ok);
        mainbox.setMargin(log , new Insets(0,0,0,300));
        mainbox.setMargin(pass , new Insets(0,0,0,300));
        mainbox.setMargin(role , new Insets(0,0,0,300));
        Global.box2 = mainbox;
        mainbox.getStylesheets().addAll(CssConfig.Css());

        Global.pane1=pane1;
        StackPane pane = new StackPane();
        pane.getChildren().add(pane1);
        Global.pane = pane;
        pane.getStylesheets().add(CssConfig.Css());
        Scene scene = new Scene(pane, SizeConfig.Width(0.9), SizeConfig.Height(0.10));
        loginscreen.setScene(scene);
        loginscreen.show();
    }
}
