package chapter5.Constructors;

public class TestConstructors {
	
private double length, width;
	
	public TestConstructors(double l, double w) {
		
		length = l ;
		width = w;
			
	}
public TestConstructors() {
		
		length = 0.0;
		width = 0.0;
			
	}
	public double area() {
		
		double a = length * width;
		System.out.println("area is " + a);
		return a;
	}
	
	public double perimeter() {
		double p = 2 * (length + width);
		System.out.println("perimeter is " + p);
		return p;
	}


}
