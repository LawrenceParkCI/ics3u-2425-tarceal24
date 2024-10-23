package unit1;

import java.util.Scanner;

/**
* Description: Practice casting types on variables
* Date: 10/10/24
* @author Luca Tarcea
*/
public class Casting {
	
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
  public static void main(String[] args) {
    /*
    *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
    */

    System.out.println("Part 1");

    int intNum;
    intNum = 10;

    double doubleNum;
    
    //implicit casting
    doubleNum = intNum;

    //What type of data is printed here? Why?
    //double, because doubleNum took the value of intNum, but remains a double.
    System.out.println(doubleNum);

    //can you explain what is happening in this code?
    //doubleNum (value of 10) has 2.2 added to it, becoming 12.2
    doubleNum = doubleNum + 2.2;

    //explicit casting
    intNum = (int) doubleNum;

    //What type of data is printed here? Why?
    //int, because doubleNum is forced to be an int by using casting (int)
    //and ints have no decimals, thus printing 12, and not 12.2.
    System.out.println(intNum);

    /*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double
      implicit
      double to int
      explicit
      int to long
      implicit      
      long to int
      explicit

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
    because int is small than double or long, when it becomes a double or long, the value does not change.
    however, when a double or long become an integer, they may need to shorten their length, which can result
    in their values changing.
    */

    System.out.println("Part 2");

    //understanding what you can do with casting, can you round the following variable to the nearest 10th?
    double myNum;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Give me decimal number up to the hundredth");
    myNum = in.nextDouble();
	in.close();

    System.out.print("Rounding down to the nearest tenth, it is: ");
    myNum = myNum*10;
    myNum = (int) myNum;
    myNum = myNum/10;
    System.out.println(myNum);
    
  }
}