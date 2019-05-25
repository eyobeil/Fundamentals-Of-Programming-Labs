package pro2;
import java.util.*;
public class Main {


	public static void main(String[] args) {
		Employee employee1=new Employee("Adam",2014,3,12);
		Employee employee2=new Employee("Smith",2008,10,11);
		System.out.println("See a report of all account balance? (y/n)" );
		Scanner sc=new Scanner(System.in);
		employee1.createNewChecking(12500.0);
		employee1.createNewSavings(4000);
		employee1.createNewRetirement(2111);
		employee2.createNewChecking(33331.5);
		employee2.createNewSavings(14000);
		employee2.createNewRetirement(50000);
		if (sc.next().equals("y")){
			System.out.println(employee1.getFormattedAcctInfo());
			System.out.println(employee2.getFormattedAcctInfo());
		}
		else
		{
			// do nothing...the application ends here

		}


	}
}


