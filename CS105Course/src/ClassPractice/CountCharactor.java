package ClassPractice;

import java.util.Scanner;

public class CountCharactor {
	public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter a word");
	
	String input = keyboard.next();

	 int count = 0;
	 for(int i = 0; i<input.length()-1; i++ ) {
		 if(input.charAt(i) == 'a')
			 count++; 
		 
	 }
	 System.out.println("there is " + count + "a");
	
	}
}
