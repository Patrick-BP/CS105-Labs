package chapter2Assig;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int F,C;
		
		System.out.println("Enter the temperature in Fahrenheit:");
		F = keyboard.nextInt();
		
		C = (5 * (F - 32))/9;
		
		System.out.println(F + " Fahrenheit = " + C + " celsus");
		
		keyboard.close();

	}

}
