package DB;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    public boolean insertUser(int id, int roll_number,String email, Double salary) {
        String query = "INSERT INTO mytable (id, roll_number, email,salary) VALUES (?, ?, ?, ?)";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setInt(1, id);
            statement.setInt(2, roll_number);
            statement.setString(3, email);
            statement.setDouble(4, salary);
            
            
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
            return false;
        }
    }
}
