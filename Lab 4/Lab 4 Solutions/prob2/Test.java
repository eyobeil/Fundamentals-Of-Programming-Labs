package prob2;

public class Test {

	public static void main(String[] args) {
		ClosedCurve[] objects = {new Triangle(4,5,6),new Square(3), new Rectangle(3,7),new Circle(3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			String instances=cc.getClass().getSimpleName();
			System.out.println("The area of this "+ instances+" is "+ cc.computeArea());

		}

	}


}

