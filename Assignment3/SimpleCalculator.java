package Assignment3;
import java.util.*;

public class SimpleCalculator {
	public static int Sum(int number1,int number2) {
		return number1+number2;
	}
	
	public static int Subtract(int number1,int number2) {
		return number2-number1;
	}
	
	public static int Multiply(int number1, int number2) {
		return number1*number2;
	}
	
	public static float division(int number1, int number2) {
		return number1/number2;
	}
	
	public static float RestofDivision(int number1, int number2) {
		return number1%number2;
	}
	
	public static int large(int number1,int number2) {
		return Math.max(number1,number2);
	}
	
	public static int small(int number1, int number2) {
		return Math.min(number1,number2);
	}
	
	public static int average(int number1, int number2) {
		return (number1+number2)/2;
	}
	
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int number1=input.nextInt();
		System.out.println("Enter 2nd number");
		int number2=input.nextInt();
		
		System.out.println("Sum is: "+Sum(number1,number2));
		System.out.println("Subtraction is: "+Subtract(number1,number2));
		System.out.println("Multiplication is: "+Multiply(number1,number2));
		System.out.println("Division is: "+division(number1,number2));
		System.out.println("Rest of Division is: "+RestofDivision(number1,number2));
		System.out.println("Larger number is: "+large(number1,number2));
		System.out.println("Smaller number  is: "+small(number1,number2));
		System.out.println("Average is: "+average(number1,number2));
		input.close();	
		}
		
		}

