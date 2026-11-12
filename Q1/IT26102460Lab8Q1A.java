import java.util.Scanner;
public class IT26102460Lab8Q1A{
	public static void main(String[] args){
		//Create scanner object
		Scanner input = new Scanner(System.in);
		//Creating Array with size 5
		int myArray [] = new int[5];
		int number;
		//Getting inputs to put in Array
		for(int i=0; i<myArray.length; i++){
			System.out.print("Enter a number " + (i+1) +": ");
			number = input.nextInt();
			myArray[i] = number;
		}
		System.out.println("\nArray in Reverse order.");
		
		//Printing the Array in reverse order
		for(int j=myArray.length-1; j>=0; j--){
			System.out.print(myArray[j] + " ");
		}
		
	}
}