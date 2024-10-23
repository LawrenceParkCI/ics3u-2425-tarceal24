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
		double carpet;
		double length;
		double width;
		double cost;
		double area;

		// Scans and assigns variables
		System.out.println("Type in the length of the room in metres and <Enter>");
		length = sc.nextDouble();
		System.out.println("Type in the width of the room in metres and <Enter>");
		width = sc.nextDouble();
		System.out.println("Type in the cost of the carpet per square-metre and <Enter>");
		cost = sc.nextDouble();
		sc.close();
		// Calculates variables
		area = length * width;
		carpet = area * cost;

		// Prints final statement
		System.out.println("\nThe size of the carpet is " + area + " m^2");
		System.out.println("\nThe cost of the carpet is $" + carpet + ".");

	}

}