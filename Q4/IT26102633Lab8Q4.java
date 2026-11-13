
import java.util.Scanner;

public class IT26102633Lab8Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        // Input 8 Student IDs
        int count = 0;

        while (count < 8) {

            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int id = input.nextInt();

            if (id > 0) {
                studentsArray[count] = id;
                count++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        // Search Student ID
        System.out.print("\nEnter a Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int i = 0; i < 8; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        // Display search result
        if (found) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }

        input.close();
    }
}
