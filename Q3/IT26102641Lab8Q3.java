import java.util.Scanner;

public class IT26102641Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        int[] myArray = new int[6];

        // Take 6 positive numbers
		
        for (int a = 0; a < 6; ) {
            System.out.print("Enter a Positive Number (" + (a + 1) + "/6): ");
			
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                myArray[a] = num;
                a++;
            }
        }
		// Find maximum
		
		int max = myArray[0];
        for (int b = 1; b < 6; b++) {
            if (myArray[b] > max) {
                max = myArray[b];
            }
        }

        System.out.println("Array Contents:");
		
        for (int b = 0; b < 6; b++) {
            System.out.print(myArray[b] + " ");
        }

        System.out.println();
        System.out.println("The Maximum Number Entered: " + max);
    }
}