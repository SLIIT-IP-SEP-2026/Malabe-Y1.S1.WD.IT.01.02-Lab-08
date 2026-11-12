import java.util.Scanner;
public class IT26100181Lab8Q4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Making the studentArray..
		int[] studentArray = new int[8];
		
		//Getting the inputs to studentArray...
		for(int i = 0; i< studentArray.length; i++){
			System.out.printf("Enter student ID for Student %d: ",i+1);
			studentArray[i] = input.nextInt();
			
			//Cheking the input is a negative or not...
			if(studentArray[i] <= 0){
				System.out.println("Error: Please Enter ONLY Positive numbers");
				i--;
				continue;
			}
		}
		
		System.out.println();
		//Cheking student's availability...
		
		while(true){
			boolean found = false;
			
			//Stdent cheking...
			System.out.print("Enter a student ID to search : ");
			int stuCheck = input.nextInt();
			
			if(stuCheck == -1){
				return;
			}else{
				for(int i =0; i< studentArray.length; i++){
					if(stuCheck == studentArray[i]){
						found = true;
					}
				}
				
				if(found == true){
					System.out.println("Student is Avalable");
				}else{
					System.out.println("Student is not Avalable");
				}
			}
		}
	}
}	
