package prog4;

public class Triangle {
	private static double base;
	private static double height;
	private static double area;
	private static double side1;
	private static double side2;
	private static double side3;

	public Triangle (double base, double height){
		this.base=base;
		this.height=height;

	}
	public Triangle (double side1, double side2, double side3){
		this.base=side1;
		double s=(side1+side2+side3)/2;
		this.height=2*(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)))/side1;
	}

	public static double computeArea(){
		area=0.5*base*height;
		return area;
	}
	public double getBase(){
		return base;
	}
	public double getHeight(){
		return height;
	}
}
