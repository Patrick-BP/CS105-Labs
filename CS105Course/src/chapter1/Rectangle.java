package chapter1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int len, breath;
		int area, perimeter;
		
		System.out.println("Enter the len of the rectangle:");
		
		len = keyboard.nextInt();
		System.out.println("Enter the perimeter of the rectangle: ");
		
		breath = keyboard.nextInt();
		
		area = len * breath;
		perimeter = 2 * (len + breath);
		
		System.out.println("the are of the rectangle is = " + area);
		
		
		System.out.println("the perimeter of the rectangle is = " + perimeter);
		
		keyboard.close();

	}

}
