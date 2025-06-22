package dbConnector;

import model.Paciente;
import java.sql.*;

public class PacienteDao {
    private Connection connection;

    public PacienteDao(Connection connection) {
        this.connection = connection;
    }

    public void insertPaciente(Paciente p) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO patients (first_name, last_name, national_id, phone, address) VALUES (?, ?, ?, ?, ?)"
            );
            stmt.setString(1, p.getFirstName());
            stmt.setString(2, p.getLastName());
            stmt.setString(3, p.getNationalId());
            stmt.setString(4, p.getPhone());
            stmt.setString(5, p.getAddress());
            stmt.executeUpdate();
            System.out.println("Patient inserted successfully.");
        } catch (SQLException e) {
            System.err.println("Error inserting patient: " + e.getMessage());
        }
    }
}
