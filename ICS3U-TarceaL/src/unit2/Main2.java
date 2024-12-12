package unit2;

/**
Name: Mr. Lee
Date: Oct 29, 2021
Description: Tracing through code
*/
public class Main2 {
  public static void main(String[] args) {
    int num = 500;

    while (num > 1) {
      if (num % 2 == 0) {
        num = num / 2;
      } else if (num % 3 == 0) {
        num = num + 7;
      } else  {
        num = num + 1;
      }
    }
    System.out.println(num);
  }
}