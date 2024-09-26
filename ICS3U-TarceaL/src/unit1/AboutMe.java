package unit1;
/**
 * Description: This program prints my information and timetable
 * Date: 25/09/24
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
		// This prints my timetable to the console
		System.out.println("______________________________________________________________________________________________________");
		System.out.format("\n    Day%15s%18s%10S%18s%18s", "\t Period 1\t|","Period 2\t|","Lunch  |"," Period 3    |"," Period 4    |");
		System.out.println("\n______________________________________________________________________________________________________|");
		System.out.format("\n  Monday:%16s%19s%10S%18s%18s","\t9:00-10:15\t|","10:20-11:40\t|","Lunch  |","12:40-1:55    |","2:00-3:15    |");
		System.out.format("\n   Class:%22s%15s%10S%18s%18s","Computer Science\t|","\tAccounting\t|","Lunch  |","Chemistry    |","English     |");
		System.out.println("\n______________________________________________________________________________________________________|");
		System.out.format("\n  Tuesday:%15s%19s%10S%18s%18s","\t9:00-10:15\t|","10:20-11:40\t|","Lunch  |","12:40-1:55    |","2:00-3:15    |");
		System.out.format("\n   Class:%15s%22s%10S%18s%18s","\tAccounting\t|","Computer Science\t|","Lunch  |","English     |","Chemistry    |");
		System.out.println("\n______________________________________________________________________________________________________|");
		System.out.format("\n Wednesday:%13s%19s%10S%18s%18s","\t9:00-10:15\t|","10:20-11:40\t|","Lunch  |","12:40-1:55    |","2:00-3:15    |");
		System.out.format("\n   Class:%22s%15s%10S%18s%18s","Computer Science\t|","\tAccounting\t|","Lunch  |","Chemistry    |","English     |");
		System.out.println("\n______________________________________________________________________________________________________|");
		System.out.format("\n Thursday:%14s%19s%10S%18s%18s","\t9:00-10:15\t|","10:20-11:40\t|","Lunch  |","12:40-1:55    |","2:00-3:15    |");
		System.out.format("\n   Class:%15s%22s%10S%18s%18s","\tAccounting\t|","Computer Science\t|","Lunch  |","English     |","Chemistry    |");
		System.out.println("\n______________________________________________________________________________________________________|");
		System.out.format("\n  Friday:%16s%19s%10S%18s%18s","\t9:00-10:15\t|","10:20-11:40\t|","Lunch  |","12:40-1:55    |","2:00-3:15    |");
		System.out.format("\n   Class:%22s%19s%10S%18s%18s","Computer Science\t|","Accounting\t|","Lunch  |","Chemistry    |","English     |");
		System.out.println("\n______________________________________________________________________________________________________|");

	}

}