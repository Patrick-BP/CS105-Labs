package chapter5;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a int number");
		int num = keyboard.nextInt();
		System.out.println(" With a While Loop");
		// While loop
		int i = num;
		while(i >0) {
			System.out.println(i + " ");
			i--;
		}
		System.out.println(" With a Do-While Loop");
		// Do-While
		int k = num;
		do {
			System.out.println(k + " ");
			k--;
		}while(k > 0);
		
		System.out.println(" With a For Loop");
		//For Loop
		
		for(int j = num; j >0 ; j--) {
			
			System.out.println(j + " ");
		}
		keyboard.close();
	}
}
