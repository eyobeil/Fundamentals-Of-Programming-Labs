package Prog5;

public class Test {
	public static void main(String[] args) {
		Polygon[] objects = {new Rectangle(3,4),new Triangle(4,5,6),new Square(3)};
		//compute areas
		for(Polygon cc : objects) {
			String instances=cc.getClass().getSimpleName();
			System.out.println("For this "+ instances+"\n Perimeter= "+ cc.computePerimeter());

		}

	}

}
