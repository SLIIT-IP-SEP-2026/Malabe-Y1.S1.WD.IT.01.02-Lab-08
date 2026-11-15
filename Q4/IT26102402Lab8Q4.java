import java.util.Scanner;
public class  IT26102402Lab8Q4{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int[] studentsArray = new int[8];
		int i = 0;
		int num;
		
		
		//Entering student IDs
		while(i<8){
			System.out.print("Enter  student ID for Student" + (i + 1) + ": ");
			num = input.nextInt();
			
			if(num > 0){
				studentsArray[i] = num;
				i++;
			}else{
				System.out.println("Error: Please enter ONLY positive numbers");
			}
		}
		
		//Searching for a student ID
		System.out.println();
		System.out.print("Enter a Student ID to search: ");
		int searchId = input.nextInt();
		
		boolean found = false;
		
		for(int y = 0; y < 8; y++){
			if(studentsArray[y] == searchId){
				found = true;
				System.out.print("Student is Available");
				break;
			}
		}
		
		
		
	}
}