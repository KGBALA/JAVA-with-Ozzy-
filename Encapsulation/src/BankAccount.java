
public class BankAccount {

	private String accnum;
	private double balance;
	private String CustName;
	private String email;
	private int phoneNumber;
	
	
	public void Deposit(double money) {
		this.balance+=money;
	}
	
	public void Withdraw(double noMoney) {
		if(this.balance-noMoney<0) {
			System.out.println("Only "+ this.balance +" available.Withdrwal no processed");
		}else {
			this.balance-=noMoney;
			System.out.println("Withdrawal of "+ noMoney+" processed.Ramaining balance "+this.balance);
		}
	}


	public String getAccnum() {
		return accnum;
	}

	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double d) {
		this.balance = d;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
