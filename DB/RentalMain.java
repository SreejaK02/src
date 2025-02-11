package DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.*;
public class RentalMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection connection = DatabaseConnect.getConnection();
 
        // Take user input for user_id and booking_id
        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();
 
        System.out.print("Enter Booking ID: ");
        String bookingId = sc.nextLine();
        VehicleRental pay=new VehicleRental();
        // Fetch and display payment transactions
        pay.paymentList(userId, bookingId);
 
        sc.close();
    }
}