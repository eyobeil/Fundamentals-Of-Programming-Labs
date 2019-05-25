package prog4;

public class Main {
	public static void main(String[] args) {
	
		Rectangle figure1=new Rectangle(5,8); 
	    Circle figure2=new Circle(8);
	    Triangle figure3=new Triangle(12,8);
	    double areaOfRectangle=figure1.computeArea();
	    double areaOfCircle=Circle.computeArea();
	    double areaOfTriangle=Triangle.computeArea();
	    Triangle figure4=new Triangle(5,10,12);
	    double areaOfTriangle2=figure4.computeArea();
	System.out.println("Area of Rectangle is: "+ areaOfRectangle+
			            "\n"+"Area of Circle is: "+areaOfCircle+
			            "\n"+ "Area of Triangle is: "+areaOfTriangle+
			            "\n"+ "Area of Triangle with three sides is: "+areaOfTriangle2);

}
}