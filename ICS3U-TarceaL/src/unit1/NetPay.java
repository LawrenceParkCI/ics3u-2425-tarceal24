package unit1;
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
		double netPay;
		int hours = 40;
		double wage = 5.00;
		double insurance = 2.00;
		double tax = 0.22;
		netPay = (hours*wage-insurance) - tax*(hours*wage-insurance);
		
		System.out.print("The net pay of an employee who works 40 hours at $5.00 an hour and has an insurance of $2.00 deducted and pays 22% in taxes is $"+netPay+".");
	}

}
