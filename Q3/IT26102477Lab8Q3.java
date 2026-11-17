import java.util.Scanner;
public class IT26102477Lab8Q3{
    public static void main(String [] args){
	 
	 int numberArray[] = new int[6];
	 int numberCount = 0;
	 int userInput;
	 
	 Scanner obj = new Scanner(System.in);
	 
	 while (numberCount < 6){
		 System.out.print("Enter a postive Number (" + (numberCount + 1) + "/6): ");
		 userInput = obj.nextInt();
		 
		 if (userInput > 0) {
			 numberArray[numberCount] = userInput;
			 numberCount++;
		 }
		 else {
			 System.out.println("Error: Please Enter ONLY positive numbers");
		 }
	 } 
	 int maxNumber = numberArray[0];
	 
	 for (int count = 0; count < numberArray.length; count++){
		 if (numberArray[count] > maxNumber){
			 maxNumber = numberArray[count];
		 }
	 }
	 System.out.println("\nArray contents:");
	 for (int count = 0; count < numberArray.length; count++){
		 System.out.print(numberArray[count] + " ");
	 }
	 System.out.println();
	 
	 System.out.println("The Maxium Number Entered: " + maxNumber);
	}
	}