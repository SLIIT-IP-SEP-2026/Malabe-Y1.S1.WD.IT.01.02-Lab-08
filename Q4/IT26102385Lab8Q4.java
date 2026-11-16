import java.util.Scanner;

public class IT26102385
Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int id;

        for (int i = 0; i < 8; i++) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            id = input.nextInt();

            if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                i--; 
            } else {
                studentsArray[i] = id;
            }
        }

        System.out.println();
        System.out.print("Enter a Student ID to Search: ");
        int searchID = input.nextInt();

        
        boolean found = false;
        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        System.out.println();
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}