import java.util.Scanner;

public class IT26102405Lab8Q3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int userInput, largestNum = 0;
		int[] numArray = new int[6];
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.print("Enter a Positive Number (" + (i+1) + "/6): ");
			userInput = input.nextInt();
			
			while (userInput <= 0) {
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				System.out.print("Enter a Positive Number (" + (i+1) + "/6): ");
				userInput = input.nextInt();
			}
			
			numArray[i] = userInput;
		}
		
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] > largestNum) {
				largestNum = numArray[i];
			}
			
		}
		
		System.out.println();
		
		System.out.println("Array Contents:");
		for (int i = 0; i < 6; i++) {
			System.out.print(numArray[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("The Maximum Number Entered: " + largestNum);
	
	}

}