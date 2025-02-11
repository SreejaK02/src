/* package CRUDDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userInsert {
	
		    public static void insertEmployee(int id, int roll_number,String email, Double salary) {
		        String query = "INSERT INTO mytable (id, roll_number, email,salary) VALUES (?, ?, ?, ?)";
		        try (Connection connection = DBConnection.getConnection();
		             PreparedStatement statement = connection.prepareStatement(query)) {
		            
		            statement.setInt(1, id);
		            statement.setInt(2, roll_number);
		            statement.setString(3, email);
		            statement.setDouble(4, salary);
		            
		            
		            int rowsAffected = statement.executeUpdate();
		            System.out.println("Inserted"+ rowsAffected);
		            //return rowsAffected > 0;
		        } catch (SQLException e) {
		            System.out.println("Insert failed: " + e.getMessage());
		            System.out.println("Error");
		            //return false;
		        }
		    }
}
*/

package CRUDDB;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userInsert {

    // Method to insert employee into the database
    public static boolean insertEmployee(int id, int roll_number, String email, float salary) {
//    	if(doesIdExist(id)) {
//    		System.out.println("Employee with ID"+ id+"already exists.");
//    		return false;
//    	}
        String query = "INSERT INTO mytable (id, roll_number, email, salary) VALUES (?, ?, ?, ?)";
        
        // Return true if insertion was successful, false otherwise
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            // Set parameters for the query
            statement.setInt(1, id);
            statement.setInt(2, roll_number);
            statement.setString(3, email);
            statement.setFloat(4, salary);

            // Execute the update and check if rows were affected
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Employee inserted successfully!");
                return true;  // Insertion successful
            } else {
                System.out.println("No rows inserted.");
                return false; // Insertion failed
            }

        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
            e.printStackTrace(); // Optionally print stack trace for debugging
            return false;  // Insertion failed due to an exception
        }
    }
    protected static boolean doesIdExist(int id) {
        String checkQuery = "SELECT COUNT(*) FROM mytable WHERE id = ?";
        
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(checkQuery)) {
            
            // Set the id parameter for the query
            statement.setInt(1, id);
            
            // Execute the query and get the result
            ResultSet resultSet = statement.executeQuery();
            
            // If the count is greater than 0, the ID already exists
            if (resultSet.next() && resultSet.getInt(1) > 0) {
                return true;  // ID already exists
            }
        } catch (SQLException e) {
            System.out.println("Error checking ID existence: " + e.getMessage());
            e.printStackTrace();
        }
        
        return false;  // ID does not exist
    }
}



