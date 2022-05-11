// Fig. 16.17: WordTypeCount.java
// Program counts the number of occurrences of each word in a String.
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class WordTypeCount {
  	public static void main(String[] args) {
      		// create HashMap to store String keys and Integer values
      		Map<String, Integer> myMap = new HashMap<>();            

      		createMap(myMap); // create map based on user input
      		displayMap(myMap); // display map content
   	} 

   // create map from user input
   	private static void createMap(Map<String, Integer> map) {
   		Scanner scanner = new Scanner(System.in); // create scanner
   		System.out.println("Enter a string:"); // prompt for user input
      		String input = scanner.nextLine();
		int b = 0;				//Used to allocate space for tokens array
   	
		//Counts spaces needed for tokens, counting appropriate characters
		for(int j = 0; j <input.length();j++)
   		{
      			char charVal = input.charAt(j);
      			int ascii = (int) charVal;
			if(ascii != 32){
				b++;
      			}
   		}
		
   		int c = 0;
   		String[] tokens = new String[b];
		
		//Inserts individual characters that arnt white space into loop
		for(int j = 0; j < input.length();j++){
      			char charVal = input.charAt(j);
      			int ascii = (int) charVal;
			if(ascii != 32){
				tokens[c] = input.substring(j, j+1);
     				 c++;
        		 }
		}
 	     // Stores into list
 	     for (int i = 0; i < b; i++) {
        	 String letter = tokens[i].toLowerCase(); // get lowercase word
		 System.out.printf("%s", letter);
         	// if the map contains the word
         	if (map.containsKey(letter)) { // is word in map?
            		int count = map.get(letter); // get current count
           		 map.put(letter, count + 1); // increment count   
         	} 
         	else {
            		map.put(letter, 1); // add new word with a count of 1 to map
         	} 
      	} 
   } 
   
   // display map content
   private static void displayMap(Map<String, Integer> map) {
      Set<String> keys = map.keySet(); // get keys

      // sort keys
      TreeSet<String> sortedKeys = new TreeSet<>(keys);

      System.out.printf("%nMap contains:%nKey\t\tValue%n");

      // generate output for each key in map
      for (String key : sortedKeys) {
         System.out.printf("%-10s%10s%n", key, map.get(key));
      }
      
      System.out.printf(
         "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
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

