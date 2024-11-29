package unit2;
/**
* Description: Boolean practice
* Date: 04/11/24
* @author Luca Tarcea
*/

public class BasicBoolean {
	/**
	 * Entry point to the program
	 * @param args
	 */
  public static void main(String[] args) {
    //we've declared a variable called isPurple of boolean type
    //Recall: boolean holds either true or false
    boolean isPurple = false;


    /*
      Boolean Operators, Expressions
    */

    //boolean expressions are ways we can "calculate" whether
    //something is true or false

    int firstNum = 5;
    int secondNum = 10;
    double thirdNum = 5.5;

    //this prints out true because 5 is less than 10
    System.out.println("1: " + (firstNum < secondNum)); 

    //this prints out false because 5 is not greater than 10
    System.out.println("2: " + (firstNum > secondNum)); 

    //this prints out true because 5 is equal to 5
    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
    //this prints out true because 5 is less than 5.5
    System.out.println("4: " + (firstNum <= thirdNum)); 

    /*Test out these boolean operators. Figure out the meaning
      * > means: greater than
      * < means: less than
      * <= means: less than or equal to
      * >= means: greater than or equal to
      * == means: equal to
      * != means: not equal to
    */

  }
}