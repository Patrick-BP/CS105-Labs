package Lab8;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a text");
		String text = keyboard.nextLine(),
				reverse = " ";
		int textlength = text.length();
		
		for(int i=textlength - 1; i >= 0; i--) {
			char charcter = text.charAt(i);
			reverse += charcter;
			
		}
		System.out.println(reverse);
		keyboard.close();
	}

}
