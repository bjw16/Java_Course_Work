/*--------------------- salesCommission.java -------------------------------
Brandon Whyte --- Section 1

Class is used to organize a visual chart, to show the saleries of
each person at the company, based on sales.
*/

public class salesCommission{
  public static void main(String[] args)
  {
    //Array holds pre-estimated values of sales for ten people.
    int[] salesArray = {5000, 7000, 5500, 10500, 2000, 4000, 4500, 8000, 11000};

    //intro
    System.out.println("Salaries Earned by Salespeople:");

    //For loop is used for printing out basic tabular format
    //and calculating the salies of each person and organizing
    //each into appropriate slot in table.
    for(int counter = 0; counter < 9; counter++)
    {
      //If else is used for printing tabular format
      if(counter == 8)
      {
        //Prints out saleries tabular format for over $1000
        System.out.printf("$%4d and over: ", (counter * 100) + 200 );
      }
      else
      {
        //Prints default format for each row in table based on saleries.
        System.out.printf("$%3d-%3d: ",(counter * 100) + 200, (counter *100) +299);
      }

      //Nested for loop used for calculating saleries and putting them in right place
      for(int arrayItem = 0; arrayItem < salesArray.length; arrayItem++)
      {
        if((200+(salesArray[arrayItem]*.09)) >= ((counter * 100)+200) && (200+(salesArray[arrayItem]*.09)) <= ((counter * 100)+299) && counter != 8)
        {
          //Prints stars for values in between certain saleries
          System.out.print("*");
        }
        else if(counter == 8 && (200+(salesArray[arrayItems]*.09)) >= ((counter * 100)+200))
        {
          //Prints values over $1000
          System.out.print("*");
        }
      }
      //adds new line at end each time loop runs
      System.out.printf("%n");
    }
  }
}
