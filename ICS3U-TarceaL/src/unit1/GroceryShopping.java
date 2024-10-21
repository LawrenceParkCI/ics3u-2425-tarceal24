package unit1;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Description: 
 * Date: 
 * @author Luca Tarcea
 */
public class GroceryShopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String product;
		double price , subPrice , totalPrice , tax;
		int amount;
		boolean x = true;
		DecimalFormat money = new DecimalFormat("$  0.00");

		System.out.println("|| $$$ \\\\\\ ========== \"Mr. Tarcea's Grocery\" ========== /// $$$ ||");
		while(x == true) {
			System.out.print("\nWhat would you like to buy? ");
			product = sc.next();
			System.out.print("How much do they cost? ");
			price = sc.nextDouble();
			System.out.println(money.format(price));
			System.out.print("How many are you buying? ");
			amount = sc.nextInt();
			System.out.println(amount);
			System.out.print("Would you like to buy anything else? (True or False) ");
			x = sc.nextBoolean();
			subPrice = price * amount;
			tax = subPrice * 0.13;
			totalPrice = subPrice + tax;
			if(x == false) {
				System.out.println("\nThank you.");
				System.out.println("\nHere is your receipt:");
				System.out.format("\n\n%30s" , "Mr. Tarcea's Grocery");
				System.out.format("\n%-1s %30s" , "18/10/24" , "11:39");
				System.out.format("\n\n%4s%14s" , "Item\t\t|" , "Price    |");
				System.out.format("%13s%13s" , "Quantity  |" , "Total Price");
				System.out.println("\n---------------------------------------------------------");
				System.out.format("%s%s" , product , "\t\t| ");
				System.out.format("%9s%4s" , money.format(price) , " |");
				System.out.format("%10s%s" , amount , "  |");
				System.out.format("%13s" , money.format(subPrice));
				System.out.println("\n---------------------------------------------------------");
				System.out.format("%44s" , "Subtotal:");
				System.out.format("%13s" ,  money.format(subPrice));
				System.out.format("\n%44s" , "Tax:");
				System.out.format("%13s" , money.format(tax));
				System.out.format("\n%44s" , "Total:");
				System.out.format("%13s" , money.format(totalPrice));
				System.out.println("\n" + money.format(Math.rint(totalPrice)));

			}
		}



		sc.close();
	}


}
