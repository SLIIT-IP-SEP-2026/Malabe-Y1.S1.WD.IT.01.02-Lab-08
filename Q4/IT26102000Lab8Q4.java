import java.util.Scanner;

public class IT26102000Lab8Q4{
	
	public static void main(String[] args){
		
		int[] studentArray = new int[8];
		int studentNum;
		int searchID;
		
		boolean found = false;
		
		Scanner input = new Scanner(System.in);
		
		for(studentNum = 0; studentNum < 8; studentNum++){
			
			while(true){
				
				System.out.print("Enter student ID for student" +(studentNum+1)+ ": ");
				studentArray[studentNum] = input.nextInt();
				
				if(studentArray[studentNum] > 0){
					break;
				}
				else{
					System.out.println("Error: Please Eneter ONLY Positive Numbers.");
				}
			}
		}
		
		System.out.print("\nEnter a student ID to search: ");
		searchID = input.nextInt();
		
		for(studentNum = 0; studentNum < 8; studentNum++){
			
			if(studentArray[studentNum] == searchID){
				
			found = true;
			break;
			
			}
		}
		
		System.out.println();
		
		if(found){
			System.out.println("Student is available.");
		}
		else{
			System.out.println("Student is not available.");
		}
	}
}