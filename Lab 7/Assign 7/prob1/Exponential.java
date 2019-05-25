package prob1;

public class Exponential {
	public double power(double x,int n) {
		if(n==1) return x;
		return x*power(x,n-1);
		}
	public static void main(String[] args) {
		System.out.println(new Exponential().power(2, 10));
	}

}
