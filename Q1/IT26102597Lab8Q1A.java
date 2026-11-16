import java.util.Scanner;

public class IT26102597Lab8Q1A {

    public static void main(String[] args) {

        int myArray[] = new int[5];

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input 5 Numbers into the Array
        System.out.println("Enter 5 Numbers:");

        for (int count = 0; count < myArray.length; count++) {

            System.out.print("Enter Number " + (count + 1) + ": ");
            myArray[count] = input.nextInt();
        }

        // Print Array in Reverse Order
        System.out.println("\nArray in Reverse Order:");

        for (int count = myArray.length - 1; count >= 0; count--) {

            System.out.print(myArray[count] + " ");
        }

        System.out.println();

    }
}
