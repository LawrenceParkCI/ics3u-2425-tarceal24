package unit2;

import java.io.*;
import java.util.Scanner;

/**
Description:
Date:
@author 
*/


public class DemoReading {
  public static void main(String[] args) {

    // Creates an string to read a line
    String line;

    try {
      //will try to write to output.txt. If it doesn't exist, it will create it
      File file = new File("input.txt");
      // Creates a Scanner that will read from the file instead on the system console
      Scanner fsc = new Scanner(file);

      // Reads lines of the text into variable line using a loop, while there is still text

line = fsc.nextLine();
      while (line != null) {

        //prints out the line read
        //all input is String type
        System.out.println(line);

line = fsc.nextLine();
      }

      // Closes the reader
      fsc.close();
    }

    catch(IOException e) {
      System.out.println("Cannot read from file.");
    }
  }
}