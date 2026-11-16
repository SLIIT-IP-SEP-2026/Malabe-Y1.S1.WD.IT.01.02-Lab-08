import java.util.Scanner;

public class IT26102641Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        int[] studentsArray = new int[8];
		
		// Take 8 IDs
		
        for (int a = 0; a < 8; ) {
            System.out.print("Enter Student ID for Student " + (a + 1) + ": ");
			
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[a] = num;
                a++;
            }
        }
		// Search one ID
		
        System.out.println();
        System.out.print("Enter a Student ID to Search: ");
		
        int search = input.nextInt();

        boolean found = false;
        for (int a = 0; a < 8; a++) {
            if (studentsArray[a] == search) {
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
    }
}