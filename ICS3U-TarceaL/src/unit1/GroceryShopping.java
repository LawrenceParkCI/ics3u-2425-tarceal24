package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Description: Grocery Shopping Application
 * Date: 23/10/24
 * 
 * @author Luca Tarcea
 */
public class GroceryShopping {

	public static void main(String[] args) {
		// Assigning global variables
		Scanner sc = new Scanner(System.in);
		String product;
		String dollar = " $";
		String payment;
		String dollarFormatting = "%-1s %10s";
		double apple = 1.19, banana = 0.79, bread = 3.49, eggs = 0.39, yogurt = 1.79, milk = 2.29;
		int appleAmount = 0, bananaAmount = 0, breadAmount = 0, eggsAmount = 0, yogurtAmount = 0, milkAmount = 0;
		double subPrice, totalPrice, tax;
		double applePrice, bananaPrice, breadPrice, eggsPrice, yogurtPrice, milkPrice;
		double centRounding;
		DecimalFormat money = new DecimalFormat("0.00");
		boolean running = true;

		System.out.println("|| $$$ \\\\\\ ========== \"Mr. Tarcea's Grocery\" ========== /// $$$ ||");
		System.out.println("Here is a list of what we have for sale:");
		System.out.format("%8s %12s %10s %9s %11s %9s", "Apples", "Bananas", "Bread", "Eggs", "Yogurt", "Milk");
		// Main loop
		while (running == true) {
			System.out.print("\nWhat would you like to buy? ");
			product = sc.next();
			System.out.print("How many are you buying? ");
			// Checks user input and update
			if (product.equalsIgnoreCase("Apples")) {
				appleAmount += sc.nextInt();
			} else if (product.equalsIgnoreCase("Bread")) {
				breadAmount += sc.nextInt();
			} else if (product.equalsIgnoreCase("Bananas")) {
				bananaAmount += sc.nextInt();
			} else if (product.equalsIgnoreCase("Eggs")) {
				eggsAmount += sc.nextInt();
			} else if (product.equalsIgnoreCase("Yogurt")) {
				yogurtAmount += sc.nextInt();
			} else if (product.equalsIgnoreCase("Milk")) {
				milkAmount += sc.nextInt();
			} else {
				// Error handling for invalid product input
				System.out.println("\nERROR! TRY AGAIN \nPLEASE INPUT A PRODUCT FROM THE LIST");
			}

			System.out.print("Would you like to buy anything else? (True or False) ");
			running = sc.nextBoolean();
		}

		// Calculate prices
		applePrice = appleAmount * apple;
		breadPrice = bread * breadAmount;
		bananaPrice = banana * bananaAmount;
		eggsPrice = eggs * eggsAmount;
		yogurtPrice = yogurt * yogurtAmount;
		milkPrice = milk * milkAmount;
		subPrice = applePrice + bananaPrice + breadPrice + eggsPrice + yogurtPrice + milkPrice;
		tax = subPrice * 0.13;
		totalPrice = subPrice + tax;

		// Print receipt header
		System.out.println("\nThank you.");
		System.out.println("\nHere is your receipt:");
		System.out.format("\n\n%37s", "Mr. Tarcea's Grocery");
		System.out.format("\n%-1s %48s", "18/10/24", "11:39");
		System.out.format("\n\n%4s %13s", "Item\t\t|", "Price    |");
		System.out.format("%13s %12s", "Quantity  |", "Total Price");
		System.out.println("\n---------------------------------------------------------");
		// Print details for each product purchased
		if (appleAmount > 0) {
			System.out.format("%s %s", "Apples", "\t\t| ");
			System.out.format("%8s %4s", money.format(apple), " |");
			System.out.format("%10s %s", appleAmount, " |");
			System.out.format(dollarFormatting, dollar, money.format(applePrice));
			System.out.println("\n---------------------------------------------------------");
		}
		if (bananaAmount > 0) {
			System.out.format("%s %s", "Bananas", "\t| ");
			System.out.format("%8s %4s", money.format(banana), " |");
			System.out.format("%10s %s", bananaAmount, " |");
			System.out.format(dollarFormatting, dollar, money.format(bananaPrice));
			System.out.println("\n---------------------------------------------------------");
		}
		if (breadAmount > 0) {
			System.out.format("%s %s", "Bread", "\t\t| ");
			System.out.format("%8s %4s", money.format(bread), " |");
			System.out.format("%10s %s", breadAmount, " |");
			System.out.format(dollarFormatting, dollar, money.format(breadPrice));
			System.out.println("\n---------------------------------------------------------");
		}
		if (eggsAmount > 0) {
			System.out.format("%s %s", "Eggs", "\t\t| ");
			System.out.format("%8s %4s", money.format(eggs), " |");
			System.out.format("%10s %s", eggsAmount, " |");
			System.out.format(dollarFormatting, dollar, money.format(eggsPrice));
			System.out.println("\n---------------------------------------------------------");
		}
		if (yogurtAmount > 0) {
			System.out.format("%s %s", "Yogurt", "\t\t| ");
			System.out.format("%8s %4s", money.format(yogurt), " |");
			System.out.format("%10s %s", yogurtAmount, " |");
			System.out.format(dollarFormatting, dollar, money.format(yogurtPrice));
			System.out.println("\n---------------------------------------------------------");
		}
		if (milkAmount > 0) {
			System.out.format("%s %s", "Milk", "\t\t| ");
			System.out.format("%8s %4s", money.format(milk), " |");
			System.out.format("%10s %s", milkAmount, " |");
			System.out.format(dollarFormatting, dollar, money.format(milkPrice));
			System.out.println("\n---------------------------------------------------------");
		}

		// Print subtotal, tax, total, and rounded total prices
		System.out.format("%44s", "Subtotal:");
		System.out.format(dollarFormatting, dollar, money.format(subPrice));
		System.out.format("\n%44s", "Tax:");
		System.out.format(dollarFormatting, dollar, money.format(tax));
		System.out.format("\n%44s", "Total:");
		System.out.format(dollarFormatting, dollar, money.format(totalPrice));
		System.out.println("\nThis is approximately $" + money.format(Math.rint(totalPrice)));

		System.out.println("\n\nWould you like to pay with Cash or Card?");
		payment = sc.next();

		// Calculate rounding for cash payments
		centRounding = totalPrice * 100 % 10;
		if (payment.equalsIgnoreCase("Cash")) {
			if (centRounding < 2.5 || centRounding > 7.5) {
				System.out.println(centRounding);
				System.out.println("\nThat will be" + dollar + money.format(Math.rint(totalPrice * 10) / 10));
			} else { // Adjust total if rounding favors the next nickel
				if (centRounding > 5) {
					money = new DecimalFormat("$0.05");
					totalPrice = totalPrice - 0.1; // Rounding down
					System.out.println("\nThat will be " + money.format(totalPrice));
				} else {
					money = new DecimalFormat("$0.05"); // Rounding up
					System.out.println("\nThat will be " + money.format(totalPrice));
				}
			}
		}
		System.out.print("Thank you for shopping!");
		sc.close();
	}
}