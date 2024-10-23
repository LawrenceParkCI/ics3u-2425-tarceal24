package unit1;

/**
* Description: Practice casting different variable types into Strings
* Date: 10/10/24
* @author Luca Tarcea
*/
public class Casting3 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
 public static void main(String[] args) {
    /* 
    * Strings and Back Again
    */
    //Recall:
    System.out.println("Part 1");
    System.out.println("1 + 2 + 3" + 4 + 5);
    //why did it print out this way?
    //it does not add the numbers as they are strings.

    //Demonstrate casting a double value to a String in this way
    System.out.println("1.0 + 2.0 + 3.0" + 4.0 + 5.0);
    //Demonstrate casting a boolean value to a String in this way
    System.out.println("true + false + true" + false + true);
    //Demonstrate casting a char value to a String in this way
    System.out.println("a + b + c" + (char)100 + (char)101);

    System.out.println("Part 2");
    //In order to change a String into an integer, we need another set of code

    String strNum = "-5";
    int myNum = Integer.parseInt(strNum);

    System.out.println(strNum + " x 2 = " + (myNum + myNum));

    /*Change strNum to the following values, and see if they work:
     * "25.2" No
     * "23c" No
     * "2 3" No
     * "Lol23" No
     * "-5" Yes
    */
    //What can you say about how we can use the function, Integer.parseInt()?
    //converts whatever you put in the parentheses (a string) to an integer
    //(if it an integer)

    // What do you think the code to change a String to double would look like?
    //Similarly, test out the code and write down what instructions
    String strDouble = "10.89";
    double myDouble = Double.parseDouble(strDouble);
    System.out.println(strDouble + " x 2 = " + (myDouble * 2));

    //When do you think it might be necessary to change a string value into an integer value/double value?
    //When you want to convert from a string to an integer/double value
  }
}