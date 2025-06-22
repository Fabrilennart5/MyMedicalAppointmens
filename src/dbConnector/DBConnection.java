package dbConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String path = "database/Medical.db";
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                String dbUrl = "jdbc:sqlite:" + path;
                connection = DriverManager.getConnection(dbUrl);
                System.out.println("Connection to SQLite established successfully.");
            } catch (SQLException e) {
                System.err.println("Error connecting to database: " + e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                connection = null;
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            System.err.println("Error closing connection: " + e.getMessage());
        }
    }
}
