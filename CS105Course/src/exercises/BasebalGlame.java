package exercises;
import java.util.*;
public class BasebalGlame {

	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);
	       
		 System.out.println("Enter the number of innings : " );
		             int innings  = reader.nextInt();        
		            int team1Total =0;
		            int team2Total = 0;
		             for( int inning=1; inning <= innings; inning++){
		                 System.out.println("How many runs were scored in inning " 
		                         + inning + " by each team?");
		                  team1Total = team1Total + reader.nextInt();
		                  team2Total = team2Total + reader.nextInt();
		             }
		             System.out.println("The first team scored: " + team1Total 
		                     + " and the second team scored: " + team2Total); 
		
	}

}
