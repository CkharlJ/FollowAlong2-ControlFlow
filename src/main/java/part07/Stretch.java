package part07;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        rewatch 81:35–87:47 for && || !, 89:29–91:54 for while
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// If your program never stops: click the red square (Stop) in the Run window.

public class Stretch {
    public static void main(String[] args) {
        int x = 7;
        /*MY GUESS
        It will be printed out True
         */
        System.out.println(x > 5 && x < 10);
        /* MY GUESS
        It will be printed False
         */
        System.out.println(x > 5 && x > 10);
        /* MY GUESS
        it will be  printed out True
         */
        System.out.println(x < 5 || x == 7);
        /* MY GUESS
        That will print False
         */
        System.out.println(!(x == 7));
        int count = 3;
        while (count > 0) {
            /* MY GUESS
            It will be printed 3
            // I thought it was asking for the only one output , but i did not go through the while loop.
             */
        System.out.println("count is " + count);
        count = count -1;
        }
        /* MY GUESS
        It will be printed out done
         */
        System.out.println("done");

        int countdown = 5;
        while (countdown > 0 ) {
            System.out.println(countdown);
            countdown--;

            System.out.println("Liftoff!");


            Scanner scanner = new Scanner (System.in);
            String password = "";
            while (!password.equals("javal123")) {
                System.out.print("Password: ");
                password = scanner.nextLine();
                System.out.println("Access granted");

                int number = 0;
                while (number < 1 || number > 10) {
                    System.out.print("Pick a number from 1 to 10:");
                    number = scanner.nextInt();
                System.out.println("You picked " + number);

                }
            }
        }






    }
}