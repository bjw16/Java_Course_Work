/*--------------------- varLength.java -------------------------------
Brandon Whyte --- Section 1

Program finds the product of a series of ints
passed to the product method. It also has test
if the function works.
*/
import java.security.SecureRandom;
public class varLength
{
  private static final SecureRandom randomNumbers = new SecureRandom();

  //Product function, multiplies ints using variable length argument list
  public static int product(int... numbers){
    //used = 1 because you cant multiply by null
    int product =1;

    //multiplies each number
    for(int x: numbers)
    {
      product = product * x;
    }
    return product;
  }

  public static void main(String[] args)
  {
    //Used for random generator for testing product function
    for(int numberCount= 2; numberCount< 10; numberCount++)
    {
      //holds ints to multiply
      int[] array= new int[numberCount];

      //Print format and assigning numbers
      for(int x = 0; x <numberCount; x++)
      {
        //assigns random numbers into a spot in array
        array[x] = randomNumbers.nextInt(10);

        //Prints multiplication equation
        if(x == numberCount-1)
          System.out.printf("%d = ",array[x]);
        else
          System.out.printf("%d * ", array[x]);
      }

      //Prints and gives product based on how many numbers are multiplied
      if(numberCount== 2)
        System.out.printf("%d%n%n", product(array[0], array[1]));
      else if(numberCount==3)
        System.out.printf("%d%n%n", product(array[0], array[1], array[2]));
      else if(numberCount==4)
        System.out.printf("%d%n%n", product(array[0], array[1], array[2], array[3]));
      else if(numberCount==5)
        System.out.printf("%d%n%n", product(array[0], array[1], array[2], array[3], array[4]));
      else if(numberCount==6)
        System.out.printf("%d%n%n", product(array[0], array[1], array[2], array[3], array[4], array[5]));
      else if(numberCount==7)
        System.out.printf("%d%n%n", product(array[0], array[1], array[2], array[3], array[4], array[5]), array[6]);
      else if(numberCount==8)
        System.out.printf("%d%n%n", product(array[0], array[1], array[2], array[3], array[4], array[5]), array[6], array[7]);
      else if(numberCount==9)
        System.out.printf("%d%n%n", product(array[0], array[1], array[2], array[3], array[4], array[5]), array[6], array[7], array[8]);
    }
  }
}
