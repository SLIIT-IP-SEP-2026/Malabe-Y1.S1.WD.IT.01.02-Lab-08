import java.util.Scanner;
public class IT26102737Lab8Q1A
{
	public static void main(String[] args)
	{
		int[] myArray = new int[5];
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter 5 numbers:");
	
		for(int i = 0;i < 5;i++)
		{
			System.out.print("Enter number " + (i + 1) + ": ");
			myArray[i] = sc.nextInt();
		}
		System.out.println("\nArrey in revers order :" );
		for (int i = 4;i >= 0;i--)
		{			
			System.out.print(myArray[i] + " ");
		}
	}
}	