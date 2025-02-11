package CRUDDB;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;

public class CRUDOper {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);

        // Attempt to check database connection
        if (checkDatabaseConnection()) {
            System.out.println("Database connected successfully!\n");
        } else {
            System.out.println("Failed to connect to the database.");
            return; // Exit the program if database connection fails
        }

        boolean continueInsert = true;
        
        // Handle Insert operation in a loop
        while (continueInsert) {
            System.out.print("Enter employee id: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            System.out.print("Enter employee roll number: ");
            int roll_number = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            System.out.print("Enter employee email: ");
            String email = scanner.nextLine();

            System.out.print("Enter employee salary: ");
            float salary = scanner.nextFloat();
            scanner.nextLine(); // Consume the leftover newline character

            // Insert the employee data into the database
            boolean insertSuccess = userInsert.insertEmployee(id, roll_number, email, salary);
            if (insertSuccess) {
                System.out.println("Employee data inserted successfully.");
            } else {
                System.out.println("Failed to insert employee data.");
            }

            // Ask if the user wants to insert another employee
            System.out.print("\nDo you want to insert another employee? (yes/no): ");
            String userChoice = scanner.nextLine();

            if (!userChoice.equalsIgnoreCase("yes")) {
                continueInsert = false;
                System.out.println("\nExiting insert operation...");
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check database connection
    private static boolean checkDatabaseConnection() {
        try (Connection conn = DBConnection.getConnection()) {
            if (conn != null && !conn.isClosed()) {
                return true;  // Connection was successful
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;  // Connection failed
    }
}


/*package  CRUDDB;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
 
 
public class CRUDOper {
    public static void main(String[] args) {        
    	
    	        Scanner scanner = new Scanner(System.in);
 
    	        // Attempt to check database connection
    	        if (checkDatabaseConnection()) {
    	            System.out.println("Database connected successfully!\n");
    	        } else {
    	            System.out.println("Failed to connect to the database.");
    	            return; // Exit the program if database connection fails
    	        }
                boolean continueinsert=true;
    	        // Handle Insert operation
                while(continueinsert) {
    	        System.out.print("Enter employee id: ");
    	        int id = scanner.nextInt();
    	        scanner.nextLine(); 
    	        System.out.print("Enter employee roll number: ");
    	        int roll_number = scanner.nextInt();
    	        scanner.nextLine(); 
    	        System.out.print("Enter employee email: ");
    	        String email = scanner.nextLine();
    	        System.out.print("Enter employee salary: ");
    	        double salary = scanner.nextDouble();
 
    	        // Insert the employee data into the database
    	        
    	        //userInsert.insertEmployee(id,roll_number,email, salary);
    	        boolean insertSuccess = userInsert.insertEmployee(id, roll_number, email, salary);
                if (insertSuccess) {
                    System.out.println("Employee data inserted successfully.");
                } else {
                    System.out.println("Failed to insert employee data.");
                }
    	        
    	        System.out.print("\nDo you want to insert another employee? (yes/no): ");
                String userChoice = scanner.nextLine();
               // scanner.nextLine(); 
                if (!userChoice.equalsIgnoreCase("yes")) {
                    continueinsert = false;
                    System.out.println("\nExiting insert operation...");
                    
                }
                }
    	        // Close the scanner
                scanner.close();
    	    }
 
    	    // Method to check database connection
    	    private static boolean checkDatabaseConnection() {
    	        try (Connection conn = DBConnection.getConnection()) {
    	            if (conn != null && !conn.isClosed()) {
    	                return true;  // Connection was successful
    	            }
    	        } catch (SQLException e) {
    	            System.out.println("Error: " + e.getMessage());
    	        }
    	        return false;  // Connection failed
    	    }
    	
 
    } 
*/