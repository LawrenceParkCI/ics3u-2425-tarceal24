package unit1;
import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author 
 */
public class UsingMathMethods {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		double r;
		double r2;
		
		System.out.println("Part A");
		
		//Write code to ask the user for any real number to be input.
		//Store their input into the num variable
		System.out.println("Type in a real number and <Enter>");
		num = sc.nextDouble();
		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num, num));
		System.out.println(Math.pow(num, 3));
		
		/*
		 * Run the program and write down the output that is produced
		 * when each of the following values are input:
		 * 
		 * 					num = 16.75		| num = 4.0		| num = -23.45
		 * 					-----------------------------------------------
		 * Math.round(num)			17		| 		4		|	-23
		 * Math.rint(num)			17.0	| 		4.0		|	-23.0
		 * Math.sqrt(num) 4.092676385936225	|		2.0		|	NaN
		 * Math.abs(num)			16.75	|		4.0		|	23.45
		 * Math.pow(num, 2)		280.5625	|		16.0	|	549.9024999999999
		 * Math.pow(num, num)3.178689376746782E20|		256.0	|	NaN
		 * Math.pow(num, 3)		4699.421875	|		64.0	|	-12895.213624999999
		 * 
		 */
		
		//Why does the last value(-23.45) give strange output for Math.sqrt(num)?
		//Nan stands for Not a number!
		//There is no square root for negative numbers
		
		//In your own words describe what the following Math methods does
		/*
		 * round: round to the nearest integer
		 * rint: round to the nearest integer, but maintain floating point type
		 * sqrt: find the square root
		 * abs: the value
		 * pow: use exponents
		 */
		
		//The methods round, sqrt and abs only have one parameter (which is in the brackets).
		//Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
		//The first is the value of the base number, the second is to what power you want to raise it to.
		
		System.out.println("Part B");
		//Ask the user for any real number and an integer to be input. Display the real number,
		//and its square root. Also determine and display the real number raised to the integer power.
		//Use suitable headings, displaying the results across the screen.\
		//
		//Eg. If the real number 13.5 nad the integer 2 are input, display
		//REAL NUMBER	SQUARE ROOT		RAISED TO POWER 2 <- display power here
		//   13.5		   3.6742			182.25
		System.out.println("Type in a real number and <Enter>");
		r = sc.nextDouble();
		System.out.println("Type in a real number and <Enter>");
		r2 = sc.nextDouble();
		System.out.format("%-17S %-20S %10S", "real number", "square root", "raised to power " + r2);
		System.out.println();
		System.out.format("%-17S %-20S %10S", r, Math.sqrt(r), Math.pow(r, r2));
		
		
		
		
		//Write down the results produced by your program when the real number 7.8985 and
		//the integer 3 are input.
		//REAL NUMBER       SQUARE ROOT          RAISED TO POWER3
		//7.8985            2.8104270138183627   492.75820832162503
		
		
		//Change your program so that instead of inputting an integer power, a real number
		//power can be input.
		//Write down the results produced by your program when the following are input:
		//a) the number 16 and the real number power 0.5
		//REAL NUMBER       SQUARE ROOT          RAISED TO POWER 0.5
		//16.0              4.0                  4.0
		//b) the number 8 and the real number power 0.33
		//REAL NUMBER       SQUARE ROOT          RAISED TO POWER 0.33
		//8.0               2.8284271247461903   1.9861849908740719
		
		//Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
		//Yes.
		//REAL NUMBER       SQUARE ROOT          RAISED TO POWER 0.33333333
		//8.0               2.8284271247461903   1.9999999861370563
		
		
		
	}

}
