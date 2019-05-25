package Assignment2;

public class Prog5 {

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		sc.close();
		reverse(input);

	}
	public static void reverse(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));;
		}


	}

}
