import java.util.Scanner;

  public class IT26102487Lab8Q1B {
    public static void main(String[] args) {
	
	    // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
		// array for 5 inputs
		int[] myArray = new int[5];
		
		// array for even numbers
        int[] evenArray = new int[5];
		
		// default values are 0,0,0,0,0
         System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Find even numbers and store in evenArray
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[index] = myArray[i];
                index++;
            }
        }

        // Print myArray
        System.out.println("\nmyArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }

        // Print evenArray
        System.out.println("\n\nevenArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }

        input.close();
    }
}