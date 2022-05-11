/*--------------------- twoDArray.java -------------------------------
Brandon Whyte --- Section 1

Create a two-dimensional array with six rows and four columns
where the cells in the first five rows and three columns are
filled with random integers between 0 and 9, the first 5 cells
of the fourth column contain the sums of the integers in the cells
of the corresponding rows, the first three cells of the sixth row contain
the sums of the integers in the corresponding column, and the lower right cell,
position (6,4), is set to 0.
*/
import java.security.SecureRandom;

public class twoDArray{
	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args){
		//creates a 6*4 array
		int[][] array = new int[6][4];

		//Used to assign random values to first 5 rows, and 3 columns
		for(int row = 0; row < 6; row++)
		{
			for(int column = 0; column < 3; column++)
			{
				array[row][column] = randomNumbers.nextInt(10);
			}
		}

		//Finds sum of each row, and stores it into 4th column
		for(int row = 0; row < 5; row++)
		{
			//Sets value to 0 so we can add it into something
			array[row][3] = 0;

			//counts sum in each column of one row
			for(int column = 0; column <3;column++)
			{
				array[row][3] = array[row][3] + array[row][column];
			}
		}

		//Used to add sum of each column to 5th column
		for(int column = 0; column < 3;column++)
		{
			//uses zero so we can add sum to it
			array[5][column] = 0;

			//Adds sum of each row in a column
			for(int row = 0; row <5; row++)
			{
				array[5][column] = array[5][column] + array[row][column];
			}
		}

		//Adds zero to 6*4
		array[5][3] = 0;

		//Prints values of array
		for(int row =0; row <6;row++)
		{
			//prints a row at a time
			for(int column =0; column < 4; column++)
			{
				System.out.printf("%02d ",array[row][column]);
			}

			//newline at the end to begin next row
			System.out.println();
		}
	}
}
