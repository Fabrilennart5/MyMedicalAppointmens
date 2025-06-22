
import dbConnector.DBConnection;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args) {
    // primero nos conectamos a la db
        DBConnection.connect();

    }
}