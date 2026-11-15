import java.util.Scanner;

public class IT26102574Lab8Q1b {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        int j = 0;

        System.out.println("Enter 5 Numbers:");

        // Get 5 numbers from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Display myArray contents
        System.out.println("\nmyArray Contents:");

        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }

        // Find even numbers and store in evenArray
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[j] = myArray[i];
                j++;
            }
        }

        // Display evenArray contents
        System.out.println("\n\nevenArray Contents:");

        for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }

        input.close();
    }
}