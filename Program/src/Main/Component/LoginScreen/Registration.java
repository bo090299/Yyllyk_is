package Main.Component.LoginScreen;

import Main.Component.MainScreen.Main_Screen;
import Main.Screens.Admin_Screen.Left_list;
import Main.Util.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

import java.sql.*;

public class Registration extends StackPane {
    private String hasi;
    public Registration() {

    Connector connector = new Connector();

    Label username = new Label("Ady");
    username.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    username.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    username.getStyleClass().add("Registration_labels");
    TextField name = new TextField();
    name.setPromptText("Ady");
    name.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    name.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    name.getStyleClass().add("Registration_Texts");
    VBox namebox = new VBox(2);
    namebox.getChildren().addAll(username,name);
    namebox.setAlignment(Pos.CENTER);

    Label usersurname = new Label("Familiýasy");
    usersurname.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    usersurname.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    usersurname.getStyleClass().add("Registration_labels");
    TextField surname = new TextField();
    surname.setPromptText("Familiýasy");
    surname.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    surname.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    surname.getStyleClass().add("Registration_Texts");
    VBox surnamebox = new VBox(2);
    surnamebox.getChildren().addAll(usersurname,surname);
    surnamebox.setAlignment(Pos.CENTER);

    Label wezipe = new Label("Wezipesi");
    wezipe.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    wezipe.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    wezipe.getStyleClass().add("Registration_labels");
    TextField wezipesi = new TextField();
    wezipesi.setPromptText("Wezipesi");
    wezipesi.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    wezipesi.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    wezipesi.getStyleClass().add("Registration_Texts");
    VBox wezipebox = new VBox();
    wezipebox.getChildren().addAll(wezipe,wezipesi);
    wezipebox.setAlignment(Pos.CENTER);

    VBox brithday_box = new VBox(5);
    Label brithdayleb = new Label("Doglan güni");
    brithdayleb.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    brithdayleb.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    brithdayleb.getStyleClass().add("Registration_labels");
    DatePicker brithday = new DatePicker();
    brithday.setPromptText("Doglan güni");
    brithday.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    brithday.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    brithday.setPromptText("Doglan güni");
    brithday.getStyleClass().add("Registration_Texts");
    brithday_box.getChildren().addAll(brithdayleb,brithday);
    brithday_box.setAlignment(Pos.CENTER);

    Label login = new Label("Logini");
    login.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    login.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    login.getStyleClass().add("Registration_labels");
    TextField logini = new TextField();
    logini.setPromptText("Login");
    logini.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    logini.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    logini.getStyleClass().add("Registration_Texts");
    VBox loginbox = new VBox(2);
    loginbox.getChildren().addAll(login,logini);
    loginbox.setAlignment(Pos.CENTER);


    Label pass = new Label("Paroly");
    pass.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    pass.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    pass.getStyleClass().add("Registration_labels");
    PasswordField password = new PasswordField();
    password.setPromptText("Paroly");
    password.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    password.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));

    password.getStyleClass().add("Registration_Texts");
    VBox passbox = new VBox(2);
    passbox.getChildren().addAll(pass,password);
    passbox.setAlignment(Pos.CENTER);

    Label phone = new Label("Telefon belgisi");
    phone.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    phone.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    phone.getStyleClass().add("Registration_labels");
    TextField phone_number = new TextField();
    phone_number.setPromptText("Telefon belgisi");
    phone_number.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    phone_number.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    phone_number.getStyleClass().add("Registration_Texts");
    VBox numberbox = new VBox(2);
    numberbox.getChildren().addAll(phone,phone_number);
    numberbox.setAlignment(Pos.CENTER);

    Label aylyk = new Label("Aýlyk haky");
    aylyk.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    aylyk.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    aylyk.getStyleClass().add("Registration_labels");
    TextField aylyktext = new TextField();
    aylyktext.setPromptText("Aýlyk haky");
    aylyktext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    aylyktext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    aylyktext.getStyleClass().add("Registration_Texts");
    VBox aylykbox = new VBox(2);
    aylykbox.getChildren().addAll(aylyk,aylyktext);
    aylykbox.setAlignment(Pos.CENTER);


    Label type = new Label("Roly");
    type.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    type.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    type.getStyleClass().add("Registration_labels");
    ComboBox roletext = new ComboBox();
    roletext.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    roletext.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    roletext.getStyleClass().add("Registration_Texts");
    roletext.getItems().add("Administrator");
    roletext.getItems().add("Hasapçy");
    roletext.getItems().add("Ulanyjy");
    VBox typebox = new VBox(2);
    typebox.getChildren().addAll(type,roletext);
    typebox.setAlignment(Pos.CENTER);


    Label own_id = new Label("Şahsy idisi");
    own_id.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    own_id.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    own_id.getStyleClass().add("Registration_labels");
    TextField own_id_text = new TextField();
    own_id_text.setPromptText("Şahsy idisi");
    own_id_text.setMaxSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    own_id_text.setMinSize(SizeConfig.Width(0.2),SizeConfig.Height(0.03));
    own_id_text.getStyleClass().add("Registration_Texts");
    VBox ownbox = new VBox(2);
    ownbox.getChildren().addAll(own_id,own_id_text);
    ownbox.setAlignment(Pos.CENTER);

        Button regbtn = new Button("Ulgama goşmak");
        regbtn.setMaxSize(SizeConfig.Width(0.1),SizeConfig.Height(0.03));
        regbtn.setMinSize(SizeConfig.Width(0.1),SizeConfig.Height(0.03));
        regbtn.getStyleClass().addAll("Regbtn");
        regbtn.setOnAction((e)->{
            hasi = Has_class.hashString(password.getText());
            int i = 0 ;
            if (Number_Allert.DoubleAllert(aylyktext.getText())== false ){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ýalňyşlyk");
                alert.setContentText("Siziň aýlyk haky maglumatlaryňyz san bolmaly!");
                alert.show();
            }
            else {

                try {

                    String buyruk = "INSERT INTO `isgarler`(`name`, `surname`, `wezipe`, `brithday`, `login` ,`password` ,`number`, `umumyAylyk`, `role` ,`own_id`)" +
                            " VALUES ('"+name.getText()+"','"+surname.getText()+"','"+wezipesi.getText()+"','"+brithday.getValue()+"','"+login.getText()+"','"+hasi+"'," +
                            "'"+phone_number.getText()+"','"+aylyktext.getText()+"','"+roletext.getSelectionModel().getSelectedItem()+"','"+own_id.getText()+"')";
                    Statement st;
                    st = connector.getConnection().createStatement();
                    st.executeUpdate(buyruk);

                    String buyruk1 = "INSERT INTO `user`(`name`, `surname`, `login`, `password`, `role`) VALUES ('"+name.getText()+"','"+surname.getText()+"','"+logini.getText()+"','"+hasi+"','"+roletext.getSelectionModel().getSelectedItem()+"');";
                    Statement stw ;
                    stw = connector.getConnection().createStatement();
                    stw.executeUpdate(buyruk1);
//
                    String buyruk2 = "SELECT * FROM `isgarler`";
                    Statement rt = connector.getConnection().createStatement();
                    ResultSet rs = rt.executeQuery(buyruk2);
                    while (rs.next()){
                        i++;
                        String udate = "UPDATE `isgarler` SET `id`='"+i+"'WHERE id = '"+rs.getInt("id")+"';";
                        Statement st1;
                        st1 = connector.getConnection().createStatement();
                        st1.executeUpdate(udate);
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            }

            name.clear();
            surname.clear();
            phone_number.clear();
            logini.clear();
            password.clear();
            wezipesi.clear();
            aylyktext.clear();
            own_id_text.clear();
        });
        Button back = new Button("Back ->");
        back.setMaxSize(SizeConfig.Width(0.1),SizeConfig.Height(0.03));
        back.setMinSize(SizeConfig.Width(0.1),SizeConfig.Height(0.03));
        back.getStyleClass().addAll("Regbtn");
        Line line = new Line();
        line.setEndY(870);
        back.setOnAction((e)->{
            Global.pane.getChildren().clear();
            Global.pane.getChildren().addAll(new Main_Screen());
        });


        VBox regbox = new VBox();
        regbox.getChildren().addAll(namebox,surnamebox,wezipebox,brithday_box,loginbox,passbox,numberbox,typebox,aylykbox,ownbox,regbtn,back);
        regbox.getStylesheets().add(CssConfig.Css());
//        regbox.setMargin(username, new Insets(0,0,0,300));
//        regbox.setMargin(usersurname, new Insets(0,0,0,300));
//        regbox.setMargin(wezipe, new Insets(0,0,0,300));
//        regbox.setMargin(login, new Insets(0,0,0,300));
//        regbox.setMargin(pass, new Insets(0,0,0,300));
//        regbox.setMargin(phone, new Insets(0,0,0,300));
//        regbox.setMargin(type, new Insets(0,0,0,300));
//        regbox.setMargin(aylyk, new Insets(0,0,0,300));
        regbox.getStyleClass().add("Registrasiya_penjiresi");
        regbox.setAlignment(Pos.CENTER);
        this.getChildren().addAll(regbox);
        this.setMargin(regbox, new Insets(0,0,0,500));
        this.setAlignment(Pos.CENTER);
        this.setPrefSize(SizeConfig.Width(0.8),SizeConfig.Height(0.8));

  }
}
