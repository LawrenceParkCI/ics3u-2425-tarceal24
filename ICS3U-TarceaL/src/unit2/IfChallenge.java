package unit2;

import java.util.Scanner;

/**
 * Description: If, else, and else if statement practice
 * Date: 05/11/24
 * @author Luca Tarcea
 */

public class IfChallenge {
	/**
	 * Entry point to the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 
		 * (IF)
		 * 
		 * ask for the user's favourite number. if the number is negative, say that they
		 * need to look on the bright side. If their number is odd, say that it's a bit
		 * strange.
		 * 
		 * (IF, ELSE)
		 * 
		 * If their number is divisible by 3 and by 2, say that they should really
		 * consider thinking about 6, otherwise say they can keep wholesome.
		 * 
		 * (IF, ELSE IF, ELSE)
		 * 
		 * Finally, if the ones digit of the number is 8, say that you too are full, if
		 * the ones digit is 9, say Canada is a nice country, and any other number
		 * should result in "don't count on it".
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your favourite number.");
		int favourite = in.nextInt();
		if (favourite < 0) {
			System.out.println("You need to look on the bright side!");
		}
		if (favourite % 2 == 1) {
			System.out.println("That a bit strange.");
		} 
		if (favourite % 3 == 0 && favourite % 2 == 0) {
			System.out.println("You really should consider picking six.");
		} else {
			System.out.println("Keep wholesome.");
		}
		if (favourite % 10 == 8) {
			System.out.println("I am too full.");
		} else if (favourite % 10 == 9) {
			System.out.println("Canada is a nice country.");
		} else {
			System.out.println("That doesn't count.");
		}
		in.close();
	}
}