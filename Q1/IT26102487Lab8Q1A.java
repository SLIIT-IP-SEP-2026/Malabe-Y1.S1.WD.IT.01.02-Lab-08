import java.util.Scanner;

 public class IT26102487Lab8Q1A {
    public static void main(String[] args) {
	
	
	    // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];

        System.out.println("Enter 5 Numbers:");
        
        // Input numbers to array
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        System.out.println("\nArray in Reverse Order:");
        
        // Print in reverse order
        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }

        input.close();
    }
}