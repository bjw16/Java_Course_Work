// Fig. 7.2: InitArray.java
// Initializing the elements of an array to default values of zero.
/*--------------------- InitArray.java -------------------------------
Brandon Whyte --- Section 1

Rewritten version of InitArray used to set numbers of arguments made
in the first line, or else, set to 10;
*/

public class InitArray {
   public static void main(String[] args) {
      // declare variable array and initialize it with an array object
      int arraySize;

      //sets size of array based on command line. 10 is default size
      if(args.length == 0)
        arraySize = 10;
      else
      {
        arraySize = Integer.parseInt(args[0]);
      }

      int[] array = new int[arraySize]; // create the array object

      //Sets values of array according to arguments
      for(int i = 1; i <= arraySize; i++)
      {
          //sets values according to if appropriate arguments were made
          //if they set the size too 2, and only give me 1 argument, the second
          //argument is == 0. If size wasnt given, 0 at each spot.
          if(args.length ==0 || (args.length -1 < arraySize && i > args.length -1))
            array[i-1] = 0;
          else
            array[i-1] = Integer.parseInt(args[i]);
      }

      System.out.printf("%s%8s%n", "Index", "Value"); // column headings

      // output each array element's value
      for (int counter = 0; counter < arraySize; counter++) {
         System.out.printf("%5d%8d%n", counter, array[counter]);
      }
   }
}



/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
