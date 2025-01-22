package Assignment1;

import java.util.Scanner;

public class PalindromeToN {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        for (int i = 0; i <= number; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
        obj.close();
    }

public static boolean isPalindrome(int num) {
        int n = num;
        int sum = 0;

        while (num > 0) {
            int r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }

        return n == sum;
    }
}