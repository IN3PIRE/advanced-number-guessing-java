/*
 * Programmed by IN3PIRE
 */
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Advanced Number Guessing Game!");
        System.out.println("I've chosen a number between 1 and 100. Try to guess it.");

        while (attempts < 7) {
            attempts++;
            System.out.print("Attempt " + attempts + ": Enter your guess: ");

            try {
                guess = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + secretNumber +
                        " in " + attempts + " attempts.");
                break;
            }
        }

        if (!hasGuessedCorrectly) {
            System.out.println("You've run out of attempts. The number was " + secretNumber + ".");
        }

        scanner.close();
    }
}
