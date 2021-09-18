package ClassPractice;
import java.util.Scanner;
public class SentinelValue {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter a series of  numbers");
		int product = 1;
		int input = keyboard.nextInt();
		while(input !=0) {
			product = product * input;
			input = keyboard.nextInt();	
			
		}
		
		System.out.println(product);
		}
		
	}
	


