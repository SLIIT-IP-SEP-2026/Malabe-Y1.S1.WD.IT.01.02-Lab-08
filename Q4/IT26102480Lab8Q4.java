import java.util.Scanner;
public class IT26102480Lab8Q4{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		int studentsArray[] = new int[8];
		
		//INSERT STUDENT ID AND CHECK ID
		int studentCount=0;
		
		while( studentCount<studentsArray.length){
			System.out.print("Enter Student ID for Student "+(studentCount+1)+": ");
			int studentId = sc.nextInt();
			
			if(studentId <= 0){
				System.out.println("Error : Please Enter ONLY Positive Numbers");
			}
			
			else {
				studentsArray[studentCount] = studentId;
				studentCount++;
			}
		}
		
			//SEARCH STUDENT ID
			
			System.out.print("Enter a Student ID to search :");
			int searchID = sc.nextInt();
			
			boolean available = false;
			
			for(studentCount=0 ; studentCount<studentsArray.length ; studentCount++){
			
				if(searchID==studentsArray[studentCount]){
					available=true;
					break;
				}
			}
			
			// Display the search result
			if (available) {
				System.out.println("Student is Available");
			} 
			else {
				System.out.println("Student is Not Available");
			
			}
		
		
	}

}