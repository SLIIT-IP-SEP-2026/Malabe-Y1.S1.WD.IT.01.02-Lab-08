import java.util.Scanner;
public class  IT26102402Lab8Q3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[6];
		int i = 0;
		int number;
		
		while(i < 6){
			System.out.print("Enter a positive number ("+ (i+1) + "/6): ");
			number = input.nextInt();
			
			if (number>0){
				numbers[i] = number;
				i++;
			}else{
				System.out.println("Error: Please enter ONLY positive numbers");	
			}
			
		}
		
		System.out.println();
		System.out.println("Array Contents: ");
		
		int max = numbers[0];
		
		for(int y=0; y<6;y++){
			System.out.print(numbers[y]+ " ");
			
			if(numbers[y] > max){
				max = numbers[y];
			}
			
		}
		
		System.out.println();
		System.out.println("The maximum number entered: "+ max);
		
		

	}
}