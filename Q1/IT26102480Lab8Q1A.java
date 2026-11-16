import java.util.Scanner;
public class IT26102480Lab8Q1A{
	public static void main (String[]args){
		
		//create new scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 Numbers");
		
		//create array 
		
		int myArray[]= new int[5];
		
		//input valuve to array
		for(int i=0 ; i<myArray.length ; i++){
			System.out.print("Enter the Number"+(i+1)+ " : ");
			myArray[i]=sc.nextInt();
			System.out.println();
		}
		
		System.out.println("\nArray in Reverse Oder:");
		
		//display array values
		for ( int i= myArray.length-1; i>=0 ; i--){
			System.out.print(myArray[i] + " ");
		}
		
		
		
		
	}
}