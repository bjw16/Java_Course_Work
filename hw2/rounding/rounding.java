/*--------------------- rounding.java -------------------------------
Brandon Whyte --- Section 1

A simple program that rounds a decimal to a whole number.
*/
import java.util.Scanner;
import java.lang.Math;

public class rounding{

  public static void main(String[] args){
    //declares values
    double originalNumber;
    int again;
    Scanner input = new Scanner(System.in);

    //Intro text
    System.out.printf("This program rounds any decimal to the nearest whole number!%n");

    //Loop used to ask user multiple times if they want to round.
    while (true)
    {
      //Ask for input.
      System.out.printf("%nGive me a decimal: ");
      originalNumber = input.nextDouble();

      //Displays results, including original number.
      System.out.printf("Original: %f%n", originalNumber);
      System.out.printf("Rounded: %.0f%n", Math.floor(originalNumber + .5));

      //Checks if user wants to exit the program.
      System.out.printf("Press 1 to play again%nPress 0 to exit%n> ");
      again = input.nextInt();
      if(again == 0)
        break;
    }
    System.out.println("Goodbye");
  }
}
