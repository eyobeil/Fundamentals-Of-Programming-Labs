package prob1;

import java.time.LocalDate;

public class Professor extends DeptEmployee{

private int numberPfPublications;
public int getNumberPfPublications() {
	return numberPfPublications;
}
public void setNumberPfPublications(int numberPfPublications) {
	this.numberPfPublications = numberPfPublications;
}
Professor(String name, double salary, int aYear, int aMonth, int aDay){
	super(name,salary,aYear,aMonth,aDay);
}
}
