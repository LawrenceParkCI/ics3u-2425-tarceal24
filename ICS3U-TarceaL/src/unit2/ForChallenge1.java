package unit2;

import java.util.Scanner;

/**
 * Description: Count from start to end
 * Date: 25/11/24
 * @author Luca Tarcea
 */

public class ForChallenge1 {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Create a program that asks for the starting number, the ending number, and
		 * how much you should count by. Then print out the numbers using a for loop.
		 * You should be able to count by decimals. ie.
		 * 
		 * Starting Num: 0 Ending Num: 1 Count by: 0.1 Result: 0 0.1 0.2 0.3 0.4 0.5 0.6
		 * 0.7 0.8 0.9 1.0
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a starting number and <Enter>");
		double num = sc.nextDouble();
		System.out.println("Choose an ending number and <Enter>");
		double end = sc.nextDouble();;
		System.out.println("Choose a number to count by and <Enter>");
		double count = sc.nextDouble();
		
		for (int i = 0; i <= end; i++) {
			System.out.println(num);
			num = Math.rint(10 * (num + count))/10;
		}
		
		sc.close();

	}
}