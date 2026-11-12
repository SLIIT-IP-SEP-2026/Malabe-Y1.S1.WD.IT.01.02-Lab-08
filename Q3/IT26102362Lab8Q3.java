import java.util.Scanner;
public class IT26102362Lab8Q3{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		int numbers[] = new int[6];
		int i = 0, maximumNumber, number;
		
		while(i < numbers.length){
			System.out.print("Enter a Positive Number ("+(i+1)+"/6): ");
			number = input.nextInt();
			if(number <= 0){
				System.out.println("Erorr: Please Enter ONLY Positive Numbers");
				continue;
			}
			numbers[i] = number;
			i++;
		}
		
		maximumNumber = numbers[0];
		System.out.println("\nArray Contents: ");
		
		for(i=0; i<numbers.length; i++){
			System.out.print(numbers[i]+" ");
			if(maximumNumber < numbers[i]){
				maximumNumber = numbers[i];
			}
		}
		
		System.out.println("\nThe Maximum Number Entered: "+ maximumNumber);
	}
}