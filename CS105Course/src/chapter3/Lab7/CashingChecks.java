package chapter3.Lab7;
import java.util.Scanner;
public class CashingChecks {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amount ");
		double amount  = keyboard.nextInt();
		double charges = 0;
		
		if(amount < 10) {
			charges = 1; 
		
		}
		else if((amount >= 10) && (amount < 100)) {
			charges = amount * 0.1; 	
			
		}
		else if((amount >= 100) && (amount < 1000)) {
			charges = (amount * 0.05) + 5; 	
			
		}
		else{
			charges = (amount * 0.01) + 40; 
				
		}
		System.out.println("service charge is $" + charges  );
		keyboard.close();

	}

}
