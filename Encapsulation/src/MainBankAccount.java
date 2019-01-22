
public class MainBankAccount {

	public static void main(String[] args) {
		

		BankAccount myAccount=new BankAccount();
		myAccount.setAccnum("126564545343");
		myAccount.setBalance(2.5);
		myAccount.setCustName("Eddie");
		
		myAccount.Withdraw(100.0);
		myAccount.Deposit(1500000);
		myAccount.Withdraw(50000);
		
		System.out.println(myAccount.getCustName());
		
		
		
		
	}

}
