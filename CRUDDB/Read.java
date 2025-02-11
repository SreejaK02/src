package CRUDDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {


    
    public static void selectEmployee(int id) {
        String query = "SELECT * FROM mytable WHERE id = ?";
        
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            // Set the employee ID in the query
            statement.setInt(1, id);
            
            // Execute the query
            ResultSet resultSet = statement.executeQuery();
            
            // Check if the employee exists and display the details
            if (resultSet.next()) {
                System.out.println("Employee ID: " + resultSet.getInt("id"));
                System.out.println("Employee Roll Number: " + resultSet.getInt("roll_number"));
                System.out.println("Employee Email: " + resultSet.getString("email"));
                System.out.println("Employee Salary: " + resultSet.getFloat("salary"));
            } else {
                System.out.println("Employee with ID " + id + " not found.");
            }
            
        } catch (SQLException e) {
            System.out.println("Select failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

