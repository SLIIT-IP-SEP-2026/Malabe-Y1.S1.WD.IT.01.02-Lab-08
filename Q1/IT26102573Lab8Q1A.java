import java.util.Scanner;
public class IT26102573Lab8Q1A{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[6];
		int i ;
		System.out.println("Enter 5 Numbers :");
		for( i = 1 ; i<=5 ; i++){

			System.out.print("Enter Number "+ i + " : ");
			num[i] = input.nextInt();
			
		}
		
		System.out.println("\nArray in Reverse Order : ");
		for(i = 5 ; i >= 1 ; i--){
			System.out.print(num[i] + " ");
		}
	}
}