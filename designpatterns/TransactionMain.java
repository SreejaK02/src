package designpatterns;

public class TransactionMain {
	//Client code
	 public static void main(String[] args) {
	     TransactionFactory depositFactory = new DepositFactory();
	     TransactionFactory withdrawalFactory = new WithdrawalFactory();
	     TransactionFactory transferFactory = new TransferFactory();

	     Transaction deposit = depositFactory.createTransaction();
	     deposit.processTransaction();  // Processing Deposit Transaction

	     Transaction withdrawal = withdrawalFactory.createTransaction();
	     withdrawal.processTransaction();  // Processing Withdrawal Transaction

	     Transaction transfer = transferFactory.createTransaction();
	     transfer.processTransaction();  // Processing Transfer Transaction
	 }
	}


