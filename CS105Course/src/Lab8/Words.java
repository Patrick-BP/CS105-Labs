package Lab8;
import java.util.Scanner;
public class Words {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Please enter a word ending with done");
		while(true) {
			
			String input = keyboard.next();
			boolean j = input.startsWith("");
			boolean k = input.endsWith("");
			if ()) {
				System.out.println("the word " + input + " has the first and last character that are the same");
				continue;
				
			}
				
			if(input.startsWith("d") && (input.endsWith("e"))) {
				break;
			}
			
			
		}	
		System.out.println("Loop stopped to receive input");
		keyboard.close();
	}

	

}
