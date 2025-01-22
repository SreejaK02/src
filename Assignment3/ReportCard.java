package Assignment3;

import java.util.*;
public class ReportCard {
	public static void main(String args[]) {
		System.out.println("Report Card");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=obj.nextLine();
				
		System.out.println("Enter Surname: ");
		String Surname=obj.nextLine();
		System.out.println("Enter Class: ");
		String Class=obj.nextLine();
		//System.out.println("Class:" +Class);
		System.out.println("Name:" +name+" "+Surname);
		//System.out.println("Surname:" +Surname);
		System.out.println("Class:" +Class);
		obj.close();
	
	}

}
