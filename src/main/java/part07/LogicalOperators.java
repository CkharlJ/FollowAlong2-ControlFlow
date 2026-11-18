package part07;

import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class LogicalOperators {
    public static void main(String[] args) {
        // Create an integer variable temp and set it to 25.
        int temp = 25;
        // Check if the temperature is greater than 30.
        if (temp > 30) {
            // Print a message if it is hot outside.
            System.out.println("It is hot outside!");
            // Check if the temperature is between 20 and 30.
        } else if (temp >= 20 && temp <= 30) {
            // Print a message if it is warm outside.
            System.out.println("It is warm outside!");
            // Run this if the temperature is below 20.
        } else {
            // Print a message if it is cold outside.
            System.out.println("It is cold outside!");
        }
        // Create a Scanner to read user input.
        Scanner scanner = new Scanner(System.in);
        // Tell the user how to quit the game.
        System.out.println("You are playing a game! Press q or Q to quit");
        // Read the user's response.
        String response = scanner.next();
        // Check if the user did not enter q or Q.
        if (!response.equals("q") && !response.equals("Q")) {
            // Print a message if the user keeps playing.
            System.out.println("You are still playing the game *pew pew*");
            // Run this if the user entered q or Q.
        } else {
            // Print a message if the user quits.
            System.out.println("You quit the game");
        }
    }
}