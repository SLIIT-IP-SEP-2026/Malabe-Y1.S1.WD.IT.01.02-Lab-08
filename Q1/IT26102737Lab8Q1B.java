import java.util.Scanner;
public class IT26102737Lab8Q1B
{
	public static void main(String[] args)
	{
		int Q = 0;
		int[] myArray = new int[5];
		int[] evenArrey = new int[5];
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter 5 numbers:");
	
		for(int i = 0;i < 5;i++)
		{
			System.out.print("Enter number " + (i + 1) + ": ");
			myArray[i] = sc.nextInt();
		}
		System.out.println("\nArrey contents:");
		for (int i = 0;i < 5;i++)
		{			
			System.out.print(myArray[i] + " ");
		}
		System.out.println("\n\nevenArrey contents:");
		for(int j = 0;j < 5;j++)
		{
			if(myArray [j]%2 == 0)
			{
				evenArrey[Q] = myArray[j];
				Q++;
			}
		}	
		for(int j = 0; j < 5; j++)
		{	
			System.out.print(evenArrey[j] + " ");
		}
		
	}
}	