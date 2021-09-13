package chapter2.Lab4;
import java.util.Scanner;
public class TypeCasting {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number between 2e-11 and 2e11:");
		float x;
		int y;
		byte z;
		x = keyboard.nextFloat();
		y = (int)x; 
		System.out.println("x = " + x + "\ntype casting x to int value:  y = " + y);
		z = (byte) x;
		System.out.println("x = " + x + "\ntype casting x to byte value: z  = " + z);
		keyboard.close();
		
		
	}

}
