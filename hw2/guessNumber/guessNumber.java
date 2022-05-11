/*--------------------- guessNumber.java -------------------------------
Brandon Whyte --- Section 1

Program is a guessing game called "Guess The Number". It challenges the
user to guess a random number, made up by the computer. If they guess
wrong, the program tells the user if they are guessing too high or too
low. This allows them to zero in on the correct number.
*/

import java.util.Scanner;
import java.security.SecureRandom;

public class guessNumber{
    private static final SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int randomNumber, userNumber, playAgain;

        //Intro:
        System.out.printf("Welcome to Guess That Number!%nThe object of the game is to guess a number between 1 - 1000.%n");
        System.out.printf("Take a guess at what the number is. Dont worry, if you guess%nwrong, we will tell you if you are too high or too low, allo-%nwing you to try again!%n");

        while(true)
        {
            //Prompts the user to guess, and creates a random number for them to guess.
            System.out.printf("%nGuess a number between 1 - 1000: ");
            randomNumber = 1 + randomNumbers.nextInt(1000);
            userNumber = input.nextInt();

            //Loop checks if the users guessed the right number.
            while(userNumber != randomNumber)
            {
                //tells the user if guess is too high or low
                if(userNumber > randomNumber)
                    System.out.println("Too high");
                else
                    System.out.println("Too low");

                //Allows them to guess again.
                System.out.printf("Guess again: ");
                userNumber = input.nextInt();
            }

            //Tells the player they won, and ask them to play again.
            System.out.println("Congratulations. You guessed the number!");
            System.out.printf("%nPress 1 to play again%nPress 0 to exit%n> ");

            //Checks if user wants to play again.
            playAgain = input.nextInt();
            if(playAgain != 1)
                break;
        }
        System.out.println("Goodbye!");
    }
}
