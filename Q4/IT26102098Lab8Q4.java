import java.util.Scanner;

public class IT26102098Lab8Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int[] studentsArray = new int[8];
		int i = 0;
		
		while (i < studentsArray.length) {
			System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
			int id = input.nextInt();
			
			if (id <= 0) {
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				
			} else {
				studentsArray[i] = id;
				i++;
			}
		}
		
		System.out.print("\nEnter a Student ID to Search: ");
		int searchID = input.nextInt();
		
		boolean found = false;
		
		for (int j = 0; j < studentsArray.length; j++) {
			if (studentsArray[j] == searchID) {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println("\nStudent is Available");
			
		} else {
			System.out.println("\nstudent is Not Available");
		}
	}
}