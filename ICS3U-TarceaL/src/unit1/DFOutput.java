package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Description: Practice and use DecimalFormat to display monetary values 
 * Date: 17/10/24
 * @author Luca Tarcea
 */
public class DFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Run the following program with a cost of 10.00.
		// What value is displayed in the output?
		// 11.3

		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);

		System.out.println("The cost of your item with tax is " + money.format(total));

		// Change the above print statement on line 19 to:
		// System.out.println("The cost of your item with tax is " +
		// money.format(total));
		// Run the program again, how is the output different? Why?
		// 11.30, it has an extra decimal because money.format makes it have two
		// the variable money is formatted with two decimals

		// Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		// Run the program again with the cost of 10, how is the output different?
		// $11.30, it has a dollar sign because the variable money is changed to include
		// a dollar sign

		// Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		// Run the program again with the cost of 10, how is the output different?
		// $11.3, cut off a decimal place because the # symbols set a max amount of
		// decimals, not a set amount

		// Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		// Calculate 10.50 x 1.13 = 11.865
		// Run the program again with the cost of 10.50, what is happening?
		// $11.97, like I wrote earlier, # sets a max amount of decimals, so there are
		// no more than two

		// Modify the parameter for the DecimalFormat on line 15 as you think is
		// appropriate for money.
		// Run the program again with the cost of 123456, what is displayed?
		// $139505.28

		// Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		// Run the program again with the cost of 123456, how is the output different?
		// Explain what is happening.
		// $139,505.28, the # sets a max amount, but the commas appear in between every
		// three
		// this only works up to a million

		// Uncomment the following print line, and run the program with any value for
		// the cost.
		// What value is printed for the TAX_RATE?
		// 0.13
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		// Change the above print statement to format the TAX_RATE using the percent
		// DecimalFormat instance.
		// Run the program again with any cost, how is the TAX_RATE displayed
		// differently?
		// 13%, the variable decimal percent is formatted to be a percent value, not a
		// decimal one
		// by this, I mean a real number between 0 and 1

		sc.close();
	}

}
