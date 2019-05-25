package Prog6Case3;

import java.util.GregorianCalendar;

public class PersonWithJob {
	private double salary;
	Person person;
	PersonWithJob(String aName, GregorianCalendar dob, double asalary) {
		this.person=new Person(aName,dob);
		salary = asalary;
	}
	public 	Person getPerson() {
		return this.person;
	}
	@Override
	public boolean equals(Object withJob) {
		if(withJob==null) {
			return false;
		}
		if(!(withJob instanceof PersonWithJob)) {
			return false;
		}
		PersonWithJob p= (PersonWithJob)withJob;
	boolean isEqual= this.getPerson().getName().equals(p.getPerson().getName())&&
			this.salary==p.salary&&this.getPerson().getDateOfBirth().equals(p.getPerson().getDateOfBirth());
	return isEqual;
	}
}
