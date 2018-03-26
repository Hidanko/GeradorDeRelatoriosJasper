package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    final static String USERNAME = "root";
    final static String PASSWORD = "";
    final static String URL = "jdbc:mariadb://localhost:3306/relatorio";
    public static java.sql.Connection getConnection() {

        Connection connection;
        try {
            connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao banco de dados.");
            return null;
        }
    }
}
