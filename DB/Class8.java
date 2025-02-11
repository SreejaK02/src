package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Class8 {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/sampledb";
        String username = "root";
        String password = "Incedo@1234";

        // Create a connection to the database
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

