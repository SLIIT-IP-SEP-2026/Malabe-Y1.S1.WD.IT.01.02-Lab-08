import java.util.Scanner;
public class IT26102421Lab8Q4{
	public static void main(String[] args){
		
		int userInput;
		int searchID;
		
		boolean status=true;
		boolean found=false;
		
		int studentArray[]=new int[8];
		
		Scanner input=new Scanner(System.in);
		
		for(int count=0; count<studentArray.length; count++){
			
			while(status){
				
				System.out.print("Enter student ID for student"+(count+1)+": ");
				userInput=input.nextInt();
				
				if(userInput>0){
					studentArray[count]=userInput;
					break;
				}
				
				else{
					System.out.println("Error:Please enter only positive numbers");
				}
			}
		}
		
		System.out.println();
		
		System.out.print("Enter a student ID to search: ");
		searchID=input.nextInt();
		
		for(int count=0; count<studentArray.length; count++){
			
			if(studentArray[count]==searchID){
				found=true;
				break;
			}			
			
		}
		System.out.println();
		
		if(found){
			System.out.println("Student is available");
		}
		else{
			System.out.println("Student is not available");
		}
	}
}