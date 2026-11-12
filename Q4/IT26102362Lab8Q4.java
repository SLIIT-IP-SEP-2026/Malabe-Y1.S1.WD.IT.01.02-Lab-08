import java.util.Scanner;
public class IT26102362Lab8Q4{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		int studentsArray[] = new int[8];
		int i = 0, studentID;
		boolean found = false;
		
		while(i < studentsArray.length){
			System.out.print("Enter Student ID for Student "+(i+1)+": ");
			studentID = input.nextInt();
			if(studentID <= 0){
				System.out.println("Erorr: Please Enter ONLY Positive Numbers");
				continue;
			}
			studentsArray[i] = studentID;
			i++;
		}
		
		System.out.print("\nEnter a Student ID to search: ");
		studentID = input.nextInt();
		
		for(i=0; i<studentsArray.length; i++){
			if(studentID == studentsArray[i]){
				System.out.println("\nStudent is Available");
				found = true;
				break;
			}
		}
		
		if(found == false){
			System.out.println("\nStudent is Not Available");
		}
	}
}

