package unit2;

/**

https://www.geeksforgeeks.org/java-math-random-method-examples/

Description: Random number 100-1000
Date: 18/11/24
@author Luca Tarcea
*/

public class Randomness {
	/**
	 * Entry point to the program.
	 * @param args
	 */
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println((int) (Math.random() * 901) + 100);
    }

    //Run the program a few times. What do you think is the 
    //range of the numbers generated?
    //0-1

    //Read the demo program. Write the code so that the program 
    //will produce a random number between 100 and 1000.
    
  }
}