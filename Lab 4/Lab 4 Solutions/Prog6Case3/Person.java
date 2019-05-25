package Prog6Case3;

import java.util.GregorianCalendar;

public class Person {
	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob==null) {
			return false;
		}
		if(!(ob instanceof Person)) {
			return false;
		}
		Person p= (Person)ob;
	boolean isEqual= this.name.equals(p.name)&&this.dateOfBirth.equals(p.dateOfBirth);
	return isEqual;
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		Person person1= new Person("Eyobeil", new GregorianCalendar(1989,12,06));
		PersonWithJob person2= new PersonWithJob("Eyobeil", new GregorianCalendar(1989,12,06),2300);
		System.out.println(person1.equals(person2));
		System.out.println(person2.equals(person1));
		}
}
