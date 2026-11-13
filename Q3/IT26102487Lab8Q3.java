
import java.util.Scanner;

 public class IT26102487Lab8Q3 {

    public static void main(String[] args) {

        // Declare an integer array to store 6 numbers
        int numberArray[] = new int[6];

        int numberCount = 0;
        int userInput;

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Capture 6 Positive Numbers into the Array
        while (numberCount < 6) {

            System.out.print("Enter a Positive Number (" +
                    (numberCount + 1) + "/6): ");

            userInput = input.nextInt();

            if (userInput > 0) {

                // Store the Positive Number
                numberArray[numberCount] = userInput;

                numberCount++;
            }
            else {
                // Display Error Message
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        // Find the Maximum Number in the Array
        int maxNumber = numberArray[0];

        for (int count = 0; count < numberArray.length; count++) {

            if (numberArray[count] > maxNumber) {

                maxNumber = numberArray[count];
            }
        }

        // Print Number Array
        System.out.println("\nArray Contents:");

        for (int count = 0; count < numberArray.length; count++) {

            System.out.print(numberArray[count] + " ");
        }

        System.out.println();

        // Display the Maximum Number
        System.out.println("The Maximum Number Entered: " + maxNumber);

        // Close the Scanner
        input.close();
    }
}
