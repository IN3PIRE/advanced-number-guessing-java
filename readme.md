# Enhanced Number Guessing Game

This is a Java-based number guessing game with improved input handling and user experience.

## Features

*   **Number Range:** The game chooses a secret number between 1 and 100 (inclusive).
*   **Limited Attempts:** Players have a maximum of 7 attempts to guess the number.
*   **Input Validation:** The game validates user input to ensure it is a valid integer within the specified range.
*   **Clear Feedback:** The game provides clear feedback to the player, indicating whether their guess is too high or too low, and displaying the number of attempts remaining.
*   **Robust Error Handling:** The game handles invalid input gracefully, preventing crashes and providing helpful error messages.

## How to Play

1.  **Compile the Code:**

    ```bash
    javac NumberGuessingGame.java
    ```

2.  **Run the Game:**

    ```bash
    java NumberGuessingGame
    ```

3.  **Follow the Prompts:** The game will prompt you to enter your guess. Enter an integer between 1 and 100.
4.  **Receive Feedback:** The game will tell you if your guess is too high or too low.
5.  **Win or Lose:** If you guess the number within 7 attempts, you win! Otherwise, the game will reveal the secret number.

## Enhancements

This version of the number guessing game includes the following enhancements over a basic implementation:

*   **Constants for Clarity:** The maximum number and maximum attempts are defined as constants, making the code more readable and easier to modify.
*   **Improved Input Handling:** Uses `InputMismatchException` for more specific exception handling when the user enters non-integer input.
*   **Newline Consumption:**  The code explicitly consumes the newline character after reading integer input, preventing issues with subsequent reads.
*   **Informative Output:** The welcome message now includes the number range, and the attempt prompt shows the current attempt number and the maximum number of attempts.
*   **Robust Error Handling:** The game handles invalid input gracefully, preventing crashes and providing helpful error messages.

## Code Structure

*   `NumberGuessingGame.java`: Contains the main game logic.

## Contributing

Contributions are welcome! Feel free to submit pull requests with bug fixes, new features, or improvements to the documentation.
