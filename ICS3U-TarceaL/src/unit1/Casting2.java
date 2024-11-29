package unit1;

/**
* Description: Practice casting characters using the ASCII chart
* Date: 10/10/24
* @author Luca Tarcea
*/
public class Casting2 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
  public static void main(String[] args) {
    /*
    Char and int
    */
    char myChar = 'a';
    System.out.println(myChar);
    System.out.println(myChar + 1);

    char myChar2 = (char) (myChar + 1);

    System.out.println(myChar2);

    //Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
    //the variable myChar is being changed, when 1 is added to it, it becomes an integer; this is implicit casting.
    //when it is explicitly cast by using (char), it forces the variable myChar2 to become a character and not an integer.

    //Why do you think this happens?
    //Investigate what is ASCII. What is it?
    //Can you find the number value for 'a'? Does it match with your findings above?
    //Yes, it is 97; 97 + 1 = 98, which is b.

    //create a new character myCharCap, and transform myChar into a capital 'A' and print it
    char myCharCap = (char) (myChar - 32);
    System.out.println(myCharCap);

    

  }
}