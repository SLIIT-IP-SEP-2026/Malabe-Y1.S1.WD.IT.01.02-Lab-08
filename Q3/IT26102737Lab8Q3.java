import java.util.Scanner;

public class IT26102737Lab8Q3
{
	public static void main(String[] args)
	{
		int number[] = new int[6];
		int numberCount = 0;
		int inputnum;
		
		Scanner input = new Scanner(System.in);
		
		while(numberCount < 6)
		{
			System.out.print("Enter a Positive Number (" + (numberCount+1) + "/6): ");
			inputnum = input.nextInt();
			
			if(inputnum > 0)
			{
				number[numberCount] = inputnum;
				numberCount++;
			}
			else{
				System.out.println("Error: Please Enter ONLY Positive Numbers");
			}	
		}
		int maxNumber = number[0];
		
		for (int count = 0; count< number.length; count++)
		{
			if(number[count] > maxNumber)
			{
				maxNumber = number[count];
			}
		}
		System.out.println("\nArray Contents:");
		for (int count = 0; count < number.length; count++)
		{	
			System.out.print(number[count] + " ");
		}
		
		System.out.println();
		
		System.out.println("The Maximum Number Entered: " +maxNumber);
	}
}	