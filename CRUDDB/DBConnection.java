package CRUDDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	    
	    private static final String URL = "jdbc:mysql://localhost:3306/vehiclerental";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "Incedo@1234";
	    
	    public static Connection getConnection() throws SQLException {
	    	try {
	    		Connection connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
	    		return connection;
	    	}
	    	catch (SQLException e) {
	    		System.out.println("Error");
	    		 throw e;
	    	}
	           
	        }
	}


