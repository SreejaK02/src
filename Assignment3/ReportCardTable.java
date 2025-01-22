//name, surname and class of the student;
//a table of votes that you associate for each subject, the vote and the judgment
//It must also declare a method that reads the report data legibly.
//Also create an class that prints one or more report cards.
package Assignment3;

import java.util.*;
public class ReportCardTable {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number of Students: ");
	int number=obj.nextInt();
	for(int i=1;i<=number;i++) {
	
	//Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Name: ");
	String name=obj.nextLine();
			
	System.out.println("Enter Surname: ");
	String Surname=obj.nextLine();
	System.out.println("Enter Class: ");
	String Class=obj.nextLine();
	System.out.println();
	System.out.println("Report Card of Student: ");
	System.out.println("Name:" +name+" "+Surname);
	//System.out.println("Surname:" +Surname);
	System.out.println("Class:" +Class);
	}
	obj.close();
	
}
}
