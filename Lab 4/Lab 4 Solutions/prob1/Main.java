package prob1;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	Professor a1= new Professor("Abraham",6000,2016,3,12);
	Professor a2= new Professor("Gabi",4000,2017,2,11);
	Professor a3= new Professor("Richard",5000,2014,2,7);
	Secretary sec1= new Secretary("Helen",2000,2011,02,13);
	Secretary sec2= new Secretary("Lidya",1000,2015,3,8);
	a1.setNumberPfPublications(10);
	a2.setNumberPfPublications(10);
	a3.setNumberPfPublications(10);
	sec1.setOvertimeHours(200);
	sec2.setOvertimeHours(200);
	DeptEmployee[] emp= new DeptEmployee[5];
	emp[0]=a1;
	emp[1]=a2;
	emp[2]=a3;
	emp[3]=sec1;
	emp[4]=sec2;
	Scanner sc= new Scanner(System.in);
	System.out.println("Do you wish to see the sum of all salaries in the department? Enter Y or N");
	String input =sc.nextLine();
	if(input.equals("Y")){
		double sum=0;
		for(DeptEmployee o: emp) {
			sum+=o.computeSalary();
		}
		System.out.println("the sum of all salaries is "+sum);
			}
	else { System.out.println("Exiting.....");
	System.exit(0);}
	
}
}
