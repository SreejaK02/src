package CRUDDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {

    public static boolean updateEmployee(int id, int roll_number, String email, float salary) {
        String query = "UPDATE mytable SET roll_number = ?, email = ?, salary = ? WHERE id = ?";
        
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            // Set the new values for the employee
        	statement.setInt(1, id);
            statement.setInt(2, roll_number);
            statement.setString(3, email);
            statement.setFloat(4, salary);
            
            
            // Execute the update
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee details updated successfully!");
                return true;
            } else {
                System.out.println("No employee found with ID " + id);
                return false;
            }
            
        } catch (SQLException e) {
            System.out.println("Update failed: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}

