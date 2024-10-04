package unit1;
import java.util.Scanner;
/**
 * 
 */
public class Alive {
/**
 * Entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hours = 8;
		int daysMonth = 30;
		int months = 12;
		int daysYear = (daysMonth*months);
		int year,month,day;
		int year2,month2,day2;
		
		
		System.out.println("Type in your birth year and <Enter>");
		year = sc.nextInt();
		System.out.println("Type in your birth month and <Enter>");
		month = sc.nextInt();
		System.out.println("Type in your birth day and <Enter>");
		day = sc.nextInt();
		System.out.println("Type in the current year and <Enter>");
		year2 = sc.nextInt();
		System.out.println("Type in the current month and <Enter>");
		month2 = sc.nextInt();
		System.out.println("Type in the current day and <Enter>");
		day2 = sc.nextInt();
		System.out.format("Your birthday is %02d/%02d/%d",day,month,year);
		System.out.format("\nToday's date is %02d/%02d/%d",day2,month2,year2);

	}

}
