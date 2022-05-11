// Fig. 11.3: DivideByZeroWithExceptionHandling.java
// Handling ArithmeticExceptions and InputMismatchExceptions.
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling
{
   // demonstrates throwing an exception when a divide-by-zero occurs
   public static int quotient(int numerator, int denominator)
      throws ArithmeticException {
      return numerator / denominator; // possible division by zero
   } 
   
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numerator;
      int denominator;
      boolean continueLoop = true; // determines if more input is needed
      do {
         System.out.print("Please enter an integer numerator: ");    
            numerator = scanner.nextInt();                            
         System.out.print("Please enter an integer denominator: ");  
            denominator = scanner.nextInt();
         try { // read two numbers and calculate quotient                 
            quotient(numerator, denominator);  
         }
         catch (ArithmeticException arithmeticException) {   
            System.err.printf("%nException: %s%n", "java.lang.ArithmeticException: Oops, can't do that.");
            System.out.printf(                                          
               "Zero is an invalid denominator. Please try again.%n%n%n");
         }
         catch (InputMismatchException inputMismatchException) {        
            System.err.printf("%nException: %s%n",                       
               inputMismatchException);                                  
            scanner.nextLine(); // discard input so user can try again    
            System.out.printf(                                          
               "You must enter integers. Please try again.%n%n");      
         }                                                              
         finally{
               if(denominator == 0){
                  continueLoop = true; // input successful; end loopin
                  }
               else{
                  int result = quotient(numerator, denominator); 
                  System.out.printf("%nResult: %d / %d = %d%n%n", numerator,     
                     denominator, result);
                  //System.out.printf("Numerator is %d%nDenominator is %d%n%n",numerator,denominator);
                  continueLoop = false;
               }
               System.out.printf("Numerator is %d%nDenominator is %d%n%n",numerator,denominator);
            }
      }while (continueLoop);                                                                                                                                                                  
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
