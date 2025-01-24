package designpatterns;

public class AccountMain {
	//Customer code
	 public static void getAccount(AccountFactory factory) {
	     Account account = factory.createAccount();
	     System.out.println("Account created: " + account.accountType());
	 }

	 public static void main(String[] args) {
	     AccountFactory savingsFactory = new SavingsAccountFactory();
	     AccountFactory checkingFactory = new CheckingAccountFactory();

	     getAccount(savingsFactory);  // Savings Account created
	     getAccount(checkingFactory);  // Checking Account created
	 }
	}


