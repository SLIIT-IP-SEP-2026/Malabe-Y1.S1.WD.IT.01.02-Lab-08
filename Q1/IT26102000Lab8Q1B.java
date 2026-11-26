import java.util.Scanner;

public class IT26102000Lab8Q1B{
	
	public static void main(String[] args){
		
		int count = 0;
		
		//creating arrays
		int[] myArray = new int[5];
		int[] evenArray = new int[5];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		
		//storing values to the array
		for(int i = 0; i < 5; i++){
			
			System.out.print("Enter number "+(i+1)+": ");
			myArray[i] = input.nextInt();
			
		}
		
		System.out.println();
		System.out.println("myArray content: ");
		
		//displaying array content in reverse order
		for(int i = 0; i < 5; i++){
			
			System.out.print(myArray[i]+" ");
		}
		
		System.out.println("\n");
		
		//finding the even numbers in myArray and storing them in evenArray
		for(int i = 0; i < 5; i++){
			
			if(myArray[i] % 2 == 0){
				
				evenArray[count] = myArray[i];
				count++;
				
			}
		}
		
		//displaying evenArray content
		System.out.println("evenArray content: ");
		
		for(int i = 0; i < 5; i++){
			
			System.out.print(evenArray[i]+" ");
		}
		
		System.out.println();
		
	}
}