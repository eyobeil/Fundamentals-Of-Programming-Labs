package prog4;

public class Rectangle {
	private double width;
	private double length;
	private double area;
public Rectangle(double width, double length ){
	this.width=width;
	this.length=length;	
}
public double computeArea(){
	area=(width * length);	
	return area;
}
public double getWidth(){
	return width;
}
public double getLength(){
	return length;	
}


}
