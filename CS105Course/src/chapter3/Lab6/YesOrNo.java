package chapter3.Lab6;
import java.util.Scanner;
public class YesOrNo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter yes or No");
		String response = keyboard.next();
		
		if(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
			
			System.out.println("true");
		}else {
			
			System.out.println("false");
		}
		keyboard.close();

	}

}
