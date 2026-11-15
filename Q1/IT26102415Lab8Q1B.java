import java.util.Scanner;
public class  IT26102415Lab8Q1B{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int[] myArray = new int[5];
		int[] evenArray = new int[5];
		
		int count = 0;
		System.out.println("Enter 5 numbers: ");
		
		//input numbers
		for(int i = 0; i < 5; i++){
			System.out.print("Enter Number " + (i + 1)+": ");
			myArray[i] = input.nextInt();
		}
		
		//print array in reverse order
		
		System.out.println("myArray Contents: ");
		
		for(int i =0; i<5; i++){
			System.out.print(myArray[i] + " ");
		}
		
		// Find even numbers and store in evenArray
        for (int i = 0; i < 5; i++) {

            if (myArray[i] % 2 == 0) {

                evenArray[count] = myArray[i];
                count++;
            }
        }

        // Display evenArray 
        System.out.println("\n\nevenArray Contents:");

        for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }
	}
}