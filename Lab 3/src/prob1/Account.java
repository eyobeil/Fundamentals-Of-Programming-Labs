package prob1;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;

	public AccountType getAccounttype() {
		return acctType;
	}
	Account(Employee emp, AccountType acctType, double balance){
		this.acctType =acctType;
		this.balance = balance;
	}
	Account(Employee emp, AccountType acctType){
		this(emp,acctType,DEFAULT_BALANCE);
	}
	public String tostring() {
		return ("type = " + acctType + ", balance = " + balance);
	}
	public void makeDeposit(double deposit) {
		this.balance+=deposit;
	}
	public boolean makeWithdrawal(double amount) {
		if(balance>=amount) {
			return true;
		}
		return false;
	}
	public double getBalance() {
		return this.balance;
	}

}

