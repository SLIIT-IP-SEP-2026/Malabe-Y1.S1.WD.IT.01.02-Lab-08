
import java.util.Scanner;

public class IT26102633Lab8Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[6];
        int count = 0;

        // Input 6 positive numbers
        while (count < 6) {

            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = input.nextInt();

            if (num > 0) {
                myArray[count] = num;
                count++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        // Find maximum number
        int max = myArray[0];

        for (int i = 1; i < 6; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        // Display array contents
        System.out.println("\nArray Contents:");

        for (int i = 0; i < 6; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println("\nThe Maximum Number Entered: " + max);

        input.close();
    }
}
