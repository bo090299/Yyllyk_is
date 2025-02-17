package Main.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static  Connector instance;
    private Connection connection;


    private  String url = "jdbc:mysql://localhost:3306/hasapcy";
    private  String user = "root";
    private  String pass = "";

    public  Connector(){
        try {
            connection = DriverManager.getConnection(url,user,pass);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static synchronized Connector getInstance(){
        if(instance == null){
            instance = new Connector();
        }
        return  instance;
    }
    public Connection getConnection(){
        return connection;
    }
}

