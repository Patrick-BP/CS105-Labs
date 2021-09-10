package chapter5;

public class TernaryOperator {

	public static void main(String[] args) {
		double amount = 110.56;
		
		String msg = amount >= 100 ? "You are qualified for 5% discount" : "you are not qualified for 5% discount";
		System.out.println(msg);
	}

}
