package unit1;

import java.util.Scanner;

/**
 * Description: Calculates and displays the cost of a carpet in a rectangular
 * room. Date: 07/10/24
 * 
 * @author Luca Tarcea
 */
public class Carpet {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaring variables
		int carpet;
		int length;
		int width;
		int cost;
		
		// Scans and assigns variables
		System.out.println("Type in the length of the room in metres and <Enter>");
		length = sc.nextInt();
		System.out.println("Type in the width of the room in metres and <Enter>");
		width = sc.nextInt();
		System.out.println("Type in the cost of the carpet per square-metre and <Enter>");
		cost = sc.nextInt();
		// Calculates variables
		carpet = length * width * cost;
		
		// Prints final statement
		System.out.println("The cost of the carpet is $" + carpet + ".");

	}

}