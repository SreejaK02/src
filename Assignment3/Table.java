package Assignment3;

import java.util.*;

public class Table {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numStudents = obj.nextInt();
        obj.nextLine();
        for(int Student=1;Student<=numStudents;Student++) {
        	System.out.println("Enter details for students: "+Student);
        
        System.out.println("Enter Name: ");
        String name = obj.nextLine();
        
        System.out.println("Enter Surname: ");
        String surname = obj.nextLine();
        
        System.out.println("Enter Class: ");
        String studentClass = obj.nextLine();
        // Store subjects and grades
        Map<String, Integer> subjects = new LinkedHashMap<>();
        
        System.out.println("Enter the number of subjects: ");
        int numSubjects = obj.nextInt();
        obj.nextLine(); 
        
        for (int i = 1; i <=numSubjects; i++) {
            System.out.println("Enter Subject " + (i) + ": ");
            String subject = obj.nextLine();
            
            System.out.println("Enter grade from 1-100 " + subject + ": ");
            int grade = obj.nextInt();
            obj.nextLine();            
            //System.out.println("Enter judgment for " + subject + ": ");
            //String judgment = obj.nextLine();
            
            subjects.put(subject, grade);
        }
        
       // obj.close();
        // Printing the report card
        System.out.println("\n---- Report Card ----");
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Class: " + studentClass);
        System.out.println("-------------------------------------------");
        System.out.println("Subject\t\tGrade\tJudgment");
        System.out.println("-------------------------------------------");

        // Print subjects, grades, and judgments
        for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
            String subject = entry.getKey();
            //String[] details = entry.getValue();
            int grade=entry.getValue();
 
            String judgment=" ";
           
            
            if(grade<=36) {
            	 judgment="Fail";
            }
            else if(grade>36 && grade <50) {
            	judgment =" Can do better";
            }
            else if(grade>50 && grade <70) {
            	judgment ="Good";
            }
            else if(grade>70 && grade <=90) {
            	judgment="Excellent";
            }
            else if(grade>90) {
            	judgment=" Outstanding";
            }
            else {
            	System.out.println("Enter valid grade");
            }
          System.out.println(subject + "\t\t" + grade + "\t" + judgment);
        }
          System.out.println("-------------------------------------------");
        }
        
        obj.close();
        
    }
    }

