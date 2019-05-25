package Prog6Case2;

import java.util.GregorianCalendar;

public class PersonWithJob  extends Person{
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public boolean equals(Object withJob) {
		if(withJob==null) {
			return false;
		}
		if(withJob.getClass()!=this.getClass()) {
			return false;
		}
		PersonWithJob pwjob=(PersonWithJob)withJob;
	    boolean isEqual=this.getName().equals(pwjob.getName())&&this.getDateOfBirth().equals(pwjob.getDateOfBirth())
	    		&&this.salary==pwjob.salary;
	    return isEqual;
	}

}
