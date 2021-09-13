package chapter777;
import java.util.Scanner;
public class LuggageScale {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double weight;
		System.out.println("Enter your weight in pounds");
		weight = keyboard.nextDouble();
		
		if(weight <= 50 ) {
			System.out.println("No fee ");
		}
		else {
			System.out.println("you will be charged 5 Dollars");
		}
		keyboard.close();

	}

}
