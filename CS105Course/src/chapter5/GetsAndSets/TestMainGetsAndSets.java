package chapter5.GetsAndSets;

public class TestMainGetsAndSets {

	public static void main(String[] args) {
		TestGetsAndSets calculat = new TestGetsAndSets(23, 25);
		
		
		calculat.area();
		calculat.perimeter();
		
		System.out.println();
		
		TestGetsAndSets calculat2 = new TestGetsAndSets();
		
		
		calculat2.area();
		calculat2.perimeter();



	}

}
