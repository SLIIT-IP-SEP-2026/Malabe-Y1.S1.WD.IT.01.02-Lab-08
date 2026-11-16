import java.util.Scanner;

public class IT26102591Lab8Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int myArray[] = new int[5];
        int i;

        for (i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            myArray[i] = input.nextInt();
        }

        System.out.println("Array in reverse order:");

        for (i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
    }
}