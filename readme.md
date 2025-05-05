# Advanced Number Guessing Game

## Description

This is an advanced number guessing game implemented in Java. The computer generates a random secret number between 1 and 100, and the user has a limited number of attempts to guess the number. The game provides feedback on whether the guess is too high or too low, and it handles invalid input gracefully.

## Features

*   **Random Number Generation:** The game generates a new random secret number each time it is run.
*   **Limited Attempts:** The user has a limited number of attempts (7 in this version) to guess the number.
*   **Input Validation:** The game handles invalid input, such as non-numeric input or numbers outside the valid range (1-100), providing informative error messages.
*   **Feedback:**  Provides feedback to the user after each guess (too high, too low, or correct).
*   **Clear Output:** Displays a clear message upon winning or losing, indicating the secret number and the number of attempts used.

## How to Run

1.  **Prerequisites:** Make sure you have Java Development Kit (JDK) installed on your system.

2.  **Compilation:**
    *   Open a terminal or command prompt.
    *   Navigate to the directory containing the `NumberGuessingGame.java` file.
    *   Compile the code using the following command:

        ```bash
        javac NumberGuessingGame.java
        ```

3.  **Execution:**
    *   After successful compilation, run the game using the following command:

        ```bash
        java NumberGuessingGame
        ```

4.  **Playing the Game:**
    *   The game will prompt you to enter your guesses.
    *   Enter a number between 1 and 100 and press Enter.
    *   Follow the feedback provided by the game to adjust your guesses.
    *   You have 7 attempts to guess the correct number.

## Potential Enhancements

*   **Difficulty Levels:** Implement difficulty levels that change the range of numbers or the number of attempts allowed.
*   **Score Tracking:** Track the user's scores (number of attempts taken) and allow them to save their scores.
*   **GUI Interface:** Create a graphical user interface (GUI) for a more visually appealing and user-friendly experience. (Swing or JavaFX)
*   **Hints:** Provide hints to the user, such as whether the number is even or odd, or a range the number falls within.
*   **Two-Player Mode:** Allow two players to take turns guessing the number.

## Author

[Your Name] - [Your GitHub Profile URL (Optional)]
