import java.util.Scanner;

public class IT26102641Lab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		int[] myArray = new int[5];
        int[] evenArray = new int[5];

        System.out.println("Enter 5 Numbers:");

        for (int a = 0; a < 5; a++) {
            System.out.print("Enter Number " + (a + 1) + ": ");
            myArray[a] = input.nextInt();
        }

        int b = 0;
        for (int a = 0; a < 5; a++) {
            if (myArray[a] % 2 == 0) {
                evenArray[b] = myArray[a];
                b++;
            }
        }
        System.out.println();
        System.out.println("myArray Contents:");
		
        for (int a = 0; a < 5; a++) {
            System.out.print(myArray[a] + " ");
        }
        System.out.println();
        System.out.println("evenArray Contents:");
		
        for (int a = 0; a < 5; a++) {
            System.out.print(evenArray[a] + " ");
        }
    }
}