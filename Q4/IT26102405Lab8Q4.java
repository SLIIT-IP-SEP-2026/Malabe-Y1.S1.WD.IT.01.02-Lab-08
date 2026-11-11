import java.util.Scanner;

public class IT26102405Lab8Q4 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int[] studentsArray = new int[8];
		int userInput, searchID;
		
		for (int i = 0; i < 8; i++) {
			System.out.print("Enter Student ID for Student " + (i+1) + ": ");
			userInput = input.nextInt();
			
			while (userInput <= 0) {
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				System.out.print("Enter Student ID for Student " + (i+1) + ": ");
				userInput = input.nextInt();
			}
			
			studentsArray[i] = userInput;
			
		}
		
		System.out.println();
		
		System.out.print("Enter a Student ID to Search: ");
		searchID = input.nextInt();
		
		System.out.println();
		
		boolean studentFound = false;
		for (int i = 0; i < 8; i++) {
			if (studentsArray[i] == searchID) {
				studentFound = true;
			}
		}
		
		if (studentFound) {
			System.out.println("Student is Available");
		}
		else {
			System.out.println("Student is Not Available");
		}
		
	
	
	}


}