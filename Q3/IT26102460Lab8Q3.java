import java.util.Scanner;
public class IT26102460Lab8Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Creation of the numbers array with size 6
		int numbers [] = new int[6];
		int userInput, maxNumber;
		
		//Inputing 6 numbers and storing
		for(int i=0; i < numbers.length; i++){
			System.out.print("Enter a positive number (" + (i+1)+ "/6): ");
			userInput = input.nextInt();
			
			if(userInput < 0){
				System.out.println("Error:Please enter a positive number.");
				i--;
			}
			else{
				numbers[i] = userInput;
			}
		}
		//Printing the array
		System.out.println("\nNumbers Array contents:");
		for(int j=0; j < numbers.length; j++){
			System.out.print(numbers[j]+" ");
		}
		
		//Finding the max number
		maxNumber = numbers[0];
		for(int k=0; k < numbers.length; k++){
			if(numbers[k] > maxNumber){
				maxNumber = numbers[k];
			}
		}
		
		System.out.println("\nThe Maximum number entered: " + maxNumber);
	}
}