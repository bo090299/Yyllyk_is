package Main.Screens.Admin_Screen;
import Main.Component.MainScreen.Main_Screen;
import Main.Util.Connector;
import Main.Util.Global;
import Main.Util.SizeConfig;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.sql.*;


public class Mamber_List extends StackPane {
    private  TextField idtext;
    private TextField nametext;
    private TextField surnametext;
    private TextField wezipesitext;
    private TextField doglantext;
    private TextField logintext;
    private TextField phonetext;
    private TextField passtext;
    private TextField salarytext;
    private TextField roletext;
    private TextField own_idtext;
    public Mamber_List() throws SQLException {
        Connector connector = new Connector();

        Label idup = new Label("Id");
        idup.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        idup.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        idup.getStyleClass().add("Registration_labels");

        idtext = new TextField();
        idtext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        idtext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        idtext.getStyleClass().add("Registration_Texts");

        VBox idbox = new VBox();
        idbox.getChildren().addAll(idup,idtext);
        idbox.setAlignment(Pos.CENTER);

        Label nameup = new Label("Ady");
        nameup.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        nameup.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        nameup.getStyleClass().add("Registration_labels");

        nametext = new TextField();
        nametext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        nametext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        nametext.getStyleClass().add("Registration_Texts");

        VBox namebox = new VBox();
        namebox.getChildren().addAll(nameup,nametext);
        namebox.setAlignment(Pos.CENTER);

        Label surnameup = new Label("Familiýasy");
        surnameup.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        surnameup.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        surnameup.getStyleClass().add("Registration_labels");

        surnametext = new TextField();
        surnametext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        surnametext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        surnametext.getStyleClass().add("Registration_Texts");

        VBox surnamebox = new VBox();
        surnamebox.getChildren().addAll(surnameup,surnametext);
        surnamebox.setAlignment(Pos.CENTER);

        Label wezipeup = new Label("Wezipesi");
        wezipeup.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        wezipeup.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        wezipeup.getStyleClass().add("Registration_labels");

        wezipesitext = new TextField();
        wezipesitext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        wezipesitext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        wezipesitext.getStyleClass().add("Registration_Texts");

        VBox wezipebox = new VBox();
        wezipebox.getChildren().addAll(wezipeup,wezipesitext);
        wezipebox.setAlignment(Pos.CENTER);

        Label doglangun = new Label("Doglan güni");
        doglangun.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        doglangun.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        doglangun.getStyleClass().add("Registration_labels");

        doglantext = new TextField();
        doglantext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        doglantext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        doglantext.getStyleClass().add("Registration_Texts");

        VBox dogbox = new VBox();
        dogbox.getChildren().addAll(doglangun,doglantext);
        dogbox.setAlignment(Pos.CENTER);


        Label login = new Label("Login");
        login.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        login.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        login.getStyleClass().add("Registration_labels");

        logintext = new TextField();
        logintext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        logintext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        logintext.getStyleClass().add("Registration_Texts");

        VBox loginbox = new VBox();
        loginbox.getChildren().addAll(login,logintext);
        loginbox.setAlignment(Pos.CENTER);

        Label password = new Label("Parol");
        password.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        password.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        password.getStyleClass().add("Registration_labels");

        passtext = new TextField();
        passtext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        passtext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        passtext.getStyleClass().add("Registration_Texts");

        VBox pasbox = new VBox();
        pasbox.getChildren().addAll(password,passtext);
        pasbox.setAlignment(Pos.CENTER);


        Label phoneup = new Label("Telefon nomeri");
        phoneup.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        phoneup.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        phoneup.getStyleClass().add("Registration_labels");

        phonetext = new TextField();
        phonetext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        phonetext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        phonetext.getStyleClass().add("Registration_Texts");

        VBox phonebox = new VBox();
        phonebox.getChildren().addAll(phoneup,phonetext);
        phonebox.setAlignment(Pos.CENTER);

        Label salary = new Label("Aýlygy");
        salary.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        salary.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        salary.getStyleClass().add("Registration_labels");

        salarytext = new TextField();
        salarytext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        salarytext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        salarytext.getStyleClass().add("Registration_Texts");


        VBox saalarybox = new VBox();
        saalarybox.getChildren().addAll(salary,salarytext);
        saalarybox.setAlignment(Pos.CENTER);

        Label role = new Label("Rugsadyň derejesi");
        role.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        role.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        role.getStyleClass().add("Registration_labels");

        roletext = new TextField();
        roletext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        roletext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        roletext.getStyleClass().add("Registration_Texts");


        VBox rolebox = new VBox();
        rolebox.getChildren().addAll(role,roletext);
        rolebox.setAlignment(Pos.CENTER);

        Label own_id = new Label("Şahsy idisi");
        own_id.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        own_id.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        own_id.getStyleClass().add("Registration_labels");

        own_idtext = new TextField();
        own_idtext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        own_idtext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
        own_idtext.getStyleClass().add("Registration_Texts");

        VBox own_id_box = new VBox();
        own_id_box.getChildren().addAll(own_id,own_idtext);
        own_id_box.setAlignment(Pos.CENTER);


        Button update = new Button("Üýtgetmek");
        update.setMaxSize(SizeConfig.Width(0.05), SizeConfig.Height(0.03));
        update.setMinSize(SizeConfig.Width(0.05), SizeConfig.Height(0.03));
        update.getStyleClass().add("Regbtn");

        update.setOnAction((e) -> {
            try {
                String buyruk1 = "UPDATE `isgarler` SET `name`='" + nametext.getText() + "',`surname`='" + surnametext.getText() + "'," +
                        "`wezipe`='" + wezipesitext.getText() + "',`number`='" + phonetext.getText() + "' WHERE id= " + idtext.getText();
                Statement st1 = connector.getConnection().createStatement();
                st1.executeUpdate(buyruk1);

                // После выполнения запроса, обновляем таблицу
                updateTableData();

            } catch (SQLException e1) {
                showErrorDialog("Ошибка при обновлении данных: " + e1.getMessage());
            }
            clearFields();
        });

        Button delete = new Button("Öçürmek");
        delete.setMaxSize(SizeConfig.Width(0.05), SizeConfig.Height(0.03));
        delete.setMinSize(SizeConfig.Width(0.05), SizeConfig.Height(0.03));
        delete.getStyleClass().add("Regbtn");

        delete.setOnAction((e) -> {
            try {
                String buyruk2 = "DELETE FROM `isgarler` WHERE id = '" + idtext.getText() + "' ";
                Statement st2 = connector.getConnection().createStatement();
                st2.executeUpdate(buyruk2);

                String buyruk3 = "DELETE FROM `user` WHERE id = '" + idtext.getText() + "'";
                Statement st3 = connector.getConnection().createStatement();
                st3.executeUpdate(buyruk3);

                String deletewez = "DELETE FROM `wezipeler` WHERE id = '" + idtext.getText() + "'";
                Statement st4 = connector.getConnection().createStatement();
                st4.executeUpdate(deletewez);

                // После удаления данных, обновляем таблицу
                updateTableData();

            } catch (SQLException e1) {
                showErrorDialog("Ошибка при удалении данных: " + e1.getMessage());
            }
            clearFields();
        });

        // Кнопка "Назад"
        Button back = new Button("Back");
        back.setMaxSize(SizeConfig.Width(0.05), SizeConfig.Height(0.03));
        back.setMinSize(SizeConfig.Width(0.05), SizeConfig.Height(0.03));
        back.getStyleClass().add("Regbtn");

        back.setOnAction((e) -> {
            Global.pane.getChildren().clear();
            Global.pane.getChildren().add(new Main_Screen());
        });

        // Создание кнопок в HBox
        HBox btns = new HBox();
        btns.setSpacing(20);
        btns.getChildren().addAll(update, delete, back);

        VBox updatebox = new VBox();
        updatebox.setSpacing(10);
        updatebox.setAlignment(Pos.TOP_CENTER);
        updatebox.getChildren().addAll(idbox, namebox, surnamebox, wezipesitext, phonebox, salarytext, rolebox, own_id_box, btns);

        // Основной HBox для размещения элементов
        HBox mainbox = new HBox();
        mainbox.setStyle("-fx-background-color: #007B7F; -fx-border-width:2pt; -fx-border-color:green; -fx-border-radius:50px;");
        mainbox.getChildren().addAll(updatebox, new Tablisa());
        mainbox.setSpacing(100);
        mainbox.setMargin(updatebox, new Insets(0, 0, 0, 5));

        this.getChildren().add(mainbox);
        this.getStylesheets().add("/Resource/Style/Style.css");
        this.setPrefSize(SizeConfig.Width(1), SizeConfig.Height(0.8));
    }

    // Метод для очистки полей ввода
    private void clearFields() {
        idtext.clear();
        nametext.clear();
        surnametext.clear();
        wezipesitext.clear();
        phonetext.clear();
        logintext.clear();
        passtext.clear();
        salarytext.clear();
        own_idtext.clear();
        roletext.clear();
        doglantext.clear();
    }

    // Метод для обновления данных в таблице
    private void updateTableData() {
        try {
            Global.main_hbox.getChildren().clear();
            Global.main_hbox.getChildren().setAll(new Mamber_List());
        } catch (SQLException e1) {
            showErrorDialog("Ошибка при обновлении таблицы: " + e1.getMessage());
        }
    }

    // Метод для отображения ошибок в диалогах
    private void showErrorDialog(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Ошибка");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
