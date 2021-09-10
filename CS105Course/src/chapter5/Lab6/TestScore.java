package chapter5.Lab6;
import java.util.Scanner;
public class TestScore {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a score in the range 0 to 100");
		int score = keyboard.nextInt();
		
		if((score >= 0) && (score <= 100)) {
			System.out.println("valide score range");
		}
		else {
			System.out.println("invalide score range");
		}
		keyboard.close();

	}

}
