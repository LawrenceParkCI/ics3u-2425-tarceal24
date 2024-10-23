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
		double apple = 1.19;
		double banana = 0.79;
		double bread = 3.49;
		int appleAmount , bananaAmount , breadAmount;
		String product;
		double subPrice , totalPrice , tax;
		double applePrice , bananaPrice , breadPrice;
		double b;
		int amount;
		DecimalFormat money = new DecimalFormat("$  0.00");
		boolean x = true;
		
		
		System.out.println("|| $$$ \\\\\\ ========== \"Mr. Tarcea's Grocery\" ========== /// $$$ ||");
		while(x == true) {
			System.out.print("\nWhat would you like to buy? ");
			product = sc.next();
			if(product == "bananas" || product == "Bananas") {
				bananaAmount = sc.nextInt();
				bananaPrice = banana * bananaAmount;
			}
			if(product == "bread" || product == "Bread") {
				breadAmount = sc.nextInt();
				breadPrice = bread * breadAmount;
			}
			if(product == "apples" || product == "Apples") {
				appleAmount = sc.nextInt();
				
			}
			applePrice = appleAmount * apple;
			System.out.print("How much do they cost? ");
			//price = sc.nextDouble();
			//System.out.println(money.format(price));
			System.out.print("How many are you buying? ");
			amount = sc.nextInt();
			System.out.println(amount);
			System.out.print("Would you like to buy anything else? (True or False) ");
			x = sc.nextBoolean();
			subPrice = applePrice + bananaPrice + breadPrice;
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
				System.out.format("%9s%4s" , money.format(apple) , " |");
				System.out.format("%10s%s" , apple , "  |");
				System.out.format("%13s" , money.format(subPrice));
				System.out.println("\n---------------------------------------------------------");
				System.out.format("%44s" , "Subtotal:");
				System.out.format("%13s" ,  money.format(subPrice));
				System.out.format("\n%44s" , "Tax:");
				System.out.format("%13s" , money.format(tax));
				System.out.format("\n%44s" , "Total:");
				System.out.format("%13s" , money.format(totalPrice));
				
			}
			
		}
		
		
		
		
/*
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
				b = totalPrice * 100 % 10;
				if(b < 2.5 || b > 7.5) {
					System.out.println("\n" + money.format(Math.rint(totalPrice * 10)/10));
				}
				else {
					if(b > 5) {
						money = new DecimalFormat("$  0.05");
						totalPrice = totalPrice - 0.1;
						System.out.println("\n" + money.format(totalPrice));
					}
					else {
						money = new DecimalFormat("$  0.05");
						System.out.println("\n" + money.format(totalPrice));
					}
				}
			}
		}*/
		sc.close();
	}


}
