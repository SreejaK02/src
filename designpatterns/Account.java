package designpatterns;

//Abstract Account
abstract class Account {
 public abstract String accountType();
}

//Concrete Account Types
class SavingsAccount extends Account {
 public String accountType() {
     return "Savings Account";
 }
}

class CheckingAccount extends Account {
 public String accountType() {
     return "Checking Account";
 }
}

//Abstract Factory
abstract class AccountFactory {
 public abstract Account createAccount();
}

//Concrete Factories
class SavingsAccountFactory extends AccountFactory {
 public Account createAccount() {
     return new SavingsAccount();
 }
}

class CheckingAccountFactory extends AccountFactory {
 public Account createAccount() {
     return new CheckingAccount();
 }
}

