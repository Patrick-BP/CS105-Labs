package chapter2Assig.Lab4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int n = 5,
				number = 1,
				sum = 0;
				for(int i = 0; i < n; i++)
				{
				sum += number;
				number += 2;
				}
				System.out.println("Sum of 1st " + n + " positive odd ints is: " + sum);
				
	}

}
