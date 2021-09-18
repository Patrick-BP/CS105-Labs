package ClassPractice;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = key.nextInt();
		int even = 0;
		int odd = 0;
		
		
	if(num%2 ==0)
		even +=num;
	else
		odd +=num;
	
	System.out.println("do you want to continue? y/n");
	String x = key.next();
	if(x.equals("y")) {
		while(true) {
			num = key.nextInt();
			if(num%2 ==0)
				even +=num;
			else
				odd += num;
			
				
		}
		
	}
	else
		System.out.println(even +" " + odd);

	}

}
