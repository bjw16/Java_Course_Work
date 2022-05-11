import java.io.FileNotFoundException;     
import java.lang.SecurityException;       
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;  
import java.util.Scanner;                 

public class CreateData {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
  
      try (Formatter output = new Formatter("oldmast.txt")) {
	output.format("%s%n","100 Bob Blue 24.98");
	output.format("%s%n","200 Steve Green -345.67");
	output.format("%s%n","300 Pam White 0.00");
	output.format("%s%n","400 Sam Red -42.16");
	output.format("%s%n","500 Sue Yellow 224.62");
      }
      catch (SecurityException | FileNotFoundException |
         FormatterClosedException e) {
         e.printStackTrace();
         System.exit(1); 
      }
      try (Formatter output = new Formatter("trans.txt")){
	output.format("%s%n","100 27.14");
	output.format("%s%n","300 62.11");
	output.format("%s%n","400 100.56");
	output.format("%s%n","900 82.17");
      }
      catch (SecurityException | FileNotFoundException | 
         FormatterClosedException e) {
         e.printStackTrace();
         System.exit(1); 
      } 
   } 
}
