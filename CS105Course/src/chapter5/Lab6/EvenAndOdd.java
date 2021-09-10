package chapter5.Lab6;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an int number");
		int x = keyboard.nextInt();
		
		if(x % 2 == 0) {
			
			x = x / 2;
			System.out.println("x = " + x);
		}else {
			x = (x * 3) - 1;
			System.out.println("x = " + x);
			
		}
		keyboard.close();


	}

}
