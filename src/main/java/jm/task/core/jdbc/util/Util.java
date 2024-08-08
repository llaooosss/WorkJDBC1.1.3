package jm.task.core.jdbc.util;

import org.gjt.mm.mysql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util extends Configs {
    // реализуйте настройку соеденения с БД
    public static Connection dbConnection;

    public static Connection getDbConnection() throws ClassNotFoundException, SQLException {

//        DriverManager.registerDriver(new Driver());

        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
//        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }
}
