package Assignment1;
import java.util.*;
public class SumDigit {
	public static void main(String args[])
	{
	int sum=0;
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();

	while(n!=0){
	int x=n%10;
	sum+=x;
	n=n/10;

	}
	System.out.println(sum);
	obj.close();
	}
}
