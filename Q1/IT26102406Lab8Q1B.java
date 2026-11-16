import java.util.Scanner;

public class IT26102406Lab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int count = 0;

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();

            if (myArray[i] % 2 == 0) {
                evenArray[count++] = myArray[i];
            }
        }

        System.out.println("\nmyArray Contents:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nevenArray Contents:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
    }
}