package chapter2.Lab5;
import java.util.Scanner;
public class YourFavorites {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name, food, color, animal;
		
		System.out.println("What is your  first name?");
		name = keyboard.nextLine();
		System.out.println("What is your favorite food?");
		food = keyboard.nextLine();
		System.out.println("What is your favorite color?");
		color = keyboard.nextLine();
		System.out.println("What is your favorite animal?");
		animal = keyboard.nextLine();
		System.out.println("I had a dream that " + name + " ate a " + color +" " + animal +" and said it tasted like " + food + "!" );
		keyboard.close();
		

	}

}
