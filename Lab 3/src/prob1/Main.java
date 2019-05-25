package prob1;

public class Main {

	public static void main(String[] args) {
		Employee employee=new Employee("Smith","Jimmy",3700,2018,02,12);
		Account cheking=new Account(employee,AccountType.CHEKING,300);
		Account saving=new Account(employee,AccountType.SAVING,300);
		Account retirement=new Account(employee,AccountType.RETIREMENT,300);
		System.out.println(cheking.tostring());
		System.out.println(saving.tostring());
		System.out.println(retirement.tostring());
		
	}

}
