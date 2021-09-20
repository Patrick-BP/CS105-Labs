package chapter7.Lab11;

import java.util.Scanner;

public class FlowerCounter {
	public static void main(String[] args) {
		String[] flowers = {"petunia", "pansy", "rose", "violet", "carnation"};
		double[] cost = {0.5, 0.75, 1.50, 0.50, 0.80};
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a flower name: ");
		String name = key.next();
		
		System.out.println("Enter a flower Quatity : ");
		int qty = key.nextInt();
		int flowerIndex =0;
		for(int i = 0; i< flowers.length; i++) {
			if(flowers[i].equals(name)) flowerIndex = i;
			
		}
		
		double totalCost = 0;
		String flowerName = "";
		double price=0;
		for(int i=0; i< cost.length; i++) {
			if(i == flowerIndex) {
				totalCost = cost[i] * qty;
			    flowerName = flowers[i];
			    price = cost[i];
			}
		}
		System.out.println( "flower :" + flowerName );
		System.out.println( "price : $" + price );
		System.out.println( "qty :" + qty );
		
		System.out.println( "Total cost : $"   + totalCost ); 
		key.close();
	}
	
	


}
