
import java.util.Scanner;

public class IT26102633Lab8Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        System.out.println("Enter 5 Numbers:");

        // Input numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Find even numbers
        int j = 0;

        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[j] = myArray[i];
                j++;
            }
        }

        // Display myArray
        System.out.println("\nmyArray Contents:");

        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }

        // Display evenArray
        System.out.println("\n\nevenArray Contents:");

        for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }

        input.close();
    }
}
