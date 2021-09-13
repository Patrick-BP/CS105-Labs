package chapter2.Lab5;
import java.util.Scanner;
public class ChangeHateToLove {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String text;
		System.out.println("Enter a line of text");
		text = keyboard.nextLine();
		
		text = text.toLowerCase().replaceFirst("hate", "love");
		
		System.out.println(text);
		
		keyboard.close();
		

	}

}