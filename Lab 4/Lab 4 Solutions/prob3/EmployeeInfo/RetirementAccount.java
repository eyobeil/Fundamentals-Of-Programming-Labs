package prob3.EmployeeInfo;

public class RetirementAccount extends Account {
private final static double WITHDRAWAL_PENALTY_PERCENTAGE = 5.0;
	
	public RetirementAccount(Employee emp, double balance){
		super(emp,balance);
	}
	
	@Override
	public AccountType getAccountType(){
		return AccountType.RETIREMENT;
	}
	@Override
	public boolean makeWithdrawal(double amount) {
		// implement
		if (amount > this.balance) {
			return false;
		}
		this.balance = this.balance - this.balance * WITHDRAWAL_PENALTY_PERCENTAGE;
		this.balance -= amount;
		return true;
	}


}
