package part09;
// we import Scanner to read user input.

import java.util.Scanner;
// we import Random to generate random numbers.
import java.util.Random;
// Part 09 — CHECKPOINT. No video in this part.
// Video (only if you need a reminder): https://www.youtube.com/watch?v=xk4_1vDrzzo
//   user input (Scanner) — part 03 · random numbers — part 05
//   if statements — part 06 · while loops — part 07
//
// SECTION A — BUILD: write a number guessing game in this class, starting from nothing.
//    The README has the full list of rules and a sample run.
//    Leave the "package part09;" line and the class line alone. Type everything else,
//    including main and the import lines.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class GuessingGame {
    public static void main(String[] args) {
        // it Creates  a Scanner to read the player's input.
        Scanner scanner = new Scanner(System.in);
        //It Creates  a Random object to generate random numbers.
        Random random = new Random();
        // Pick a random number between 1 and 100.
        int secret = random.nextInt(100) + 1;
        // Store the player's guess, starting at 0.
        int guess = 0;
        // Count the number of guesses, starting at 0.
        int guesses = 0;

        // Tell the player the number range.
        System.out.println("I'm thinking of a number between 1 and 100.");

        // Keep asking until the player guesses correctly.
        while (guess != secret) {

            // Ask the player to enter a guess.
            System.out.print("Your guess: ");

            // Read the number entered by the player.
            guess = scanner.nextInt();

            // Add one to the number of guesses.
            guesses++;

            // Check if the guess is greater than the secret.
            if (guess > secret) {

                // Tell the player the guess is too high.
                System.out.println("Too high!");

                // Check if the guess is smaller than the secret.
            } else if (guess < secret) {

                // Tell the player the guess is too low.
                System.out.println("Too low!");
            }
        }
        // Tell the player they won and show the guess count.
        System.out.println("Correct! You got it in " + guesses + " guesses.");

    }
}

