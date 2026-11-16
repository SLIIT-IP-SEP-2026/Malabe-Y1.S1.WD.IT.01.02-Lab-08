import java.util.Scanner;

public class IT26102641Lab8Q1A {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		int[] myArray = new int[5];

        System.out.println("Enter 5 Numbers:");

        // Get numbers
        for (int a = 0; a < 5; a++) {
            System.out.print("Enter Number " + (a + 1) + ": ");
            myArray[a] = input.nextInt();
        }

        System.out.println("Array in Reverse Order:");

        // Print backwards
        for (int a = 4; a >= 0; a--) {
            System.out.print(myArray[a] + " ");
        }
    }
}

