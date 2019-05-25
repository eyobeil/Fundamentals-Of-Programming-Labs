package prob3.EmployeeInfo;

import java.time.LocalDate;

public class Employee {
	private AccountList accounts;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		// new
		// GregorianCalendar(yearOfHire,monthOfHiyearOfHire,monthOfHire,dayOfHirere-1,dayOfHire);
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		accounts = new AccountList();
	}

	public String getName() {
		return this.name;
	}

	public LocalDate getHireDate() {
		return this.hireDate;
	}

	public AccountList getAccountList(){
		return this.accounts;
	}
	public void createNewChecking(double startAmount) {
		// implement
		Account act = new ChekingAccount(this, startAmount);
		accounts.add(act);
	}

	public void createNewSavings(double startAmount) {
		// implement
		Account act = new SavingAccount(this, startAmount);
		accounts.add(act);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		Account act = new RetirementAccount(this, startAmount);
		accounts.add(act);
	}

	public void deposit(int accountIndex, double amt) {
		// implement
	   Account selectedAccount = accounts.get(accountIndex);
	   selectedAccount.makeDeposit(amt);
	}

	public boolean withdraw(int accountIndex, double amt) {
		// implement
		Account selectedAccount = accounts.get(accountIndex);
		return selectedAccount.makeWithdrawal(amt);
	}

	public String getFormattedAcctInfo() {
		// implement
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%nACCOUNT INFO FOR %s", name));

        for(int counter=0; counter < accounts.size();counter++){
        	sb.append(accounts.get(counter).toString());
        }
		return sb.toString();
	}

	  @Override
	    protected Object clone() throws CloneNotSupportedException {
	        Employee ret = new Employee(this.getName(),this.hireDate.getYear(),
	        		this.hireDate.getMonthValue(),this.hireDate.getDayOfMonth());
	        return ret;
	    }
}
	
