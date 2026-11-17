import java.util.Scanner;
public class IT26102479Lab8Q1B {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
     	 int[] myArray = new int[5];
        int[] evenArray = new int[5];

        System.out.println("Enter 5 Numbers:");
      
     	  for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
          }

         for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[i] = myArray[i];
            } else {
                evenArray[i] = 0;
            }
         }

        System.out.println("myArray Contents:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("evenArray Contents:");
        for (int num : evenArray) {
            if (num == 0) {
                System.out.print("00 ");
            } else {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
