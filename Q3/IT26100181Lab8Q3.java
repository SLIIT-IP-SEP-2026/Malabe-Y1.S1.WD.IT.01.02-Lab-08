import java.util.Scanner;
public class IT26100181Lab8Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//making the array...
		int[] arr = new int[6];
		
		//Getting the inputs...
		for(int i = 0; i < arr.length; i++){
			System.out.printf("Enter a positive number (%d/6): ",i+1);
			arr[i] = input.nextInt();
			//checking whether input number is a positive or negative....
			if(arr[i] <= 0){
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				i--;
				continue;
			}
		}
		
		System.out.println();
		//Printing the array elements...
		System.out.println("Array Contents : ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//Printing the maximum number...
		int maxNumber = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(maxNumber < arr[i]){
				maxNumber = arr[i];
			}
		}
		
		System.out.println("Maximum number entered : " + maxNumber);
	}
}