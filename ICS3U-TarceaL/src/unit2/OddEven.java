package unit2;

import java.util.Scanner;

/**
 * Description: Checks for even numbers
 * Date: 01/11/24
 * @author Luca Tarcea
 */
public class OddEven {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type an integer and <Enter>");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is even.");
		} else {
			System.out.println(num + " is odd.");
		}
		sc.close();
	}
}