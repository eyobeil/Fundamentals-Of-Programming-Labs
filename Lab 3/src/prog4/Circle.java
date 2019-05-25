package prog4;

public class Circle {
	private static double radius;
	private static double area;
	
	public Circle(double radius){
		this.radius=radius;
	}
public static double computeArea(){
	area=Math.round(Math.PI * Math.pow(radius,2));
	return area;	
}
public double getRadius(){
	return radius;
}

}
