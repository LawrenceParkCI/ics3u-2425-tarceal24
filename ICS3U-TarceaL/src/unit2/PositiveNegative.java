package unit2;

import java.util.Scanner;

/**
 * Description: Tests if a number is positive and if it is divisible by 7
 * Date: 01/11/24
 * @author Luca Tarcea
 */
public class PositiveNegative {
	/**
	 * Entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type an integer and <Enter>");
		int num = sc.nextInt();
		if (Math.abs(num) == num) {
			System.out.println(num + " is positive");
		} else {
			System.out.println(num + " is negative");
		}
		if (num % 7 == 0) {
			System.out.println(num + " is divisible by 7");
		}
		sc.close();
	}
}
