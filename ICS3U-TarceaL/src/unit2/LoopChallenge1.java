package unit2;

import java.util.Scanner;

/**
 * Description: Password checker
 * Date: 22/11/24
 * @author Luca Tarcea
 */

public class LoopChallenge1 {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Create a program that will ask for the password. If they answer incorrectly,
		 * tell them, and repeat. If they answer correctly, welcome them in.
		 * 
		 * Extra: if they don't give a proper answer within 3 Decide on whether you
		 * should use the while or do while loop.
		 */

		Scanner sc = new Scanner(System.in);
		String password = "";
		int count = 0;
		while (!password.equals("HelloWorld") && count < 3) {
			System.out.println("What is the password?");
			password = sc.next();
			count++;
		}

		if (password.equals("HelloWorld"))
			System.out.println("Correct password.");
		else if (count >= 3)
			System.out.println("Wrong password, try again later.");
		sc.close();
	}
}