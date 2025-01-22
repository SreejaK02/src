package Assignment3;
/*Declare a class using the Scanner class, which allows the user to interact with the SimpleCalc class: 
 the user must be able to write the first operand, select the operation to be performed from a list and specify the 
 second operand. The program must return the right result.*/
import java.util.Scanner;
//import SimpleCalculator;

public class SimpleCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first operand: ");
        int number1 = input.nextInt();

        
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. RestofDivision");

        int operation = input.nextInt();

        System.out.println("Enter the second operand: ");
        int number2 = input.nextInt();

        float result = 0;
        //SimpleCalculator ob= new SimpleCalculator(number1,number2);
        // Switch case for performing the selected operation
        switch (operation) {
            case 1:
                result = SimpleCalculator.Sum(number1, number2);
                System.out.println("Result: " + result);
                break;

            case 2:
                result = SimpleCalculator.Subtract(number1, number2);
                System.out.println("Result: " + result);
                break;

            case 3:
                result = SimpleCalculator.Multiply(number1, number2);
                System.out.println("Result: " + result);
                break;

            case 4:
                result = SimpleCalculator.division(number1, number2);
                System.out.println("Result: " + result);
                break;
            case 5:
            	result=SimpleCalculator.RestofDivision(number1, number2);
            	System.out.println("Result: "+result);

            default:
                System.out.println("Invalid operation selected.");
        }

        input.close();
    }
}
