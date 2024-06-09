import java.util.Scanner;

public class Weekdays
{
    public static void main(String[] args)

    {
        // Array to store the names of the weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the day position
        System.out.print("Enter day position (0 for Sunday, 6 for Saturday): ");
        int dayPosition = scanner.nextInt();

        // Attempt to access the array element and handle potential exceptions
        try
        {
            String dayName = weekdays[dayPosition];
            System.out.println("The day is: " + dayName);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid day position! Please enter a number between 0 and 6.");
        }

        // Close the scanner
        scanner.close();
    }
}

//output

//Enter day position (0 for Sunday, 6 for Saturday): 3
//The day is: Wednesday



//Enter day position (0 for Sunday, 6 for Saturday): 7
//Invalid day position! Please enter a number between 0 and 6.

