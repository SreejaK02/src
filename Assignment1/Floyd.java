package Assignment1;


import java.util.*;
public class Floyd {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt()	;
		int i,j,val=1;
		for(i=1;i<n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
		}
		}
}