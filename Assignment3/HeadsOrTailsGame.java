package Assignment3;
import java.util.*;
public class HeadsOrTailsGame {
public static String main(String args[]) {
	/*Scanner input=new Scanner(System.in);
	int Coin=input.nextInt();
	if(Coin==1) {
		System.out.println("Tails");
	}
	else {
		System.out.println("Heads");
	}*/
	String result=(HeadsOrTails.getHeadsOrTails());
	return result;
}
public static String tossCoin() {
    Random random = new Random();
    int toss = random.nextInt(2); // 0 or 1
    return toss == 0 ? "Heads" : "Tails";
    int res = Integer.parseInt(result);
if(toss==res) {
	System.out.println("Win");
}
else {
	System.out.println("Lose");
}
}
}
