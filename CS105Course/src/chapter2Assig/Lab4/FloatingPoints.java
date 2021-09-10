package chapter2Assig.Lab4;
import java.util.Scanner;
public class FloatingPoints {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x ;
		System.out.println("Enter a number between 2e-11 and 2e11:");
		x = keyboard.nextFloat();
		double y = 1.0 / x;
		System.out.println("x = " + x + "\ny = " +y + "\nthe product of x , y = " + x*y);
		double product = x * y;
		product= product--;
		System.out.println("product of (x, y) - 1  = " + product);
		keyboard.close();
	}

}