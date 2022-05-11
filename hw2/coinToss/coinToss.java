/*--------------------- coinToss.java -------------------------------
Brandon Whyte --- Section 1

This program is a heads or tails, coin toss game. It ask the user to
flip the coin, and in return, displays the results. It also keeps track of
how many times each side was flipped.
*/
import java.util.Scanner;
import java.security.SecureRandom;

public class coinToss{
    private static final SecureRandom randomNumbers = new SecureRandom();

    //Declares coins faces as const values
    enum Coin{
        HEADS,TAILS;
    }

    public static void main(String[] args)
    {
        //Declares variables. These also dont reset each time the loop runs,
        //and saves how many times each face value was show.
        Scanner input = new Scanner(System.in);
        int totalHeads = 0, totalTails = 0;
        Coin faceValue;

        //Loop will run the game until the user wants to exit
        while(true)
        {
            //Intro text. Ask the user to play or exit.
            System.out.println("--------------------Coin Toss Menu--------------------");
            System.out.println("Press '1' for Coin Toss");
            System.out.println("Press '0' to exit menu");
            System.out.print("> ");
            int response = input.nextInt();

            //Determines if user wants to play
            if(response == 1)
            {
                //Flips the coin
                faceValue = flip();

                //If else determines if coin is heads or tails, and displays the result;
                //it also adds to previous result count.
                if(faceValue == Coin.HEADS)
                {
                    System.out.printf("%nResult: HEADS%n");
                    totalHeads++;
                }
                else if(faceValue == Coin.TAILS)
                {
                    System.out.printf("%nResult: TAILS%n");
                    totalTails++;
                }

                //Displays previous results.
                System.out.printf("Total times Rolled Heads: %d%n",totalHeads);
                System.out.printf("Total times Rolled Tails: %d%n%n", totalTails);
            }
            else
            {
                //Ends game
                break;
            }
        }

        System.out.println("Goodbye!");
    }

    //Function flips the coin using a random value function to come up with new
    //answer every time it is flipped.
    static Coin flip(){

        //Stores random value for coin flip, and coin enum.
        int x = randomNumbers.nextInt(2);
        Coin y;
        //If 0, then the coin value is tails. 1 is heads.
        if(x == 0)
            y = Coin.TAILS;
        else
            y = Coin.HEADS;

        //returns the enum coin value.
        return y;
    }

}
