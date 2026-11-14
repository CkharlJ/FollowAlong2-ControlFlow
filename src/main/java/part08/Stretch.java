package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5591s
//        rewatch 1:33:11–1:36:00 for the three parts of a for loop
// Guide: GUIDE.md in this folder, steps 2–5 and 8
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            /* MY GUESS
            as it's a for loop it will go through to print 1 2 3
             */
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 5; i > 0; i -= 2) {
            /* MY GUESS
            it will be print i is 5 at first and -2 on it will be i is 3 and -2 again will be i is 1 and it stops
             */
            System.out.println("i is " + i);
        }

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                /* MY GUESS
                it will print 3 asterix ***
                and the another will print another 3 asterix ***
                 */
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }
    }
}