package chapter7.Lab11;

import java.util.*;

public class CountFamiles {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter number of families");
		int famNum = key.nextInt();
		
		double[] famIncomes = new double[famNum];
		
		for(int i = 0; i< famIncomes.length; i++) {
			System.out.println("Enter income for : " + i);
			famIncomes[i] = key.nextDouble();
		}
		System.out.println(Arrays.toString(famIncomes));
		
		
		double max = famIncomes[0];
		double min = famIncomes[0];
		
		for(int i = 0; i < famIncomes.length; i++) {
			if(famIncomes[i] > max) max = famIncomes[i];
		}
		
		System.out.println("maximum income is : " +max);
		int count = 0;
		double maxtenpercent = max * 0.1;
		System.out.println("10% of maximum income is : " + maxtenpercent);
				
		for(int i = 0; i < famIncomes.length; i++) {
			if(famIncomes[i] < maxtenpercent) count++;
		}
		System.out.println(count + " family member is making less than 10% of $" + max);
		
	}
}
