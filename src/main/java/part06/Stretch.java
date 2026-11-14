package part06;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4161s
//        rewatch 69:21–74:54 for if / else if / else, 76:36–80:18 for switch
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public  static void main(String[] args){
        int score = 85;
        if (score >= 70) {
            /* MY GUESS
            It will be printed out C or better
             */
            System.out.println("C or better");
        } else if (score >= 80) {
            /* MY GUESS
            and for this else if statement and the last else they will not run because the first if statement is true , since it's true we don't need to ask the second and third question.
             */
            System.out.println(" B or better");
        } else {
            System.out.println("Below C");
        }
        int level = 2;
        switch (level) {
            case 1:
                /* MY GUESS
                that one will not run because level starts at 2
                 */
                System.out.println("Easy");
            case 2:
                /* MY GUESS
                It will print Medium
                 */
                System.out.println("Medium");
            case 3:
                /* MY GUESS
                That one will print Hard
                 */
                System.out.println("Hard");
                break;
            default:
                /* MY GUESS
                it will not run because of the break it stops it.
                 */
                System.out.println("Unknown");
        }

        int temperature = 72;
        if (temperature >= 80) {
            System.out.println("Shorts weather");
        } else if (temperature >= 60) {
            System.out.println("Hoodie weather");
        } else {
            System.out.println("Coat weather");

        }

        int month = 4;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("That is not a month");
        }


        Scanner input = new Scanner(System.in);
        System.out.print("Battery percent: ");
        int battery = input.nextInt();
        if (battery < 20) {
            System.out.println("Low battery. Go charger!");
        } else if (battery < 80) {
            System.out.println("Battery OK");
        } else {
            System.out.println("Fully charged");
        }

    }
}
