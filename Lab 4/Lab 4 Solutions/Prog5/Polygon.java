package Prog5;

public interface Polygon {
	public double[] getArrayOfSides();
	public static double sum(double[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	default double computePerimeter() {
		return sum(getArrayOfSides());
	}
}
