package Main.Initiation;

import Main.Component.LoginScreen.PasswordScreen;
import Main.Component.MainScreen.Main_Screen;

import java.sql.SQLException;

public class Initiation {
    public Initiation() throws SQLException {
        new PasswordScreen();
    }
}
