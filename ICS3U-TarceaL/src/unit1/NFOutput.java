package unit1;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Description: Practice using NumberFormat to display values
 * Date: 17/10/24
 * @author Luca Tarcea
 */
public class NFOutput {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		// How can you change how your value is displayed?
		/*
		 * getCompactNumberInstance(): present the data in a compact way (a short) with
		 * no decimals
		 * getNumberInstance(): present the way it is formatted
		 * in this case, a double
		 * getInstance(): this is the same as calling getNumberInstance
		 * getIntegerInstance(): present the data as an integer
		 */
		// What other formats does NumberFormat offer?
		NumberFormat.getCompactNumberInstance();
		NumberFormat.getNumberInstance();
		NumberFormat.getInstance();
		NumberFormat.getIntegerInstance();

		sc.close();
	}

}
