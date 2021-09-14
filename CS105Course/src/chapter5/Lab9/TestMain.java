package chapter5.Lab9;

public class TestMain {

	public static void main(String[] args) {
		
		TestRectangle calculat = new TestRectangle();
		
		calculat.setDimension(50, 80);
		calculat.area();
		calculat.perimeter();
		
		System.out.println();
		
		TestRectangle calculat2 = new TestRectangle();
		
		calculat2.setDimension(34, 85);
		calculat2.area();
		calculat2.perimeter();


	}

}
