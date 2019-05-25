package prob3.EmployeeInfo;

public class SavingAccount extends Account {
	private final static double MONTHLY_INTREST_RATE = 0.25;
	public SavingAccount(Employee emp, double balance){
		super(emp,balance);
	}
	
	@Override
	public AccountType getAccountType(){
		return AccountType.SAVING;
	}
	@Override
	public double getBalance() {
		this.balance = this.balance + this.balance * (MONTHLY_INTREST_RATE/100);
		return this.balance;
	}

}
