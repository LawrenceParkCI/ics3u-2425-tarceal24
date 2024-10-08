package unit1;
import java.util.Scanner;
/**
 * Description: Calculates and displays net pay.
 * Date: 04/10/24
 * @author Luca Tarcea
 */
public class NetPay {
	/**
	 * Entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declaring variables
		double netPay;
		int hours = 40;
		int wage = 5;
		int insurance = 2;
		double tax = 0.22;
		
		double scNetPay;
		double scHours;
		double scWage;
		double scInsurance;
		double scTax;

		// Calculates variables
		netPay = (hours * wage - insurance) - tax * (hours * wage - insurance);

		// Prints information
		System.out.println("_____________________________________________________________");
		System.out.format("%62s","|");
		System.out.format("\n%-9S %-10S %-15S %-9S %-13S %-6S", "hours", "wage", "insurance", "tax", "net pay", "|");
		System.out.println("\n_____________________________________________________________|");
		System.out.format("%62s","|");
		System.out.format("\n%-9d %-10d %-15d %-9s %-13s %-6s", hours, wage, insurance, tax, netPay, "|");
		System.out.println("\n_____________________________________________________________|");
		// Printing final statement
		System.out.println("\nThe net pay of an employee who works 40 hours at $5.00 an hour, has \n"
				+ "an insurance of $2.00 deducted and pays 22% in taxes is $"+netPay+".");

		System.out.println("\nUsing this example, input your own hours, wage, insurance, and tax \n"
				+ "to calculate weekly net pay.");
		
		//Scans, assigns and calculates variables
		System.out.println("Type in your weekly work hours and <Enter>");
		scHours = sc.nextDouble();
		System.out.println("Type in your hourly wage and <Enter>");
		scWage = sc.nextDouble();
		System.out.println("Type in your insurance deducted and <Enter>");
		scInsurance = sc.nextDouble();
		System.out.println("Type in the percentage of pay taxed and <Enter>");
		scTax = sc.nextDouble();
		scTax = scTax/100;
		
		scNetPay = (scHours*scWage - scInsurance) - scTax*(scHours*scWage - scInsurance);
		
		// Prints information inputted
		System.out.println("_____________________________________________________________");
		System.out.format("%62s","|");
		System.out.format("\n%-9S %-10S %-15S %-9S %-13S %-6S", "hours", "wage", "insurance", "tax", "net pay", "|");
		System.out.println("\n_____________________________________________________________|");
		System.out.format("%62s","|");
		System.out.format("\n%-9s %-10s %-15s %-9s %-13s %-6s", scHours, scWage, scInsurance, scTax, scNetPay, "|");
		System.out.println("\n_____________________________________________________________|");
		
		// Prints weekly net pay
		System.out.println("\nYour weekly net pay is $"+scNetPay+".");

	}

}
