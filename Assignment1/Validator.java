package Assignment1;

	import java.util.Scanner;
	import java.util.regex.Pattern;

	public class Validator {
		public static boolean isValidName(String name) {
	        String nameRegex = "^[a-zA-Z0-9]+$";
	        Pattern pattern = Pattern.compile(nameRegex);
	        
	        return pattern.matcher(name).matches();
	    }
	    // Email Validation
	    public static boolean isValidEmail(String email) {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+@gmail\\.com$";
	        Pattern pattern = Pattern.compile(emailRegex);
	        if (email == null) {
	            return false;
	        }
	        return pattern.matcher(email).matches();
	    }
  

	    // Date of Birth Validation (Format: DD/MM/YYYY)
	    public static boolean isValidDOB(String dob) {
	        String dobRegex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
	        Pattern pattern = Pattern.compile(dobRegex);
	        if (dob == null) {
	            return false;
	        }
	        return pattern.matcher(dob).matches();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	     // Get name input
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        if(isValidName(name)) {
	        	System.out.println("Name is Valid");
	        }
	        else {
	        	System.out.println("Enter valid name");
	        	String newname=scanner.nextLine();
	        }
	       	        
	        
	        // Get email input
	        System.out.print("Enter your email: ");
	        String email = scanner.nextLine();
	        if(isValidEmail(email)) {
	        	System.out.println("Email is valid");
	        	
	        }
	        else {
	        	System.out.println("Email is not valid. Enter valid mail");
	        	String validEmail=scanner.nextLine();
	        }
	       // validEmail.close();

	        

	        // Get date of birth input
	        System.out.print("Enter your date of birth (DD/MM/YYYY): ");
	        String dob = scanner.nextLine();
	        if(isValidDOB(dob)) {
	        	System.out.println("DOB is valid");
	        }
	        else {
	        	System.out.println("Enter Valid DOB");
	        	String validDOB=scanner.nextLine();
	        }
	        //System.out.println("Date of birth is valid: " + isValidDOB(dob));

	        scanner.close();
	    }
	}

