import java.util.Scanner;
public class IT26102049Lab8Q3{
	public static void main (String[]args){
	
	Scanner sc = new Scanner(System.in);
	int [] numbers = new int[6];
	int count = 0;
	
	while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int input = sc.nextInt();

            if (input > 0) {
                numbers[count] = input;
                count++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        int max = numbers[0];
        System.out.println("\nArray Contents:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
	}
}