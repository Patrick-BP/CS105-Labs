package chapter7.Lab11;


import java.util.*;

public class StoreNum {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = key.nextInt();
		int[] store = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter a number for index " + i);
			store[i] = key.nextInt();
			
		}
		
		showArray(store);
		
		smallestNum(store);
		
		
		
		key.close();
	}
	
	public static void showArray(int[] x) {
		System.out.print("[ ");
		for(int i = 0; i< x.length; i++) {
			
			System.out.print(x[i] + " " );
			
		}
		System.out.println(" ]");
	}
	
	public static void smallestNum(int[] x) {
		int min = x[0];
		for(int i = 0; i < x.length; i++) {
			if(x[i] < min) min = x[i];
		}
		System.out.println("the smallest number is : " + min);
	}

}