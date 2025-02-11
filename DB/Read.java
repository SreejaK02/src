package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {

    public void readUser(int id) {
        String query = "SELECT * FROM mytable WHERE id = ?";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String rollNumber = resultSet.getString("roll_number");
                String email = resultSet.getString("email");
                double salary = resultSet.getDouble("salary");
                
                System.out.println("User ID: " + id);
                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Email: " + email);
                System.out.println("Salary: " + salary);
            } else {
                System.out.println("No user found with ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Read failed: " + e.getMessage());
        }
    }
}
