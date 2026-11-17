import java.util.Scanner;
public class IT26102479Lab8Q3 {

    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        int i = 0;

        while (i < 6) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Error Message");
                System.out.println("Error: Please Enter ONLY Positive Numbers");
				
            } else {
                arr[i] = num;
                i++;
            }
        }

        System.out.println("Array Contents:");
		
        int max = arr[0];
        for (int num : arr) {
            System.out.print(num + " ");
            if (num > max) {
                max = num;
            }
        }
		
        System.out.println();
        System.out.println("The Maximum Number Entered: " + max);
    }
}
