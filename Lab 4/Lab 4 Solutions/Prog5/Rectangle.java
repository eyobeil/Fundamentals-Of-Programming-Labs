package Prog5;

public final class Rectangle extends ClosedCurve implements Polygon{
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
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		return new double[] {width,width,length,length};
	}

	

	

}
