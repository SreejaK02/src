package Assignment3;
import java.util.*;

public class HeadsOrTails {
    public static String getHeadsOrTails() {
        Scanner input = new Scanner(System.in);
        int Coin = input.nextInt(); 
        String result; 

        switch (Coin) {
            case 0:
                result = "Heads"; 
                break;
            case 1:
                result = "Tails";
                break;
            default:
                result = "Invalid Input"; 
                break;
        }
        
        input.close(); 
        return result; 
    }

    public static void main(String[] args) {
        System.out.println(getHeadsOrTails());
    }
}


