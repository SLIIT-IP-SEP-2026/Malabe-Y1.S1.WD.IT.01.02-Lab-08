import java.util.Scanner;

public class IT26102049Lab8Q4 {
    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int count = 0;

        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int id = mc.nextInt();

            if (id > 0) {
                studentsArray[count] = id;
                count++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int searchId = mc.nextInt();

        boolean isAvailable = false;
        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchId) {
                isAvailable = true;
                break;
            }
        }

        if (isAvailable) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }
    }
}