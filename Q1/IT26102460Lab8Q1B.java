import java.util.Scanner;
public class IT26102460Lab8Q1B{
	public static void main(String[] args){
		//Create scanner object
		Scanner input = new Scanner(System.in);
		//Creating Array with size 5
		int myArray [] = new int[5];
		int evenArray [] = new int[5];
		int number, evenCount;
		evenCount = 0;
		//Getting inputs to put in myArray
		for(int i=0; i<myArray.length; i++){
			System.out.print("Enter a number " + (i+1) +": ");
			number = input.nextInt();
			myArray[i] = number;
			
			//Selecting even no. from myArray
			if(myArray[i] % 2 == 0){
				evenArray[evenCount] = myArray[i];
				evenCount++;
			}
		}
		
		//Printing the myArray
		System.out.println("\nmyArray contents:");
		for(int j=0; j < myArray.length; j++){
			System.out.print(myArray[j] + " ");
		}
		
		//Printing the evenArray
		System.out.println("\nevenArray contents:");
		for(int a=0; a < evenArray.length; a++){
			System.out.print(evenArray[a] + " ");
		}
		
	}
}