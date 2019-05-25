package Assignment2;

public class prog2 {

	public static void main(String[] args) {
		int x= RandomNumbers.getRandomInt(1, 9);
		System.out.println(Math.pow(Math.PI, x));
		int y= RandomNumbers.getRandomInt(3, 14);
		System.out.println(Math.pow(y, Math.PI));
	}

}
