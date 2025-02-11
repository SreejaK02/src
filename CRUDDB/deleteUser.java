package CRUDDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteUser {
	    public static boolean delete(int id) {
	        String query = "DELETE FROM mytable WHERE id = ?";
	        try (Connection connection = DBConnection.getConnection();
	             PreparedStatement statement = connection.prepareStatement(query)) {
	            
	            statement.setInt(1, id);
	            
	            int rowsAffected = statement.executeUpdate();
	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            System.out.println("Delete failed: " + e.getMessage());
	            return false;
	        }
	    }
	}

