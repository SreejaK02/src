package CRUDDB;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
public class MainCRUD {
	//public class CRUDOper {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Check if the database connection is successful
	        if (checkDatabaseConnection()) {
	            System.out.println("Database connected successfully!\n");
	        } else {
	            System.out.println("Failed to connect to the database.");
	            return; // Exit if database connection fails
	        }

	        boolean continueOperation = true;

	        // CRUD Menu
	        while (continueOperation) {
	            System.out.println("\nChoose an operation: ");
	            System.out.println("1. Insert Employee");
	            System.out.println("2. Read Employee");
	            System.out.println("3. Update Employee");
	            System.out.println("4. Delete Employee");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume the newline character

	            switch (choice) {
	                case 1:
	                    // Insert operation
	                    System.out.print("Enter employee id: ");
	                    int id = scanner.nextInt();
	                    if(userInsert.doesIdExist(id)) {
	                    	System.out.println("Already Exists!");
	                    }
	                    else {
	                    System.out.print("Enter employee roll number: ");
	                    int roll_number = scanner.nextInt();
	                    scanner.nextLine();  
	                    System.out.print("Enter employee email: ");
	                    String email = scanner.nextLine();
	                    System.out.print("Enter employee salary: ");
	                    float salary = scanner.nextFloat();
	                    
	                    userInsert.insertEmployee(id, roll_number, email, salary);
	                    }
	                    break;

	                case 2:
	                    // Read (View) operation
	                    System.out.print("Enter employee id to view: ");
	                    int viewId = scanner.nextInt();
	                    Read.selectEmployee(viewId);
	                    break;

	                case 3:
	                    // Update operation
	                    System.out.print("Enter employee id to update: ");
	                    int updateId = scanner.nextInt();
	                    System.out.print("Enter new roll number: ");
	                    int newRollNumber = scanner.nextInt();
	                    scanner.nextLine();  // Consume newline
	                    System.out.print("Enter new email: ");
	                    String newEmail = scanner.nextLine();
	                    System.out.print("Enter new salary: ");
	                    float newSalary = scanner.nextFloat();
	                    
	                    update.updateEmployee(updateId, newRollNumber, newEmail, newSalary);
	                    break;

	                case 4:
	                    // Delete operation
	                    System.out.print("Enter employee id to delete: ");
	                    int deleteId = scanner.nextInt();
	                    deleteUser.delete(deleteId);
	                    break;

	                case 5:
	                    // Exit the program
	                    continueOperation = false;
	                    System.out.println("Exited!");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Please select a valid option.");
	            }
	        }

	        // Close scanner
	        scanner.close();
	    }

	    // Method to check database connection
	    private static boolean checkDatabaseConnection() {
	        try (Connection conn = DBConnection.getConnection()) {
	            return conn != null && !conn.isClosed();
	        } catch (SQLException e) {
	            System.out.println("Error: " + e.getMessage());
	            return false;
	        }
	    }
	}


