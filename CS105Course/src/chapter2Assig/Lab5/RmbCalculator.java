package chapter2Assig.Lab5;
import java.util.Scanner;
public class RmbCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		final int calories =  230;
		double weight, height, rmbMale, rmbFemale, chocolateBarsM, chocolateBarsF;
		
		System.out.println("Enter your weight in pounds");
		weight = keyboard.nextDouble();
		System.out.println("Enter your height in inches");
		height = keyboard.nextDouble();
		System.out.println("Enter your age");
		age = keyboard.nextInt();
		
		
		rmbFemale = 655 + ( 4.3 * weight ) + (4.7 * height) - (4.7 * age);
		rmbMale = 66 + ( 6.3 * weight ) + (12.9 * height) - (6.8 * age);
		chocolateBarsM = rmbMale / calories;
		chocolateBarsF = rmbFemale / calories;
		
		System.out.println("To maintain your weight you should consume " + chocolateBarsM + " chocolate bars if you are a Male and " + chocolateBarsF + " chocolate Bars if you are a female" );
		
		keyboard.close();
	}

}
