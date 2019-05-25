package prob2;

import java.util.Comparator;

public class Rational  implements Comparator<Rational>{

		// Data fields for numerator and denominator
		private int numerator ;
		private int denominator;
	
	 /** Construct a rational with default properties */
	     public Rational(int p, int q) {
	    	 if(q<0) throw new IllegalArgumentException(" Negative denominotor");
	         this.numerator=p;
	         this.denominator=q;
	         
	 }
		 public int getNumerator() {
			  return numerator;
			  }
			  public int getDenominator() {
			  return denominator;
			  }
			 public Rational add(Rational secondRational) {
			  int n = numerator * secondRational.getDenominator() +
			  denominator * secondRational.getNumerator();
			  int d = denominator * secondRational.getDenominator();
			  return new Rational(n, d);
			  }
			 public Rational subtract(Rational secondRational) {
			  int n = numerator * secondRational.getDenominator()- denominator * secondRational.getNumerator();
			  int d = denominator * secondRational.getDenominator();
			 return new Rational(n, d);
			}
			  public Rational multiply(Rational secondRational) {
			  int n = numerator * secondRational.getNumerator();
			  int d = denominator * secondRational.getDenominator();
			  return new Rational(n, d);
			  }
			 
			  /** Divide a rational number by this rational */
			  public Rational divide(Rational secondRational) {
			  int n = numerator * secondRational.getDenominator();
			  int d = denominator * secondRational.numerator;
			  return new Rational(n, d);
			  }
			
			 @Override
			public String toString() {
			  if (denominator == 1)
			 return numerator + "";
			else
			 return numerator + "/" + denominator;
			 }
			 
			 @Override // Override the equals method in the Object class
			  public boolean equals(Object other) {
				 if(other==null) return false;
				 if(!(other instanceof Rational))
			 return false;
				 Rational rat=(Rational)other;
				 return this.getNumerator()*rat.getDenominator()==this.getDenominator()*rat.getNumerator();
			  }
	         @Override
			public int compare(Rational o1, Rational o2) {
				if(o1.getNumerator()*o2.getDenominator()>o1.getDenominator()*o2.getNumerator()) return 1;
				if(o1.getNumerator()*o2.getDenominator()<o1.getDenominator()*o2.getNumerator()) return -1;
				return 0;
			}
		public static void main(String[] args) {
			Rational a= new Rational(2,3);
			Rational b= new Rational(-17,5);
			Rational c= new Rational(1,3);
			Rational d=c.add(a.multiply(b));
			Rational e=a.multiply((b.add(c)));
			System.out.println(d);
			System.out.println(e);
			System.out.println(d.getNumerator()*e.getDenominator()>e.getNumerator()*d.getDenominator());
			
		}	
			 
			 
}
