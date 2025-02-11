package Assignment3;
import java.util.*;
public class randomque {
	
	//public class Main {
	   public static void main(String[] args) {
	     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	     Scanner input=new Scanner(System.in);
	     System.out.println("enter number");
	     int num=input.nextInt();
	     for (int i = 0; i < myNumbers.length; i++) {
	        for(int j = 0; j < myNumbers[i].length; j++) {
	        if(num==myNumbers[i][j]){
	        
	           System.out.println("is at: "+i+" "+j);
	           }
	        }
	     }
	   }
	}

