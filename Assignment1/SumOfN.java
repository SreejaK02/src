package Assignment1;

import java.util.Scanner;

public class SumOfN {
public static void main (String args[]) {
int sum=0,n;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number(n): ");
n=scanner.nextInt();
for(int i=1;i<=n;i++){
sum=(n*(n+1))/2;
}
System.out.println(sum);
scanner.close();
}
}