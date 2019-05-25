package Prog4;

public class Rectangle extends ClosedCurve implements Polygon {
	private double width;
	private double length;
	public Rectangle(double width, double length) {
		this.width=width;
		this.length=length;
	}

	@Override
	double computeArea() {
		return length*width;
	}

	@Override
	public int getNumberOfSides() {
		return 4;
	}

	@Override
	public double computePerimeter() {
		return 2*width+2*length;
	}

}
