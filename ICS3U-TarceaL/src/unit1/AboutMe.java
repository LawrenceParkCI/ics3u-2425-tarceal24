package unit1;
/**
 * Description: This program prints my information
 * Date: 20/09/24
 * @author Luca Tarcea
 */
public class AboutMe {

	public static void main(String[] args) {
		// This prints the information to the console
		System.out.println("Luca Tarcea");
		System.out.println("Grade 11");
		System.out.println("Ms. Kemp");
		System.out.println("Lawrence Park CI");
		System.out.println("\"Go Panthers!\"");
		//System.out.printf("Day:     |  Period 1  |  Period 2   |  Lunch  |   Period 3   |  Period 4");
		//System.out.printf("\nMonday:   | 9:00-10:15 | 10:20-11:40 |  Lunch  |  12:40-1:55  |  Period 4");
		//System.out.printf("\nTuesday:   | 9:00-10:15 | 10:20-11:40 |  Lunch  |  12:40-1:55  |  Period 4");
		//System.out.printf("\nWednesday: | 9:55-10:55 | 11:00-12:00 |  Lunch  |   1:00-2:05  |  Period 4");
		//System.out.printf("\nThursday:  | 9:00-10:15 | 10:20-11:40 |  Lunch  |  12:40-1:55  |  Period 4");
		//System.out.printf("\nFriday:   | 9:00-10:15 | 10:20-11:40 |  Lunch  |  12:40-1:55  |  Period 4");
		System.out.format("\n  Day%15s%15s%17S%15s%15s", "Period 1","Period 2","Lunch","Period 3","Period 4");
		System.out.format("\n  Monday:%16s%15s%10S%15s%15s","9:00-10:15  |","10:20-11:40 |","Lunch  |","12:40-1:55  |","2:00-3:15  |");
		System.out.format("\nClass:%20s%15s%10S%15s%15s","Computer Science","Accounting","Lunch","Chemistry","English");
		System.out.println("\n________________________________________________________________________________");
		System.out.format("\n  Tuesday:%15s%15s%10S%15s%15s","9:00-10:15 |","10:20-11:40 |","Lunch  |","12:40-1:55  |","2:00-3:15  |");
		System.out.format("\nClass:%15s%20s%10S%15s%15s","Accounting","Computer Science","Lunch","English","Chemistry");
		System.out.println("\n________________________________________________________________________________");
		System.out.format("\n Wednesday:%13s%15s%10S%15s%15s","9:00-10:15","10:20-11:40","Lunch","12:40-1:55","2:00-3:15");
		System.out.format("\nClass:%20s%15s%10S%15s%15s","Computer Science","Accounting","Lunch","Chemistry","English");
		System.out.println("\n________________________________________________________________________________");
		System.out.format("\n Thursday:%14s%15s%10S%15s%15s","9:00-10:15","10:20-11:40","Lunch","12:40-1:55","2:00-3:15");
		System.out.format("\nClass:%15s%20s%10S%15s%15s","Accounting","Computer Science","Lunch","English","Chemistry");
		System.out.println("\n________________________________________________________________________________");
		System.out.format("\n  Friday:%16s%15s%10S%15s%15s","9:00-10:15","10:20-11:40","Lunch","12:40-1:55","2:00-3:15");
		System.out.format("\nClass:%20s%15s%10S%15s%15s","Computer Science","Accounting","Lunch","Chemistry","English");
		System.out.println("\n________________________________________________________________________________");
		
	}

}