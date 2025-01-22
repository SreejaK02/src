package Assignment1;

import java.util.*;
public class Sequence {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter upto n: ");
		int n=obj.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(i+" ");
		}
		obj.close();
	}

}