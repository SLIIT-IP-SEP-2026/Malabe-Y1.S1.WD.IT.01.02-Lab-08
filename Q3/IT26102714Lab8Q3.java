import java.util.Scanner;

public class IT26102714Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int count = 0;
        int max;

        // Get 6 positive numbers
        while (count < 6) {

            System.out.print("Enter a positive number: ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error Message: Please enter a positive number.");
            } else {
                numbers[count] = num;
                count++;
            }
        }

        // Find maximum number
        max = numbers[0];

        for (int i = 1; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display array elements
        System.out.println("\nArray elements:");

        for (int i = 0; i < 6; i++) {
            System.out.println(numbers[i]);
        }

        // Display maximum number
        System.out.println("Maximum number = " + max);

        input.close();
    }
}