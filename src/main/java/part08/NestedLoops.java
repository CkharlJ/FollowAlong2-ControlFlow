package part08;

import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s
//        starts at 1:37:16 — stop at about 1:42:48, at "well ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 6–10
//
// Part 08 — nested loops (a loop inside another loop)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called NestedLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//    When you type Scanner, IntelliJ will want an import. See the README.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class NestedLoops {
    public static void main(String[] args) {
        // Create a Scanner to read what the user types.
        Scanner scanner = new Scanner(System.in);
        // Create a variable to store the number of rows.
        int rows;
        // Create a variable to store the number of columns.
        int columns;
        // Create an empty String to store the symbol.
        String symbol = "";
        // Ask the user to enter the number of rows.
        System.out.println("Enter number of rows:");
        // Read the number of rows.
        rows = scanner.nextInt();
        // Ask the user to enter the number of columns.
        System.out.println("Enter number of columns:");
        // Read the number of columns.
        columns = scanner.nextInt();
        // Ask the user to enter a symbol.
        System.out.println("Enter symbol to use:");
        // Read the symbol entered by the user.
        symbol = scanner.next();
        // Start the for  outer loop to control the rows.
        for (int i = 1; i <= rows; i++) {
            // Move to a new line for each row.
            System.out.println();
            // Start the for inner loop to control the columns.
            for (int j = 1; j <= columns; j++) {
                // Print the symbol without moving to a new line.
                System.out.print(symbol);
            }
        }
    }
}
