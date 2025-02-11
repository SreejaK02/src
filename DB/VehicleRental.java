package DB;

import java.sql.*;
import java.util.*;
	
	public class VehicleRental {
		
		public void paymentList(String userId, String bookingId) {
	        String query = "SELECT u.id AS user_id, u.name AS user_name, " +
	                "p.id AS payment_id, p.payment_amount, p.payment_mode, p.payment_status, p.payment_date, " +
	                "b.id AS booking_id, b.booking_time, b.booking_price, b.duration " +
	                "FROM payments p " +
	                "JOIN bookings b ON p.id = b.payment_id " +
	                "JOIN users u ON b.user_id = u.id " +
	                "WHERE u.id = ? AND b.id = ? " +
	                "ORDER BY p.payment_date DESC";
	        try (Connection conn = DBConnection.getConnection();
	                PreparedStatement ps = conn.prepareStatement(query)) {
	 
	               // Set dynamic value
	               ps.setString(1,userId);
	               ps.setString(2, bookingId);
	 
	               try (ResultSet rs = ps.executeQuery()) {
	                   System.out.println("\nPayment Transactions:");
	                   System.out.println("---------------------------------------------------------------");
	 
	                   boolean hasRecords = false;
	                   while (rs.next()) {
	                       hasRecords = true;
	                       String userName = rs.getString("user_name");
	                       String paymentId = rs.getString("payment_id");
	                       double paymentAmount = rs.getDouble("payment_amount");
	                       String paymentMode = rs.getString("payment_mode");
	                       String paymentStatus = rs.getString("payment_status");
	                       Timestamp paymentDate = rs.getTimestamp("payment_date");
	                       Timestamp bookingTime = rs.getTimestamp("booking_time");
	                       double bookingPrice = rs.getDouble("booking_price");
	                       String duration = rs.getString("duration");
	 
	                       // Print transaction details
	                       System.out.println("User ID: " + userId + " | Name: " + userName);
	                       System.out.println("Booking ID: " + bookingId + " | Time: " + bookingTime + " | Price: " + bookingPrice + " | Duration: " + duration + " hours");
	                       System.out.println("Payment ID: " + paymentId + " | Amount: " + paymentAmount + " | Mode: " + paymentMode + " | Status: " + paymentStatus + " | Date: " + paymentDate);
	                       System.out.println("---------------------------------------------------------------");
	                   }
	 
	                   if (!hasRecords) {
	                       System.out.println("No transactions found for the given User ID and Booking ID.");
	                   }
	               }
	 
	           } catch (SQLException e) {
	               e.printStackTrace();
	           }
	}
	}

