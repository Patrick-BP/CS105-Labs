package chapter7.Lab11;

import java.util.*;
public class CountFamiles {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter number of families");
		int famNum = key.nextInt();
		double[] famIncomes = new double[famNum];
		
		
		PopulateArray(famIncomes);
		
		showArray(famIncomes);
		
		findLowIncomes(famIncomes);	
		
		key.close();
	}
	
	public static void PopulateArray(double[] x) {
		Scanner key = new Scanner(System.in);
		for(int i = 0; i< x.length; i++) {
			System.out.println("Enter income for : " + i);
			x[i] = key.nextDouble();
		}
		key.close();
	}
	
	public static void showArray(double[] x) {
		System.out.print("[ ");
		for(int i = 0; i< x.length; i++) {
			
			System.out.print( x[i] + " " );
			
		}
		System.out.println(" ]");
	}
	public static void findLowIncomes(double[] x) {
		double max = x[0];
		int count = 0;
		double maxtenpercent = max * 0.1;
		System.out.println("10% of maximum income is : " + maxtenpercent);
				
		for(int i = 0; i < x.length; i++) {
			if(x[i] < maxtenpercent) count++;
		}
		System.out.println(count + " family member is making less than 10% of $" + max);
		for(int i = 0; i < x.length; i++) {
			if(x[i] > max) max = x[i];
		}

	}

}
