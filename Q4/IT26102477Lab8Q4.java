import java.util.Scanner;
public class IT26102477Lab8Q4{
    public static void main(String [] args){
	
	int userInput;
	int searchID;
	
	boolean status = true;
	boolean found = false;
	
	int[] studentsArray = new int[0];
	
	Scanner input = new Scanner(System.in);
	
	for(int count = 0; count < studentsArray.length; count++) {
		
		while (status) {
			System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
			userInput = input.nextInt();
			
			if (userInput > 0) {
				studentsArray[count] = userInput;
				break;
			}
			else {
				System.out.println("Error: Please enter only positive numbers");
			}
		} System.out.println();
	}
	     
		 
		 System.out.print("Enter a student ID to search: ");
		 searchID = input.nextInt();
		 
		 for(int count = 0; count < studentsArray.length; count++) {
			 
			 if (studentsArray[count] == searchID) {
				 found = true;
				 break;
			 }
		 }
		 System.out.println();
		 
		 if (found) {
			 System.out.println("Student is Available");
		 }
		 else {
			 System.out.println("Student is not Available");
		 }
	}
	}