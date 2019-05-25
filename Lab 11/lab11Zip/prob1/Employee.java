package prob1;

import java.util.HashMap;
import java.util.Iterator;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap salaryRecord;

	public Employee() {
		salaryRecord = new HashMap();
	}

	public void addEntry(String date, double salary) {
		salaryRecord.put(date, salary);
	}

	public void printPaymentAmount(String date) {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getFirstName()).append(" ").append(this.lastName).append(" ");
		if (!salaryRecord.containsKey(date)) {
			sb.append("did not recieve a paycheck on ");
		} else {
			sb.append("was paid ").append(String.format("%.1f on ", (double) salaryRecord.get(date)));
		}
		sb.append(date);
		System.out.println(sb.toString());
	}

	public void printAveragePaycheck() {
		double salarySum = 0;
		for (Object o : salaryRecord.keySet()) {
			String s = (String) o;
			salarySum += (double) salaryRecord.get(s);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("Average paycheck for ").append(this.getFirstName()).append(" ").append(this.getLastName())
				.append(" was ").append(String.format("%.1f", salarySum / salaryRecord.size()));
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for (int i = 1; i <= 12; ++i) {
			e.addEntry(i + "/15/2011", 3070 + 5 * i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
