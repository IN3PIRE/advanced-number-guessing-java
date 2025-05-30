/*
 * Programmed by IN3PIRE
 */
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    private static final int MAX_NUMBER = 100;
    private static final int MAX_ATTEMPTS = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(MAX_NUMBER) + 1;
        int attempts = 0;
        int guess;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Enhanced Number Guessing Game!");
        System.out.println("I've chosen a number between 1 and " + MAX_NUMBER + ". Try to guess it.");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts.");

        while (attempts < MAX_ATTEMPTS) {
            attempts++;
            System.out.printf("Attempt %d/%d: Enter your guess: ", attempts, MAX_ATTEMPTS);

            try {
                guess = scanner.nextInt();
                scanner.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer number.");
                scanner.nextLine(); /
                continue;
            }

            if (guess < 1 || guess > MAX_NUMBER) {
                System.out.println("Please enter a number between 1 and " + MAX_NUMBER + ".");
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
