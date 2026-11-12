import java.util.Scanner;
public class IT26100181Lab8Q1B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Creating an Array...
		int[] myArray = new int[5];
		
		System.out.println("Enter 5 Numbers : ");
		//Getting the inputs to the array...
		for(int i = 0; i < myArray.length; i++){
			System.out.printf("Enter Number %d : ",i+1);
			myArray[i] = input.nextInt();
		}
		
		System.out.println();
		System.out.println("myArray Contents : ");
		
		//Printing the array...
		for(int i = 0; i < myArray.length; i++){
			System.out.print(myArray[i] + " ");
		}
		
		//Storing even nummbers in the evenArray...
		int[] evenArray = new int[myArray.length];
		int evenIndex = 0;
		for(int i = 0; i < evenArray.length; i++){
			//Checking the number is whether even or not...
			if(myArray[i] % 2 == 0){
				evenArray[evenIndex] = myArray[i];
				evenIndex++;
			}
		}
		
		System.out.println();		
		System.out.println();
		System.out.println("myArray Contents : ");
		
		//Printing the evenArray elements...
		for(int i = 0; i < evenArray.length; i++){
			System.out.print(evenArray[i] + " ");
		}
	
	}
}
