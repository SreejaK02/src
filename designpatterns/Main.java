package designpatterns;

//Test the State pattern
//Main class for terminal interaction
public class Main {
public static void main(String[] args) {
   ATM atm = new ATM();

   // Start ATM process
   while (true) {
       atm.requestAction();
   }
}
}