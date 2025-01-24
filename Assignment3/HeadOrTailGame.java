package Assignment3;

import java.util.*;

public class HeadOrTailGame {
    public static void main(String args[]) {
        String result = HeadsOrTails.getHeadsOrTails();
        System.out.println("Result: " + result);
        
        String tossResult = tossCoin();
        System.out.println("Toss Result: " + tossResult);
        
        if (result.equals(tossResult)) {
            System.out.println("Win");
        } else {
            System.out.println("Lose");
        }
    }

    public static String tossCoin() {
        Random random = new Random();
        int toss = random.nextInt(2); // 0 or 1
        String result = toss == 0 ? "Heads" : "Tails";
        System.out.println(result);
        return result;
    }
}
