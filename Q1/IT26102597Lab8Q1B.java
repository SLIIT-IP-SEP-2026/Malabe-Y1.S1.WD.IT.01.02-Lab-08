import java.util.Scanner;

public class IT26102597Lab8Q1B {

    public static void main(String[] args) {

        int myArray[] = new int[5];
        int evenArray[] = new int[5];

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input 5 Numbers into the Array
        System.out.println("Enter 5 Numbers:");

        for (int count = 0; count < myArray.length; count++) {

            System.out.print("Enter Number " + (count + 1) + ": ");
            myArray[count] = input.nextInt();
        }

        // Print myArray Contents
        System.out.println("\nmyArray Contents:");

        for (int count = 0; count < myArray.length; count++) {

            System.out.print(myArray[count] + " ");
        }

        // Find Even Numbers and Store in evenArray
        int evenCount = 0;

        for (int count = 0; count < myArray.length; count++) {

            if (myArray[count] % 2 == 0) {

                evenArray[evenCount] = myArray[count];
                evenCount++;
            }
        }

        // Print evenArray Contents
        System.out.println("\n\nevenArray Contents:");

        for (int count = 0; count < evenArray.length; count++) {

            System.out.print(evenArray[count] + " ");
        }

        System.out.println();

    }
}
