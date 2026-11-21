import java.util.Scanner;

public class IT26102492Lab8Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        int count = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[count] = myArray[i];
                count++;
            }
        }

        System.out.println("\nEven Numbers:");

        for (int i = 0; i < count; i++) {
            System.out.print(evenArray[i] + " ");
        }

        
    }
}