package Lab8;

import java.util.Scanner;

public class SumOfFirstOddNum {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = keyboard.nextInt();
		int i = 0,
		sum = 0,
		num = 1;
		while(i < n) {
			sum += num;
			num +=2;
			i++;
			
		}
			System.out.println("The First " +n + " positive odd intiger is: " + sum);
			keyboard.close();
	}

}
