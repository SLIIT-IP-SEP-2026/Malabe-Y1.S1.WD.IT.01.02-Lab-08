import java.util.Scanner;
public class IT26102479Lab8Q4 {

    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int i = 0;

        while (i < 8) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int id = scanner.nextInt();

            if (id <= 0) {
                System.out.println("Error Message");
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[i] = id;
                i++;
            }
        }

        System.out.print("Enter a Student ID to Search: ");
        int searchId = scanner.nextInt();

        boolean found = false;
        for (int id : studentsArray) {
            if (id == searchId) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
    }
}
