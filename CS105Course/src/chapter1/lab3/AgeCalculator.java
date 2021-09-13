package chapter1.lab3;
import java.time.Year;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		System.out.println("Bithday Greetings.");
		
		Scanner keyboard = new Scanner(System.in);
		
		int num, currentYear, age;
		
		currentYear = Year.now().getValue();
		
		System.out.println("What year were you born in? ");
		num = keyboard.nextInt();
		
		age = currentYear - num;
		
		System.out.println("I can't beleive you are " + age + " years old");
		keyboard.close();

	}

}
