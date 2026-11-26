import java.util.Scanner;

public class IT26102000Lab8Q3{
	
	public static void main(String[] args){
		
		int[] numbers = new int[6];
		int count = 1;
		int maxNumber;
	
		Scanner input = new Scanner(System.in);
		
		//entering array contents and checking whether an input is positive 
		for(int i = 0; i < 6; i++){
			
			while(true){
			System.out.print("Enter a positive number (" + count + "/6): ");
			
			numbers[i] = input.nextInt();
			
			if(numbers[i] > 0){
				count++;
				break;
			}
			
			System.out.println("Error: Please enter ONLY positive numbers.\n");
		  
		  }
			
	    }
		
		System.out.println();
		
		//displaying array content
		
		System.out.println("Array contents:");
		
		for(int i = 0; i < 6; i++){
			
			System.out.print(numbers[i] + " ");
			
		}
		
		maxNumber = numbers[0];
		
		for(int i = 1; i < 6; i++){
			
			if(maxNumber < numbers[i]){
				maxNumber = numbers[i];
			}
		}
		
	    System.out.println("\nThe maximum number entered: " + maxNumber); 
	}
	
}