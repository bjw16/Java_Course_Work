/*--------------------- enhancedStatement.java -------------------------------
Brandon Whyte --- Section 1

This program uses a enhanced for statement to sum up Double
values entered by command line arguments.
*/
public class enhancedStatement{

  public static void main(String[] args)
  {
    //holds sum of set
    double sum = 0;

    //enhanced for statement used for adding Double
    //in command line.
    for(String x: args)
    {
        sum = sum + Double.parseDouble(x);
    }

    //Prints out the sum
    System.out.printf("The sum is: %f%n", sum);
  }
}
