import java.util.Scanner;
public class IT26102460Lab8Q4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int studentID;
		boolean found = false;
		//Creating Array
		int studentsArray [] = new int[8];
		
		//Input student id to students array
		for(int i=0; i < studentsArray.length; i++){
			System.out.print("Enter Student ID for Student " + (i+1)+ " : ");
			studentID = input.nextInt();
			
			if(studentID < 0){
				System.out.println("Error:Please enter ONLY positive number.");
				i--;
			}
			else{
				studentsArray[i] = studentID;
			}
		}
		
		//Find Student ID
		System.out.print("\nEnter Student ID for Search: ");
		int search = input.nextInt();
		for(int j=0; j < studentsArray.length; j++){
			if(search == studentsArray[j]){
				found = true;
			}
		}
		
		if(found){
			System.out.print("\nStudent is Available");
		}
		else{
			System.out.print("\nStudent is Not Available");
		}
	}
}
