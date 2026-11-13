import java.util.Scanner;

public class   {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5]; // Create an array of size 5

        System.out.println("Enter 5 Numbers:");
        // Loop to take 5 inputs from the keyboard
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        System.out.println("\nArray in Reverse Order:");
        // Loop backwards from the last index to 0 to print in reverse
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
}