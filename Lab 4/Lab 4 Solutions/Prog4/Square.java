package Prog4;

public class Square extends ClosedCurve implements Polygon {
private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	@Override
	public double computeArea() {
		return side * side;
	}
	@Override
	public int getNumberOfSides() {
		return 4;
	}
	@Override
	public double computePerimeter() {
		return 4*side;
	}
}
