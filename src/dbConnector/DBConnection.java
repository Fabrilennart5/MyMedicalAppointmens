package dbConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static void connect() {
        String path = "database/Medical.db";
        Connection connection = null;

        try {
            String dbUrl = "jdbc:sqlite:" + path;
            connection = DriverManager.getConnection(dbUrl);
            System.out.println("Connection to SQLite established successfully.");
        } catch (SQLException e) {
            System.err.println("Error connecting to database: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}

