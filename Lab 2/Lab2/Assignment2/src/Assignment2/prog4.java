package Assignment2;

public class prog4 {

	public static void main(String[] args) {
		String mystring=Data.records;
		String[] splittedValue=mystring.split(":");
		for(String i:splittedValue) {
			System.out.println(i.split(",")[0]);

		}
	}}