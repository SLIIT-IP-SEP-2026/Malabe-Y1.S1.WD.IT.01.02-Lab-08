import java.util.Scanner;
public class IT26102567Lab8Q1A{
	public static void main(String[]args){ 
	
	Scanner input = new Scanner(System.in);
	int[] myArray = new int[5];
	
	//Input 5 number using keyboard
	System.out.println("Enter 5 numbers:");
	for(int i = 0; i < myArray.length; i++){ 
	System.out.print("Enter a number " + (i + 1) + ": ");
	myArray[i] = input.nextInt();
	}
	
	System.out.print("Array in Reverse Order: ");
	for(int i = myArray.length - 1; i >= 0; i--){
		System.out.print(myArray[i] + " ");
		
	}
	System.out.println();
	
	input.close();
	
	}
	
}	