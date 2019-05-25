package prob3.EmployeeInfo;

public class ChekingAccount extends Account{
	private final static double READ_BALANCE_CHARGE = 5.0;
	public ChekingAccount(Employee emp, double balance){
		super(emp,balance);
	}
	
	@Override
	public AccountType getAccountType(){
		return AccountType.CHEKING;
	}
	@Override
	public double getBalance() {
		this.balance-= READ_BALANCE_CHARGE;
		return this.balance;
	}

}
