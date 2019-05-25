package prob1;

import java.time.LocalDate;

public class DeptEmployee {
	private  String name;
	protected double salary;
	private LocalDate hireday;
	DeptEmployee(String name, double salary,int aYear, int aMonth, int aDay){
		this.name=name;
		this.salary=salary;
		hireday=LocalDate.of(aYear, aMonth, aDay);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHireday() {
		return hireday;
	}
	public void setHireday(LocalDate hireday) {
		this.hireday = hireday;
	}
	public double computeSalary() {
		return this.salary;
	}
	
}
