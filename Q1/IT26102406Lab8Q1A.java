import java.util.Scanner;
public class IT26102406Lab8Q1A
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int[] myarray = new int [5];
		
		System.out.println("Enter 5 numbers: ");
		for (int i = 0; i < myarray.length; i++){ 
			System.out.print("Number " + (i + 1) + ": ");
			myarray[i] = input.nextInt();
		}
			System.out.println(); 
			
		System.out.println("Array in Reverse Order: ");
		for (int i = myarray.length - 1; i >= 0; i--){
			System.out.print(myarray[i] + " ");
		}
	}
	
}