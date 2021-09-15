package chapter5.Constructors;

public class TestMainConstructors {

	public static void main(String[] args) {
		
			
		TestConstructors calculat = new TestConstructors(23, 25);
			
			
			calculat.area();
			calculat.perimeter();
			
			System.out.println();
			
			TestConstructors calculat2 = new TestConstructors();
			
			
			calculat2.area();
			calculat2.perimeter();


		}

	

}
