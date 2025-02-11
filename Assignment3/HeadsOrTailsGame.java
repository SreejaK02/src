package Assignment3;
import java.util.*;
public class HeadsOrTailsGame {
public static void main(String args[]) {
	String result=(HeadsOrTails.getHeadsOrTails());
	String tossResult = tossCoin();
	//Scanner input=new Scanner(System.in);
	//int Coin=input.nextInt();
	if(result.equals(tossResult)) {
		System.out.println("Win");
	}
	else {
		System.out.println("Lose");
	}
	
}
public static String tossCoin() {
    Random random = new Random();
    int toss = random.nextInt(2);
    String result=toss==0?"Heads":"Tails"; 
    System.out.println(result);
    return result;
    //return toss == 0 ? "Heads" : "Tails";
   // int res = Integer.parseInt(result);
/*if(toss==result) {
	System.out.println("Win");
}
else {
	System.out.println("Lose");
} */
}
}
