package Lab6;
import java.util.Scanner;
public class GradeConvertor {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char input; 
		System.out.println("Enter you a character");
		String c = keyboard.next();
		input = c.toUpperCase().charAt(0);
		double grade =0;
		  switch (input) { 
		  
			case 'A':
				
				grade = 4.0;
				break;

			case 'B':
				grade = 3.0;
				break;

			case 'C':
				grade = 2.0;
				break;

			case 'D':
				grade = 1.0;
				break;

			case 'F':
				grade = 0.0;
				break;

			default: 
				System.out.println("Incorrect Letter grade");
				break;
		
		  
		  }
		 
		  System.out.println("your grade value is " + grade);
		keyboard.close();

	}

}
