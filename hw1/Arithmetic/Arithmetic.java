/*--------------------- Arithmetic.java -------------------------------
Brandon Whyte --- Section 1

Program allows the user to enter 3 numbers into the terminal. The progr-
am recognizes these numbers and returns their sum, average, highest and
lowest number.
*/

import java.util.Scanner;

public class Arithmetic{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		//Intro
		System.out.printf("Write three integers, and I will give you the sum, %naverage, product, smallest and largest numbers of the three%n");

		//Integer user input
		System.out.print("Integer 1: ");
		int x = input.nextInt();

		System.out.print("Integer 2: ");
		int y = input.nextInt();

		System.out.print("Integer 3: ");
		int z  = input.nextInt();

		//Arithmetic for user
		System.out.printf("%nThe sum is: %d%n", x+y+z);
		System.out.printf("The average is: %d%n", average(x,y,z));
		System.out.printf("The product is: %d%n", x*y*z);
		System.out.printf("The greatest number is: %d%n", high(x,y,z));
		System.out.printf("The smallest number is: %d%n", low(x,y,z));
	}

	//Functions for arithmetic
	public static int average(int x, int y, int z) {
		return (x + y + z)/3;
	}

	public static int high(int x, int y, int z) {
		//Seen in textbook, figure 6.3
		int highest = x;
		if(highest < y)
			highest = y;
		if (highest < z)
			highest = z;
		return highest;
	}

	public static int low(int x, int y, int z) {
		int lowest = x;
		if(lowest > y)
			lowest = y;
		if (lowest > z)
			lowest = z;
		return lowest;
	}
}
