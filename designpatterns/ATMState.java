package designpatterns;

import java.util.Scanner;

//State Interface
interface ATMState {
 void handle(ATM atm);
}

//Concrete States
class IdleState implements ATMState {
 public void handle(ATM atm) {
     System.out.println("ATM is Idle. Please insert your card.");
     // Simulate card insertion (user input)
     Scanner scanner = new Scanner(System.in);
     System.out.println("Press 1 to insert your card");
     int action = scanner.nextInt();
     
     if (action == 1) {
         System.out.println("Card inserted successfully.");
         atm.setState(atm.getPinEnteredState());
     } else {
         System.out.println("Invalid action. Please try again.");
     }
 }
}

class PINEnteredState implements ATMState {
 public void handle(ATM atm) {
     System.out.println("Please enter your PIN:");

     // Simulate PIN entry
     Scanner scanner = new Scanner(System.in);
     String pin = scanner.nextLine();
     
     // Simple PIN validation
     if (pin.equals("1234")) {
         System.out.println("PIN entered successfully.");
         atm.setState(atm.getTransactionState());
     } else {
         System.out.println("Incorrect PIN. Please try again.");
     }
 }
}

class TransactionState implements ATMState {
 public void handle(ATM atm) {
     System.out.println("Select your transaction: ");
     System.out.println("1. Withdrawal");
     System.out.println("2. Balance Inquiry");

     // Simulate transaction selection
     Scanner scanner = new Scanner(System.in);
     int transaction = scanner.nextInt();
     
     if (transaction == 1) {
         System.out.println("You selected Withdrawal.");
         atm.setState(atm.getCashDispensedState());
     } else if (transaction == 2) {
         System.out.println("You selected Balance Inquiry.");
         atm.setState(atm.getIdleState());
     } else {
         System.out.println("Invalid transaction selection. Please try again.");
     }
 }
}

class CashDispensedState implements ATMState {
 public void handle(ATM atm) {
     System.out.println("Cash is being dispensed...");
     System.out.println("Transaction completed.");
     atm.setState(atm.getIdleState());
 }
}

//ATM (Context) class
class ATM {
 private ATMState idleState;
 private ATMState pinEnteredState;
 private ATMState transactionState;
 private ATMState cashDispensedState;
 private ATMState currentState;

 public ATM() {
     idleState = new IdleState();
     pinEnteredState = new PINEnteredState();
     transactionState = new TransactionState();
     cashDispensedState = new CashDispensedState();
     currentState = idleState;
 }

 public void setState(ATMState state) {
     currentState = state;
 }

 public ATMState getIdleState() {
     return idleState;
 }

 public ATMState getPinEnteredState() {
     return pinEnteredState;
 }

 public ATMState getTransactionState() {
     return transactionState;
 }

 public ATMState getCashDispensedState() {
     return cashDispensedState;
 }

 public void requestAction() {
     currentState.handle(this);
 }
}


