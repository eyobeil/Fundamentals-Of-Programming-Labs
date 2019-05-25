package prob3;

import java.util.Comparator;
import java.util.Date;

public class HireDateComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		String name1=e1.getName();
		String name2=e2.getName();
		Date hireDate1=e1.getHireDate();
		Date hireDate2=e2.getHireDate();
		double salary1=e1.getSalary();
		double salary2=e2.getSalary();
		
		if (hireDate1.compareTo(hireDate2)!=0){
			return hireDate1.compareTo(hireDate2);
		}
		//when hireDates are equal then compare the name
		
		if (name1.compareTo(name2)!=0){
			return name1.compareTo(name2);
		}
		// if hiredate and name are the same then compare salary
		if (salary1!=salary2){
			if (salary1<salary2){
				return -1;
			}
			else return 1;
			
		}
	
			return 0;
	}

}
