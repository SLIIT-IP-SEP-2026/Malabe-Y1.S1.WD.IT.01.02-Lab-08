import java.util.Scanner;

public class IT26102736Lab8Q3 {
    public static void main(String[] args) {
		
		//Craeting scanner object
        Scanner input = new Scanner(System.in);
		
		//Defining array and count with i
        int[] numbers = new int[6];
        int i = 0;

        //looping and checking to make sure only positive numbers are accepted for the array
        while (i < numbers.length) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = input.nextInt();

            if (num > 0) {
                numbers[i] = num;
                i++; // Only increment index if the number is valid
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        // Assume first element is max, then loop through to find the true maximum
        int max = numbers[0];
        System.out.println("\nArray Contents:");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
            if (numbers[j] > max) {
                max = numbers[j];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);
    }
}