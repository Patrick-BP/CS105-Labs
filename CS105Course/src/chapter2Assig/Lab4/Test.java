package chapter2Assig.Lab4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a whole number greater than 0. \nI will find a combination of coins \nthat equals that amount of change. ");
		int num , origNum, remain ,dollars, hDollars, quaters, dimes, nickels, pennies ;
		num = keyboard.nextInt();
		origNum = num;
		System.out.println(num +" cents in coins can be given as: ");
		dollars = num/100;
		System.out.println(dollars  +" dollars ");
		remain = (origNum % 100 );
		System.out.println("remain = " + remain);
		hDollars = remain / 50;
		System.out.println(hDollars +" halfDollars ");
		remain = remain % 50;
		System.out.println("remain = " + remain);
		quaters = remain / 25;
		System.out.println(quaters +" quaters ");
		remain = remain % 25;
		System.out.println("remain = " + remain);
		dimes = remain / 10;
		System.out.println(dimes +" dimes");
		remain = remain % 10;
		System.out.println("remain = " + remain);
		nickels = remain /5;
		System.out.println(nickels +" nickels");
		
		remain = remain % 5;
		System.out.println("remain = " + remain);
		pennies = remain /1;
		System.out.println(pennies +" pennis");
		keyboard.close();

	}

}
