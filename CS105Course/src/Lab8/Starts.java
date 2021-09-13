package Lab8;

import java.util.Scanner;

public class Starts {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = keyboard.nextInt();
		
		for(int i =0; i<=n; i++) {
			System.out.println();
			for(int k=0; k<i; k++ ) {
				System.out.print("*");
			}
		}
		keyboard.close();
	}

}
