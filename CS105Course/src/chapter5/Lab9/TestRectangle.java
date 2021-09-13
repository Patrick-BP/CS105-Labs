package chapter5.Lab9;

public class TestRectangle {
	
	private double length, width;
	
	public void setDimension(double l, double w) {
		
		length = l ;
		width = w;
			
	}
	
	public double area() {
		
		double a = length * width;
		System.out.println("area is " + a);
		return a;
	}
	
	public double perimeter() {
		double p = 2 * (length * width);
		System.out.println("perimeter is " + p);
		return p;
	}

}
