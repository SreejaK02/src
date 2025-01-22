package Assignment1;

import java.util.Scanner;

public class PrimeSumAverage {
    public static void main(String[] args) {  // Corrected main method signature
        Scanner obj = new Scanner(System.in);
        
       System.out.print("Enter the value of N: ");
        int n = obj.nextInt();  
        
        int count = 0;
        int number = 2;  
        int sum = 0;
        
        System.out.println("The first " + n + " prime numbers are:");
        
        
        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                sum += number;
                count++;
            }
            number++;
        }
        
        double average = (double) sum / n;
        
        System.out.println("\nSum of the first " + n + " prime numbers: " + sum);
        System.out.println("Average of the first " + n + " prime numbers: " + average);
        
        obj.close(); 
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }

        for (int i = 2; i * i <= num; i++) {  
            if (num % i == 0) {
                return false;  
                }
        }

        return true;  
    }
}