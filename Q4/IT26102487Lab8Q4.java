
import java.util.Scanner;

public class IT26102487Lab8Q4 {

    public static void main(String[] args) {

        int userInput;
        int searchID;

        boolean status = true;
        boolean found = false;

        // Declare the Array with size of 8
        int[] studentsArray = new int[8];

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input Student IDs into the array
        for (int count = 0; count < studentsArray.length; count++) {

            while (status) {

                System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
                userInput = input.nextInt();

                if (userInput > 0) {
                    studentsArray[count] = userInput;
                    break; // Exit inner while loop only, on valid input
                }
                else {
                    System.out.println("Error: Please Enter ONLY Positive Numbers");
                }
            }
        }

        // Display Student ID Array
        System.out.println("\nStudent ID Array Contents:");

        for (int count = 0; count < studentsArray.length; count++) {
            System.out.print(studentsArray[count] + " ");
        }

        // Search for a Student ID
        System.out.print("\n\nEnter Student ID to Search: ");
        searchID = input.nextInt();

        // Search the Array
        for (int count = 0; count < studentsArray.length; count++) {

            if (studentsArray[count] == searchID) {
                found = true;
                break;
            }
        }

        // Display Search Result
        if (found) {
            System.out.println("Student ID " + searchID + " Found in the Array.");
        }
        else {
            System.out.println("Student ID " + searchID + " Not Found in the Array.");
        }

        input.close();
    }
}
