package q2;
import java.util.Scanner;
import java.util.Random;
/**
 * <p>A fun guessing game where a number is randomly generated and
 * the user has to input a guess from 1 to 100.</p>
 *
 * @author Justin Chun
 * @version 1.0
 */
public class Guess {
  
    /**
     * <p>The max value that a number can roll.</p>
     */
    private static final int MAX = 100;
    /**
     * <p>The sentinel value set to 0 to exit the game.</p>
     */
    private static final int SENTINEL_VALUE = 0;
    /**
     * <p>The main method that generates a random number 
     * then prompts the user to guess the number between
     * 1 to 100.</p>
     * @param args unused
     */
    public static void main(String[] args) {

        int numToGuess;
        int count = 0;
        String keepPlaying;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        //randomly generate a number to guess.
        numToGuess = generator.nextInt(MAX) + 1;
        //prompt user to guess the number.
        do {
            System.out.println("Please enter the number you are " 
                    + " guessing (from 1 to 100)"
                    + " or '0' to quit");
            int guess = scan.nextInt();
            while (guess < 0 || guess > MAX) {
                System.out.println("Please enter valid input. Try Again.");
                guess = scan.nextInt();
            }
            
            if (guess == SENTINEL_VALUE) {
                System.out.println("You have decided to quit the game.");
                break;
            }
            while (guess != numToGuess) {

                while (guess < 0 || guess > MAX) {
                    System.out.println("Please enter valid input. Try again.");
                    guess = scan.nextInt();
                }
                if (guess == SENTINEL_VALUE) {
                    break;
                }

                //read in guess.

                if (guess < numToGuess) {
                    System.out.println("You guessed wrong, go higher");
                    System.out.println("Enter another number");
                    guess = scan.nextInt();
                } else {
                    //print message saying guess is wrong.
                    System.out.println("You guessed wrong, go lower");
                    System.out.println("Enter another number");
                    guess = scan.nextInt();
                }
                count++;
            }
            if (guess == SENTINEL_VALUE) {

                System.out.println("You have decided to quit");
            } else {
                count++;
                //print message telling user number of guesses.
                System.out.println("You have guessed " + count + " times");
                System.out.println();
            }
            //prompt user to play again.
            System.out.print("Do you want to play again? (y/n):");
            keepPlaying = scan.next();
            //generate a new random number.
            numToGuess = generator.nextInt(MAX) + 1;
            //reset count to 0.
            count = 0;

        } while (keepPlaying.equalsIgnoreCase("y")); 

    }
}

