import java.util.Scanner;
public class IT26102480Lab8Q3{
	public static void main (String[]args){
		
		int numberArray[]=new int[6];
		int numberCount = 0;
		int userInput;
		
		//create scanner object for input
		Scanner sc = new Scanner (System.in);
		
		//capture 6 positive number 
		while (numberCount<6){
			
			System.out.print("Enter a positive Number (" + (numberCount+1) + "/6): ");
			userInput=sc.nextInt();
			
			if(userInput >0){
				numberArray[numberCount]=userInput;
				numberCount++;
			}
			else{
				System.out.println("Error: Please enter only positive Number");
			}
		}

		int maxNumber = numberArray[0];
		
		//Find the maximum number
		
		for (int count =0;count<numberArray.length;count++){
			if (numberArray[count]>maxNumber){
				maxNumber=numberArray[count];
			}
			
		}
		
		//print number array
		
		System.out.println("\nArray Cintents:");
		for (int count =0;count<numberArray.length;count++){
			System.out.print(numberArray[count] + " ");
		}
			
		System.out.println();
			
		
		System.out.println("The maximum number Entered:"+maxNumber);
		
	}

}