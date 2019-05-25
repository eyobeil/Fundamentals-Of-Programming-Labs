package Prog4;

public class Circle extends ClosedCurve {
	private final double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double computeArea() {
		return (Math.PI * radius * radius);
	}

}
