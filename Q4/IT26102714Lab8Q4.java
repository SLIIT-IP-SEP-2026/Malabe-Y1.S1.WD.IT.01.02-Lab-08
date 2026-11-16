
import java.util.Scanner;

public class IT26102714Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        // Enter Student IDs
        for (int i = 0; i < studentsArray.length; i++) {

            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int id = input.nextInt();

            // Check for negative or zero numbers
            while (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");

                System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
                id = input.nextInt();
            }

            studentsArray[i] = id;
        }

        // Search for a Student ID
        System.out.print("\nEnter a Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;

        // Search the array
        for (int i = 0; i < studentsArray.length; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        // Display search results
        if (found) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }

        input.close();
    }
}
