import java.util.Scanner;

public class IT26102574Lab8Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int myArray[] = new int[6];

        int i = 0;

        // Input 6 positive numbers
        while (i < 6) {

            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
            else {
                myArray[i] = num;
                i++;
            }
        }

        // Find the maximum number
        int max = myArray[0];

        for (int j = 1; j < 6; j++) {
            if (myArray[j] > max) {
                max = myArray[j];
            }
        }

        // Display array contents
        System.out.println("\nArray Contents:");

        for (int j = 0; j < 6; j++) {
            System.out.print(myArray[j] + " ");
        }

        // Display maximum number
        System.out.println("\n\nMaximum Number: " + max);

        input.close();
    }
}