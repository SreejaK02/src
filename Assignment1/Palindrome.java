package Assignment1;

import java.util.Scanner;
public class Palindrome {
	public static void main(String args[]) {
		int sum=0;
		Scanner obj =new Scanner(System.in);
		int num= obj.nextInt();
		int number=num;
		while(num>0) {
			int r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(number==sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		obj.close();
	}

}