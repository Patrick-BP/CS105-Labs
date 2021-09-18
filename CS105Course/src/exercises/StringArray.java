package exercises;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a series of strings");
		
		
		String[] str = new String[5];
		
		for(int i=0; i< str.length; i++) {
			System.out.println("Enter string at index " + i + " :");
			String input = key.next();
			str[i] = input;
			
		}
		System.out.println("End");
		
		int count = 0;
		System.out.print("[ ");
		for(int k=0; k < str.length; k++ ) {
			System.out.print(str[k] + " ");
			
			if(str[k].charAt(0) == 'a' || str[k].charAt(0) == 'A' ) {
				count ++;
				continue;
			}
				
		}
		System.out.println(" ]");
		System.out.println(count);

	}

}
