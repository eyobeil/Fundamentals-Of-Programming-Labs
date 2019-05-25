package prob1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	private double overtimeHours;
	public double getOvertimeHours() {
		return overtimeHours;
	}
	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	Secretary(String name, double salary, int aYear, int aMonth, int aDay){
		super(name,salary,aYear, aMonth, aDay);
		}

	
	@Override
	public double computeSalary() {
		return super.computeSalary()+12*overtimeHours;
	}



}
