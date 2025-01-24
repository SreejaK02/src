package designpatterns;

//Abstract Transaction
abstract class Transaction {
 public abstract void processTransaction();
}

//Concrete Transaction Types
class Deposit extends Transaction {
 public void processTransaction() {
     System.out.println("Processing Deposit Transaction");
 }
}

class Withdrawal extends Transaction {
 public void processTransaction() {
     System.out.println("Processing Withdrawal Transaction");
 }
}

class Transfer extends Transaction {
 public void processTransaction() {
     System.out.println("Processing Transfer Transaction");
 }
}

//Abstract Factory for Transactions
abstract class TransactionFactory {
 public abstract Transaction createTransaction();
}

//Concrete Factories for Transactions
class DepositFactory extends TransactionFactory {
 public Transaction createTransaction() {
     return new Deposit();
 }
}

class WithdrawalFactory extends TransactionFactory {
 public Transaction createTransaction() {
     return new Withdrawal();
 }
}

class TransferFactory extends TransactionFactory {
 public Transaction createTransaction() {
     return new Transfer();
 }
}

