package prob3.EmployeeInfo;

public class Account implements Comparable<Account> {
	private final static double DEFAULT_BALANCE = 0.0;
	protected double balance;
	private AccountType acctType;
	protected Employee employee;

	Account(Employee emp, double balance) {
		this.employee = emp;
		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	public AccountType getAccountType() {
		return this.acctType;
	}

	public double getBalance() {
		return this.balance;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public String toString() {
		return String.format("%nAccount Type: %6s %nCurrent bal: %.1f %n", getAccountType().toString(), balance);
	}

	public void makeDeposit(double deposit) {
		// implement
		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if (amount > this.balance) {
			return false;
		}
		this.balance -= amount;
		return true;
	}

	@Override
	public int compareTo(Account act) {
		// TODO Auto-generated method stub
		if (null == this.employee || this.employee.getName().isEmpty()) {
			return 1;
		}
		if (null == act || null == act.getEmployee() || act.getEmployee().getName().isEmpty()) {
			return -1;
		}

		return this.employee.getName().compareTo(act.getEmployee().getName());
	}
	
}
