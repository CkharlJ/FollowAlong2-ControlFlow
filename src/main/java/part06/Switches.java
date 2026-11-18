package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Switches {
    public static void main(String[] args) {
        // Create a String variable called day and set it to Pizza.
        String day = "Pizza";
        // Check the value of day using a switch statement.
        switch (day) {
            // Check if day is Sunday.
            case "Sunday":
                // Print a message for Sunday.
                System.out.println("It is Sunday");
                // Stop this case.
                break;
            // Check if day is Monday.
            case "Monday":
                // Print a message for Monday.
                System.out.println("It is Monday");
                // Stop this case.
                break;
            // Check if day is Tuesday.
            case "Tuesday":
                // Print a message for Tuesday
                System.out.println("It is Tuesday");
                // stop this case
                break;
            // Check if day is Wednesday
            case "Wednesday":
                // Print a message for Wednesday
                System.out.println("It is Wednesday");
                // stop this case
                break;
            // Print a message for Thursday
            case "Thursday":
                // Print a message for Thursday
                System.out.println("It is Thursday");
                // stop this case
                break;
            // Check if day is Friday
            case "Friday":
                // Print a message for Friday
                System.out.println("It is Friday");
                // stop this case
                break;
            // check if day is Saturday
            case "Saturday":
                // Print the message for Saturday
                System.out.println("It is Saturday");
                // stop the case
                break;
            // Run this if day does not match any case.
            default:
                // Print that the entered value is not a day.
                System.out.println(day + " is not a day");
        }
    }
}

