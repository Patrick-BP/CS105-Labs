package HackerRank;

import java.util.Scanner;

public class JavaLoopII {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            for(int j = 1; j<=n; j++) {
	            	int res =0;
	            	 res = res + j*b;
	            	 res = a + j*b;
	            	System.out.println(res);
	            
	            	}
	        }
	        in.close();
	}

}
