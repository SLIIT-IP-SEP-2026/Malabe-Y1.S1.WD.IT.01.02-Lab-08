import java.util.Scanner;
public class IT26100181Lab8Q1A{
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
		System.out.println("Array in Reverse Order: ");
		
		//Printing the array...
		for(int i = myArray.length-1; i > 0; i--){
			System.out.print(myArray[i] + " ");
		}	
	}
}
