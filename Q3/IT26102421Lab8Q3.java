import java.util.Scanner;
public class IT26102421Lab8Q3{
	public static void main(String[] args){
		
		int numberArray[] = new int[6];
		int numbercount=0;
		
		Scanner input=new Scanner(System.in);
		
		while(numbercount<6){
			
			System.out.print("Enter a positive number: ");
			int userInput=input.nextInt();
			
			if(userInput>0){
				numberArray[numbercount]=userInput;
				numbercount++;
			}
			else{
				System.out.println("Error: Please enter only positive numbers");
			}
		}
		int maxNumber=numberArray[0];
		
		for(int count=0; count<numberArray.length; count++){
			if(numberArray[count]>maxNumber){
				maxNumber=numberArray[count];
			}
		}
		
		System.out.println("\nArray Contents:");
		for(int count=0; count<numberArray.length; count++){
			System.out.print(numberArray[count]+" ");
		}
		
		System.out.println();
		
		System.out.println("The maximum number entered: "+maxNumber);
	}
}