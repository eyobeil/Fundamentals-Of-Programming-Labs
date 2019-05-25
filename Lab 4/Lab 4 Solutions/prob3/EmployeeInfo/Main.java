package prob3.EmployeeInfo;

import java.util.Scanner;

public class Main {
	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		// for phase I – console output
		Scanner sc = new Scanner(System.in);
		String empStringIndex;
		int empIndex;
		String acctStringIndex;
		int actIndex;
		String amtString;
		double amt;
		boolean loop = true;
		while (loop) {
			System.out.print("A See a report of all accounts ");
			System.out.print("B Make a Deposit ");
			System.out.print("C Make a withdrawal ");
			System.out.print("Make a selection (A/B/C) ");

			String answer = sc.next();
			switch (answer) {
			case "A":
				String info = getFormattedAccountInfo();
				// display info to console
				System.out.println(info);
				break;
			case "B":
				for (int i = 0; i < emps.length; i++) {
					System.out.println(i + ". " + emps[i].getName());
				}
				;
				System.out.println("Select An Employee Number");
				empStringIndex = sc.next();
				try{
					empIndex = Integer.parseInt(empStringIndex);	
				}
				catch(Exception ex){
					loop = false;
					break;
				}				
				for (int i = 0; i < emps[empIndex].getAccountList().size(); i++) {
					System.out.println(i + ". " + emps[empIndex].getAccountList().get(i).getAccountType().toString());
				}
				System.out.println("Select An Account Number");
				acctStringIndex = sc.next();
				try{
					actIndex = Integer.parseInt(acctStringIndex);	
				}
				catch(Exception ex){
					loop = false;
					break;
				}
				
				System.out.println("Deposit Amount: ");
				amtString = sc.next();
				try{
					amt = Double.parseDouble(amtString);	
				}
				catch(Exception ex){
					loop = false;
					break;
				}				
				emps[empIndex].getAccountList().get(actIndex).makeDeposit(amt);
				System.out.println("$" + amt + " has been deposit in the "
						+ emps[empIndex].getAccountList().get(actIndex).getAccountType().toString() + " of "
						+ emps[empIndex].getName());
				break;
			case "C":
				for (int i = 0; i < emps.length; i++) {
					System.out.println(i + ". " + emps[i].getName());
				}
				;
				System.out.println("Select An Employee Number");
				empStringIndex = sc.next();
				try{
					empIndex = Integer.parseInt(empStringIndex);	
				}
				catch(Exception ex){
					loop = false;
					break;
				}
				for (int i = 0; i < emps[empIndex].getAccountList().size(); i++) {
					System.out.println(i + ". " + emps[empIndex].getAccountList().get(i).getAccountType().toString());
				}
				System.out.println("Select An Account Number");
				acctStringIndex = sc.next();
				try{
					actIndex = Integer.parseInt(acctStringIndex);	
				}
				catch(Exception ex){
					loop = false;
					break;
				}
				System.out.println("Withdraw Amount: ");
				amtString = sc.next();
				try{
					amt = Double.parseDouble(amtString);	
				}
				catch(Exception ex){
					loop = false;
					break;
				}
				boolean isWithdrawed = emps[empIndex].getAccountList().get(actIndex).makeWithdrawal(amt);
				if (isWithdrawed) {
					System.out.println("$" + amt + " has been withdrawed from the "
							+ emps[empIndex].getAccountList().get(actIndex).getAccountType().toString() + " of "
							+ emps[empIndex].getName());
				} else {
					System.out.println("$" + amt + " could not be withdrawed from the "
							+ emps[empIndex].getAccountList().get(actIndex).getAccountType().toString() + " of "
							+ emps[empIndex].getName());
				}
				break;
			default:
				loop = false;
				break;
			}
		}

		sc.close();
	}

	String getFormattedAccountInfo() {
		// implement
		if (null == emps)
			return null;
		StringBuilder sb = new StringBuilder();
		for (Employee emp : emps) {
			sb.append(emp.getFormattedAcctInfo());
		}
		return sb.toString();
	}
}
