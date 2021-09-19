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
		
		System.out.print("[ ");
		for(int i = 0; i<store.length; i++) {
			
			System.out.print(store[i] + " " );
			
		}
		System.out.println(" ]");
		
		
		int min = store[0];
		
		for(int i = 0; i < store.length; i++) {
			if(store[i] < min) min = store[i];
		}
		System.out.println("the smallest number is : " + min);
		key.close();
	}

}