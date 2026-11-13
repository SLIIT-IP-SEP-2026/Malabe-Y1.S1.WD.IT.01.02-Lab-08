import java.util.Scanner;

public class IT26102649Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int i = 0;

        // Loop to input 8 valid positive Student IDs with error validation
        while (i < studentsArray.length) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int id = input.nextInt();

            if (id > 0) {
                studentsArray[i] = id;
                i++; // Move to next student slot
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        // Ask user for a Student ID to search
        System.out.print("\nEnter a Student ID to Search: ");
        int searchID = input.nextInt();
        boolean isFound = false; // Flag to track search status

        // Search the array for the ID
        for (int j = 0; j < studentsArray.length; j++) {
            if (studentsArray[j] == searchID) {
                isFound = true;
                break; // Exit loop early if found
            }
        }

        // Output search results
        if (isFound) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }
    }
}