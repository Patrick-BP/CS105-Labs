package ClassPractice;

public class ComputerTest {

	public static void main(String[] args) {
		Computer comp1 = new Computer();
		
		System.out.println(comp1.toString());
		
		comp1.setRamSize(8);
		System.out.println(comp1.toString());
		
		
		Computer comp2 = new Computer();
		
		comp2.setRamSize(8);
		System.out.println( comp1.equal(comp2));

	}

}
