package Prob3;

public class Account {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;
	Account(Employee emp, AccountType acctType, double balance){
	employee = emp;
	this.acctType =acctType;
	this.balance = balance;
	}
	Account(Employee emp, AccountType acctType){
	this(emp,acctType,DEFAULT_BALANCE);
	}
	public String toString() {
	return "type = " + acctType+ ", balance =$ " + balance;
	}
	public void makeDeposit(double deposit) {
	this.balance+=deposit;
	}
	public boolean makeWithdrawal(double amount) {
	if(balance>amount){
		return true;
	}
	   return false;
	}

	public void setAcctType(AccountType accountInfo){
		this.acctType= accountInfo;
	}
	public void setacctType(AccountType accType){
	accType=accType;	
	}
	public AccountType getacctType() {
		return this.acctType;
	}
	public void setBalance (double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return this.balance;
		
	}
}
