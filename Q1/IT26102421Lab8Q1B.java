import java.util.Scanner;
public class IT26102421Lab8Q1B{
	public static void main(String[] args){
		
		int myArray[]=new int[5];
		int evenArray[]=new int[5];
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 5 numbers:");
		
		for(int i=0; i<myArray.length; i++){
			System.out.print("Enter number"+ (i+1)+ ":");
			 myArray[i] = input.nextInt();
		}
		
		int evenIndex=0;
		for(int i=0; i<myArray.length; i++){
			
			if(myArray[i]%2==0){
				evenArray[evenIndex]=myArray[i];
				evenIndex++;
			}
		}
		
		System.out.println("myArray Contents: ");
		
		for(int i=0; i<myArray.length; i++){
			System.out.print(evenArray[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("evenArray Contents: ");
		for(int i=0; i<evenArray.length; i++){
			System.out.print(evenArray[i] + " ");
		}
		System.out.println();
	}
}