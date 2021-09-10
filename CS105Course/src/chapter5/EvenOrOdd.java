package chapter5;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num ;
		System.out.println("Enter a number between 1 and 100");
		num = keyboard.nextInt();
		
		if(num % 2 == 0 ) {
			
			System.out.println(num  + " is Even");
			
		}
		else {
			System.out.println(num + " is Odd");
		}
		keyboard.close();
	}
	

}
