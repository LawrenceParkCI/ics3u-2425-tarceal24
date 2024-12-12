package unit2;

import java.util.Scanner;
/**
 * Description: Name Game
 * Date: 18/11/24
 * @author Luca Tarcea
 */
public class NameGame {
	/**
	 * Entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your name and <Enter>");
		String name = sc.next();
		int favourite = (int) (Math.random() * 11);
		if (favourite > 3) System.out.println("That is my favourite name.");
		else System.out.println("I hate that name.");
		sc.close();
	}
}
